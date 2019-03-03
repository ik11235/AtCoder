package production.ABC120.A

object Main extends App {
  val Array(a, b, c) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  println(List(b / a, c).min)
}