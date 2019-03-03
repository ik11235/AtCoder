package production.ABC120.C

object Main extends App {
  val s = scala.io.StdIn.readLine
  println(List(s.count(_ == '0') * 2, s.count(_ == '1') * 2).min)
}