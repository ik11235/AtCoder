package production.ABC216.A

object Main extends App {
  val Array(x, y) = scala.io.StdIn.readLine.split("\\.").map(_.toInt)
  if (y <= 2) {
    print(x)
    println("-")
  } else if (y <= 6) {
    print(x)
    println("")
  } else {
    print(x)
    println("+")
  }
}
