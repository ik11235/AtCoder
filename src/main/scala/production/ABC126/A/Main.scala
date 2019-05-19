package production.ABC126.A

object Main extends App {
  val Array(a, b) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  var s = scala.io.StdIn.readLine

  println(s.patch(b - 1, s(b - 1).toLower.toString, 1)
  )
}