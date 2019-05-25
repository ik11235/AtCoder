package production.ABC127.B

object Main extends App {
  val Array(r, d, x) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  var xx = x
  (1 to 10).foreach { _ =>
    xx = r * xx - d
    println(xx)
  }
}
