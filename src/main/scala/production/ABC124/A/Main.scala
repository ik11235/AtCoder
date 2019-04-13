package production.ABC124.A

object Main extends App {
  val Array(a, b) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  if (a > b) {
    println(a + List(a - 1, b).max)
  } else {
    println(b + List(a, b - 1).max)

  }
}