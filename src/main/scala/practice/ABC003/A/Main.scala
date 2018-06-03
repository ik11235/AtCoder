package practice.ABC003.A

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  var ans = 0.0

  (1 to n).foreach { i =>
    ans += i * 10000.0 * (1.0 / n)
  }
  println(ans.toInt)
}
