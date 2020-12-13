package production.ABC185.A

object Main extends App {
  val a = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  println(a.min)
}
