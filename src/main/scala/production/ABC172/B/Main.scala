package production.ABC172.B

object Main extends App {
  val s = scala.io.StdIn.readLine
  val t = scala.io.StdIn.readLine

  var cnt = 0
  (0 to (s.length - 1)).foreach { i =>
    if (s(i) != t(i)) {
      cnt += 1
    }
  }
  println(cnt)
}