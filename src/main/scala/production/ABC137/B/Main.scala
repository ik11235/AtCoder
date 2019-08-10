package production.ABC137.B

object Main extends App {
  val Array(k, x) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val a = ((x - (k - 1) to x + (k - 1)).toList.mkString(" "))
  println(a)
}
