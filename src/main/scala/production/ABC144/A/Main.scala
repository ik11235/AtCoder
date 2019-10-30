package production.ABC144.A

object Main extends App {
  val Array(a, b) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  if (a > 9 || b > 9) {
    println(-1)
  } else {
    println(a * b)
  }
}
