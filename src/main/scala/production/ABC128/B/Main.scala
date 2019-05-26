package production.ABC128.B

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  val sn = (1 to n).map { i =>
    val Array(s, n) = scala.io.StdIn.readLine.split(" ")
    (s, n, i)
  }

  val ans = sn.sortWith {
    (a, b) =>
      if (a._1 != b._1) {
        a._1 < b._1
      } else {
        a._2.toInt > b._2.toInt
      }
  }

  ans.foreach(i => println(i._3))
}
