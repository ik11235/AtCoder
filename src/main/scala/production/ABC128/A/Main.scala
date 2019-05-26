package production.ABC128.A

object Main extends App {
  val Array(a, p) = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  println((a * 3 + p) / 2)
}
