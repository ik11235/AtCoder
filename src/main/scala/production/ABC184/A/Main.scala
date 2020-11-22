package production.ABC184.A

object Main extends App {
  val Array(a, b) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val Array(c, d) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  println(a * d - b * c)
}
