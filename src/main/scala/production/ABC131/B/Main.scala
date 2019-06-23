package production.ABC131.B

object Main extends App {
  val Array(n, l) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  var min = 9999
  var apple = List[Int]()
  (1 to n).foreach { i =>
    val now = l + i - 1
    apple = apple :+ now
    if (Math.abs(min) > Math.abs(now)) {
      min = now
    }
  }

  println(apple.sum - min)
}
