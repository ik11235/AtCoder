package practice.codefestival2016QualB.B

object Main extends App {
  val Array(n, a, b) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val s = scala.io.StdIn.readLine
  var aa = 0
  var bb = 0

  s.foreach {
    case 'a' =>
      if ((aa + bb) < (a + b)) {
        println("Yes")
        aa += 1
      } else {
        println("No")

      }
    case 'b' =>
      if ((aa + bb) < (a + b) && bb < b) {
        println("Yes")
        bb += 1
      } else {
        println("No")
      }
    case 'c' =>
      println("No")
  }
}
