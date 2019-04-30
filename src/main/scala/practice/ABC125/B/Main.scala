package practice.ABC125.B

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  val v = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val c = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  println((0 until n).map(i => List(v(i) - c(i), 0).max).sum)
}
