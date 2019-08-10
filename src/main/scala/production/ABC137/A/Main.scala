package production.ABC137.A

object Main extends App {
  val Array(a, b) = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  println(List(a + b, a - b, a * b).max)
}
