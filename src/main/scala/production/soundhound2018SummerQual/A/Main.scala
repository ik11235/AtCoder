package production.soundhound2018SummerQual.A


object Main extends App {
  val Array(a, b) = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  if (a + b == 15) {
    println("+")

  } else if (a * b == 15) {
    println("*")
  } else {
    println("x")
  }
}