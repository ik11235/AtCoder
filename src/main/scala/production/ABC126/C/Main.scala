package production.ABC126.C

object Main extends App {
  val Array(n, k) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  var ans = 0.0

  (1 to n).foreach { i =>
    if (i >= k) {
      ans += 1 / n.toDouble
    } else {
      var cnt = 0
      var sum = i
      while (sum < k) {
        cnt += 1
        sum *= 2
      }
      ans += Math.pow(0.5, cnt) / n.toDouble
    }
  }

  println(ans)
}