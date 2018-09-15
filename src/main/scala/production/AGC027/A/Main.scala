package production.AGC027.A

object Main extends App {
  val Array(n, x) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val data = scala.io.StdIn.readLine.split(" ").map(_.toInt).sorted.reverse
  val ldata = data.map(_.toLong).toList

  if (ldata.sum == x) {
    println(n)
  } else {
    if (x > ldata.sum) {
      println(n - 1)
    } else {
      var sumSize = ldata.sum
      var cnt = n
      ldata.foreach { i =>
        if (x < sumSize) {
          sumSize -= i
          cnt -= 1
        }
      }
      println(cnt)
    }
  }
}
