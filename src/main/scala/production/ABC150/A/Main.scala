package production.ABC150.A

object Main extends App {
  val Array(k, x) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  if (500 * k >=x) {
    println("Yes")
  } else {
    println("No")
  }
}
