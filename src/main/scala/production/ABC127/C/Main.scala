package production.ABC127.C

object Main extends App {
  val Array(n, m) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  var min = 1
  var max = n
  (1 to m).foreach { _ =>
    val Array(l, r) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    min = List(min, l).max
    max = List(max, r).min
  }

  if (max >= min) {
    println(max - min + 1)
  } else {
    println(0)
  }
}
