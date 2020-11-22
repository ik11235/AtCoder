package production.ABC184.B

object Main extends App {
  val Array(n, x) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val s = scala.io.StdIn.readLine
  var point = x

  s.foreach { c =>
    if (c != 'x') {
      point += 1
    } else {
      point = List(0, point - 1).max
    }
  }

  println(point)
}