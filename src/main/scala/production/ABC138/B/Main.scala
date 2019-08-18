package production.ABC138.B

object Main extends App {
  val n = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val a = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList
  var sum = 0.0
  a.foreach { aa =>
    sum += (1.0 / aa)
  }
  println(1 / sum)
}
