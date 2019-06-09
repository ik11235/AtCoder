package production.ABC129.F_WIP

object Main extends App {
  val Array(l, a, b, m) = scala.io.StdIn.readLine.split(" ")
  var str = ""
  var next = BigInt(a)
  var bb = BigInt(b)
  var ll = BigInt(l)
  while (ll > 0) {
    str += next.toString
    next += bb
    ll -= 1
  }

  println(BigInt(str) % m.toInt)
}
