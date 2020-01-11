package production.ABC150.B

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  val s = scala.io.StdIn.readLine
  var cnt = 0
  (0 to s.length - 3).foreach { i =>
    if (s(i) == 'A' && s(i + 1) == 'B' && s(i + 2) == 'C')
      cnt += 1
  }
  println(cnt)
}
