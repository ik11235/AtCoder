package production.ABC134.B

object Main extends App {
  val Array(n, d) = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  import scala.math.ceil

  println(ceil(n / (2.0 * d + 1)).toInt)
}
