package production.ABC110.A

object Main extends App {
  val list = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList.sorted
  println(list(2) * 10 + list(1) + list(0))
}