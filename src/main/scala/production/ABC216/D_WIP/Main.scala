package production.ABC216.D_WIP

object Main extends App {
  val Array(n, m) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  var cnt = Map[Int, Int]()
  var label = Map[Int, Int]()
  val k = (0 until m).map { _ =>
    scala.io.StdIn.readLine.split(" ").map(_.toInt)
  }
  var sums = 0
  var ans = true
  while (ans && sums < n * 2) {
  }


  if (ans) {
    println("Yes")
  } else {
    println("No")
  }
}
