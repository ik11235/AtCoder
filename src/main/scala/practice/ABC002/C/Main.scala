package practice.ABC002.C

object Main extends App {
  val Array(xa, ya, xb, yb, xc, yc) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val xdiff = -1 * xa
  val ydiff = -1 * ya
  val a = xb + xdiff
  val b = yb + ydiff
  val c = xc + xdiff
  val d = yc + ydiff
  println(Math.abs(a.toDouble * d - b.toDouble * c) / 2.0)
}