object Main extends App {

  val mod = 1000000007

  def mul(a: Int, b: Int): Int = {
    ((a % mod) * (b % mod)) % mod
  }

  def add(a: Int, b: Int): Int = {
    (a + b) % mod
  }


  val Array(n, m) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  var a = Array.fill(n + 3)(0)

  (1 to m).foreach { _ =>
    val aa = scala.io.StdIn.readLine.toInt
    a(aa) = -99
  }
  a(0) = 1
  //println(a.deep)

  (0 to n).foreach { i =>
    val cnt = a(i)
    if (cnt != -99) {
      if (a(i + 1) != -99) {
        a(i + 1) = add(a(i + 1), cnt)
      }
      if (a(i + 2) != -99) {
        a(i + 2) = add(a(i + 2), cnt)
      }
    }
  }

  // println(a.deep)
  println(a(n))
}
