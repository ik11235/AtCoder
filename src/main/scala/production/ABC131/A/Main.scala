package production.ABC131.A

object Main extends App {
  val d = scala.io.StdIn.readLine

  if (d(0) == d(1) ||
    d(1) == d(2) ||
    d(2) == d(3)
  ) {
    println("Bad")
  } else {
    println("Good")
  }
}
