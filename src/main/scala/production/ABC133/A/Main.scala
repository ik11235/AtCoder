package production.ABC133.A

object Main extends App {
  val Array(n, a, b) = scala.io.StdIn.readLine.split(" ").map(_.toInt)


  println(List(a * n, b).min)
}
