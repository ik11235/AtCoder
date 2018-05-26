package production.ABC098.A

object Main extends App {
  val Array(h1, h2) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  println(List(h1 + h2, h1 - h2, h1 * h2).max)
}
