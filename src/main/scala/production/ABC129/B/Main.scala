package production.ABC129.B

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  val w = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  var ans = 999999
  (1 until w.length).foreach { i =>
    val a = w.splitAt(i)

    ans = List(Math.abs(a._1.sum - a._2.sum), ans).min
  }
  println(ans)
}
