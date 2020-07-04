package practice.ABC086.B

object Main extends App {
  val Array(a, b) = scala.io.StdIn.readLine.split(" ")
  val ab = (a + b).toInt

  import scala.math.sqrt

  val sq = sqrt(ab).toInt

  if (sq * sq == ab) {
    println("Yes")
  } else {
    println("No")
  }
}
