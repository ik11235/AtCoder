package production.ABC129.A

object Main extends App {
  val d = scala.io.StdIn.readLine.split(" ").map(_.toInt).sorted

  println(d(0)+d(1))
}
