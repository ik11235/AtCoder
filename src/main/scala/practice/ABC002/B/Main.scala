package practice.ABC002.B

object Main extends App {
  val w = scala.io.StdIn.readLine
  println(w.filterNot(c => c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o'))
}