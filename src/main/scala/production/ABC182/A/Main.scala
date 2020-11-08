package production.ABC182.A

object Main extends App {
  val Array(a, b) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  println((2 * a + 100) - b)
}
