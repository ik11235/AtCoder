package production.ABC185.B

object Main extends App {
  val Array(n, m, t) = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  var ans = true

  var nowbuttry = n
  var nowtime = 0
  (0 until m).foreach { _ =>
    val Array(a, b) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    nowbuttry -= a - nowtime
    if (nowbuttry <= 0) {
      ans = false
    }
    nowbuttry = List(nowbuttry + (b - a), n).min
    nowtime = b
  }
  nowbuttry -= t - nowtime
  if (nowbuttry <= 0) {
    ans = false
  }
  if (ans) {
    println("Yes")
  } else {
    println("No")
  }
}