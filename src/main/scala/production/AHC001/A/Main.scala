package production.AHC001.A

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  (1 to n).foreach { i =>
    val Array(x, y, r) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    println(x + " " + y + " " + (x + 1) + " " + (y + 1))
  }
}
