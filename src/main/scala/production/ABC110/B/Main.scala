package production.ABC110.B

object Main extends App {
  val Array(n, m, x, y) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val x_list = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList
  val y_list = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList

  var ans = false

  (x + 1 until y).foreach { z =>
    if (ans || (x_list.forall(_ < z) && y_list.forall(_ >= z))) {
      ans = true
    }
  }


  if (ans) {
    println("No War")
  } else {
    println("War")
  }
}
