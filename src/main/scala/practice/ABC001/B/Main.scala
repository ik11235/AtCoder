package practice.ABC001.B

object Main extends App {
  val m = scala.io.StdIn.readLine.toInt
  val a = m / 1000.0 match {
    case mm if mm > 70 =>
      89
    case mm if mm >= 35 =>
      ((mm - 30) / 5).toInt + 80
    case mm if mm >= 6 =>
      mm + 50
    case mm if mm >= 0.1 =>
      mm * 10
    case mm =>
      0
  }

  if (a < 10) {
    println("0" + a.toInt)
  } else {
    println(a.toInt)
  }
}
