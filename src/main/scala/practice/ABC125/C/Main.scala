package practice.ABC125.C

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  val a = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  def gcd(x: Int, y: Int): Int = {
    if (y == 0) {
      x
    } else
      gcd(y, x % y)
  }

  var rr = List(a(0))
  var ll = List(a.last)
  (1 until n).foreach { i =>
    rr = rr :+ gcd(rr(i - 1), a(i))
  }

  (n - 2 to 0 by -1).foreach { i =>
    // println(i)
    ll = gcd(ll.head, a(i)) +: ll
  }
  var ans = List(rr(rr.length - 2), ll(1)).max
  //println((1 until n - 1))
  (1 until n - 1).foreach { i =>
    ans = List(ans, gcd(rr(i - 1), ll(i + 1))).max
  }
  println(ans)
}
