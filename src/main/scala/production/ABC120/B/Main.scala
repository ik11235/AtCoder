package production.ABC120.B

object Main extends App {
  val Array(a, b, k) = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  println(1 to List(a, b).max filter (i => a % i == 0 && b % i == 0) reverse (k - 1))

}
