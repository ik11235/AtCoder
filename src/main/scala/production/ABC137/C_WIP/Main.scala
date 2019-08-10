package production.ABC137.C_WIP


object Main extends App {
  val n = scala.io.StdIn.readLine.toInt

  val ab = new Array[String](n)
  (0 until n).foreach { i =>
    ab(i) = scala.io.StdIn.readLine.sorted
  }

  var ans = 0

  var c = 0
  while (c < n - 1) {

    var cc = c + 1
    while (cc < n) {
      if (ab(c) == ab(cc)) {
        ans += 1
      }
      cc += 1
    }
    c += 1
  }

  println(ans)
}