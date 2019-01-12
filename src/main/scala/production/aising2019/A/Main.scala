package production.aising2019.A

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  val w = scala.io.StdIn.readLine.toInt
  val h = scala.io.StdIn.readLine.toInt
  println((n - (w - 1)) * (n - (h - 1)))
}