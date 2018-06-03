package practice.ABC003.A

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt

  println((1 to n).map(i => i * 10000 * (1.0 / n)).sum.toInt)
}
