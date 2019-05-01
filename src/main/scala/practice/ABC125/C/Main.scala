package practice.ABC125.C

object Main extends App {

  import scala.annotation.tailrec
  import scala.math.max

  val n = scala.io.StdIn.readLine.toInt
  val a = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  @tailrec
  def gcd(x: Int, y: Int): Int = {
    if (y == 0) {
      x
    } else
      gcd(y, x % y)
  }

  var rr = new Array[Int](n)
  var ll = new Array[Int](n)
  rr(0) = a(0)
  ll(n - 1) = a.last

  (1 until n).foreach { i =>
    rr(i) = gcd(rr(i - 1), a(i))

    ll(n - 1 - i) = gcd(ll(n - i), a(n - 1 - i))
  }

  var ans = List(rr(n - 2), ll(1)).max

  (1 until n - 1).foreach { i =>
    ans = max(ans, gcd(rr(i - 1), ll(i + 1)))
  }

  println(ans)
}