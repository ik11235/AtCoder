package production.ABC267.D_WIP

object Main extends App {

  val Array(n, m) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val a = scala.io.StdIn.readLine.split(" ").map(_.toLong)

  //DPでは？
  // 前半がどうであれ、後半の配列のサイズが同じなら加算される値は同じ

  var emptyMap: Map[(Int, Int), Long] = Map.empty


  def exec(cnt: Int, now: Int): Long = {
    //    println(m - cnt + 1)
    //    println(n - now)

    if (emptyMap.contains((cnt, now))) {
      return emptyMap.get(cnt, now).get
    }
    if (cnt > m) {
      return 0
    }
    if (m - cnt + 1 == n - now) {
      val slice = a.slice(now, a.length)
      //println("cnt: " + cnt)
      //println("now: " + now)
      //println(slice.deep)
      var ccnt = cnt
      val ans = slice.map { vv =>
        val aa = vv * ccnt
        ccnt += 1
        aa
      }.sum
      emptyMap += ((cnt, now) -> ans)
      //println(ans)
      return ans
    }

    val ans = List(
      a(now) * cnt + exec(cnt + 1, now + 1),
      exec(cnt, now + 1),
    ).max
    emptyMap += ((cnt, now) -> ans)
    return ans
  }


  val ans = (0 to n - m).map { i =>
    val ans = a(i) + exec(2, i + 1)
    //println(ans)
    //println("====")
    ans
  }
  //println(emptyMap)
  println(ans.max)
}
