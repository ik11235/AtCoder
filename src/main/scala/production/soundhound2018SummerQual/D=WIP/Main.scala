package production.soundhound2018SummerQual.D

import scala.collection.mutable

object Main extends App {

  val Array(n, m, s, t) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val money = 1000000000000000L
  //println(money)

  var map_yen = Array.fill(n + 1, n + 1)(-1)
  var map_snuuk = Array.fill(n + 1, n + 1)(-1)

  (1 to m).foreach { _ =>
    val Array(u, v, a, b) = scala.io.StdIn.readLine.split(" ").map(_.toInt)

    map_yen(u)(v) = a
    map_yen(v)(u) = a
    map_snuuk(u)(v) = b
    map_snuuk(v)(u) = b
  }

  //println(map_yen.deep)
  //println(map_snuuk.deep)

  (0 until n).foreach { i =>
    // i年目のスヌーク
    val pq = mutable.PriorityQueue.empty[(Long, Long, Int)] // snnuk, yen,now
    pq.enqueue((0, money, s))

    var memo_yen = Array.fill[Long](n + 1)(-1)
    var memo_snuuk = Array.fill[Long](n + 1)(-1)

    while (pq.nonEmpty) {
      println(pq)
      val now = pq.dequeue()

      if (memo_yen(s) == -1 && memo_snuuk(s) == -1) {
        //初期値なら今の値を入れる
        memo_snuuk(s) = now._1
        memo_yen(s) = now._2


        // 処理
        {
          // tについてなければ
          if (now._3 != t) {
            (1 to m).foreach { j =>
              // 両替せず円で
              if (map_yen(now._3)(j) != -1 && map_yen(now._3)(j) <= now._2) {
                pq.enqueue((now._1, now._2 - map_yen(now._3)(j), j))
              }

              // 両替せずスヌークで
              if (map_snuuk(now._3)(j) != -1 && map_snuuk(now._3)(j) <= now._1) {
                pq.enqueue((now._1 - map_snuuk(now._3)(j), now._2, j))
              }
            }
          }

          //両替する
          if (i < now._3) {
            pq.enqueue((now._1 + now._2, 0, now._3))
          }
        }

      } else {
        // 初期値じゃない & すでにどちらも少なければskip
        if (memo_snuuk(s) >= now._1 && memo_yen(s) >= now._2) {
          // skip
        } else {
          if (memo_snuuk(s) <= now._1 && memo_yen(s) <= now._2) {
            memo_snuuk(s) = now._1
            memo_yen(s) = now._2
          }

          // 処理
          {
            // tについてなければ
            if (now._3 != t) {
              (1 to m).foreach { j =>
                // 両替せず円で
                if (map_yen(now._3)(j) != -1 && map_yen(now._3)(j) <= now._2) {
                  pq.enqueue((now._1, now._2 - map_yen(now._3)(j), j))
                }

                // 両替せずスヌークで
                if (map_snuuk(now._3)(j) != -1 && map_snuuk(now._3)(j) <= now._1) {
                  pq.enqueue((now._1 - map_snuuk(now._3)(j), now._2, j))
                }
              }
            }

            //両替する
            if (i < now._3) {
              pq.enqueue((now._1 + now._2, 0, now._3))
            }
          }
        }
      }
    }
  }


}
