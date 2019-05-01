package practice.ABC003.C

object Main extends App {
  val Array(n, k) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val r = scala.io.StdIn.readLine.split(" ").map(_.toInt).sorted
  var rate = 0.0

  val start = n - k
  (start until n).foreach { i =>
    rate = (rate + r(i)) / 2
  }

  println(rate)
}