package production.ABC182.B

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  val a = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  var ans = 0
  var cnt = 0
  (2 to a.max + 1).foreach { i =>
    val tmp = a.count(ii => ii % i == 0)
    if (cnt < tmp) {
      cnt = tmp
      ans = i
    }
  }
  println(ans)
}