package practice.ABC121.B

object Main extends App {
  val Array(n, m, c) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val b = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  val ans = (0 until n).map { _ =>
    val a = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    val sum = (0 until m).map { i =>
      a(i) * b(i)
    }.sum + c
    if (sum > 0) {
      1
    } else {
      0
    }
  }.sum

  println(ans)
}
