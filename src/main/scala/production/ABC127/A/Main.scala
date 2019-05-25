package production.ABC127.A

object Main extends App {
  val Array(a, b) = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  if (a >= 13) {
    println(b)
  } else if (a >= 6) {
    println(b / 2)
  } else {
    println(0)
  }
}
