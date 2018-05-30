package practice.ABC002.A

object Main extends App {
  val Array(x, y) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  println(List(x, y).max)
}