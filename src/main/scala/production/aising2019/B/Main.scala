package production.aising2019.B

object Main extends App {
  val n = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val Array(a, b) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val p = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList

  println(List(p.count(_ <= a), p.count(i => i > a && i <= b), p.count(b < _)).min)
}
