package production.ABC124.D_WIP

object Main extends App {
  val Array(n, k) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val s = scala.io.StdIn.readLine

  def exec(datalist: List[(Char, Int)], k: Int): List[(Char, Int)] = {
    //println(datalist)
    if (k <= 0) {
      datalist
    } else if (datalist.length < 2) {
      datalist
    } else {
      var idx: Int = 0
      var sumcnt: Int = 0

      (1 to datalist.length - 3).foreach { i =>
        if (datalist(i)._1 == '1' && datalist(i + 1)._1 == '0' && datalist(i + 2)._1 == '1') {
          //大前提

          val tmpsum = datalist(i)._2 + datalist(i + 1)._2 + datalist(i + 2)._2
          if (tmpsum > sumcnt) {
            idx = i + 1
            sumcnt = tmpsum
          }
        }
      }

      // 先頭と末尾は例外(先頭と末尾は10 or 01で可)で010になる組の最大を探す
      // 先頭
      if (datalist(0)._1 == '0' && datalist(1)._1 == '1') {
        //大前提
        val tmpsum = datalist(0)._2 + datalist(1)._2
        if (tmpsum > sumcnt) {
          return exec(('1', tmpsum) +: datalist.tail.tail, k - 1)
        }
      }

      // 末尾
      if (datalist(datalist.length - 2)._1 == '1' && datalist(datalist.length - 1)._1 == '0') {
        // 大前提
        val tmpsum = datalist(datalist.length - 2)._2 + datalist(datalist.length - 1)._2
        if (tmpsum > sumcnt) {
          return exec(datalist.init.init :+ ('1', tmpsum), k - 1)
        }
      }

      //途中抜けの場合
      exec(datalist.slice(0, idx - 1) ++ List(('1', sumcnt)) ++ datalist.slice(idx + 2, 9999999), k - 1)
    }
  }

  def run(k: Int, s: String): Int = {
    val n = s.length

    if ((n + 1) / 2 <= k) {
      n
    } else {
      // 111000111 の最長の真ん中を反転させる
      // 最初にデータを変換する
      // => 1-3 0-3 1-3 みたいに
      var datalist: List[(Char, Int)] = List()
      var buf: (Char, Int) = (s.head, 1)
      val news = s.tail
      news.foreach { ch =>
        if (ch == buf._1) {
          buf = (buf._1, buf._2 + 1)
        } else {
          datalist :+= buf
          buf = (ch, 1)
        }
      }
      datalist :+= buf

      //println(datalist)

      val anslist: List[(Char, Int)] = exec(datalist, k)

      anslist.filter(_._1 == '1').map(_._2).max
    }
  }

  println(run(k, s))
}