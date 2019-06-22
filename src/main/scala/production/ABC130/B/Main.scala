package production.ABC130.B

object Main extends App {
  val Array(n, x) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val l = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  var ans = 1
  var now = 0
  l.foreach { i =>
    now += i
    if (now <= x) {
      ans += 1
    }
  }


  println(ans)
}
