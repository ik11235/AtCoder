package production.ABC150.C

object Main extends App {

  val n = scala.io.StdIn.readLine.toInt
  val p = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList
  val q = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList

  var pp = 0
  var qq = 0
  var cnt = 1

  (1 to n).toList.permutations.foreach { aa =>
    if (p == aa) {
      pp = cnt
    }
    if (q == aa) {
      qq = cnt
    }
    cnt += 1
  }
  println(Math.abs(pp - qq))
}
