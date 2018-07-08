package production.soundhound2018SummerQual.B

object Main extends App {
  val s = scala.io.StdIn.readLine
  val w = scala.io.StdIn.readLine.toInt

  var i = 0
  while (s.length > i) {
    print(s(i))
    i += w
  }
  println("")
}
