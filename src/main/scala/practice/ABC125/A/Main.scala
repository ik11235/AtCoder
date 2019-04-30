package practice.ABC125.A

object Main extends App {
  val Array(a, b, t) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  println(t / a * b)
}
