package production.ABC216.B

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  var m = Map[String, Boolean]()
  var ans = false
  (0 until n).foreach { _ =>
    val s = scala.io.StdIn.readLine
    if (m.contains(s)) {
      ans = true
    }
    m += (s -> true)
  }
  if (ans) {
    println("Yes")
  } else {
    println("No")
  }
}