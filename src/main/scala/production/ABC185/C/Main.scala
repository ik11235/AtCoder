package production.ABC185.C

object Main extends App {

  import scala.math.BigInt

  val l = scala.io.StdIn.readLine.toInt

  var memo: Map[(Int, Int), BigInt] = Map.empty

  def tos(l: Int, i: Int): String = {
    "l:" + l + " i:" + i
  }

  def exec(l: Int, i: Int): BigInt = {
    //println(l + " " + i)
    if (i == 1) {
      return 1
    }
    if (l == i) {
      return 1
    }
    if (memo.isDefinedAt((l, i))) {
      return memo((l, i))
    }

    var ans: BigInt = 0
    var ll = l - 1
    val ii = (i - 1)
    while (ll >= ii) {
      val kekka = exec(ll, ii)
      //println(tos(l, i) + "+kekka:" + kekka)

      ans = ans + kekka
      //println(tos(l, i) + "+ans:" + ans)
      ll -= 1
    }

    memo += ((l, i) -> ans)
    ans
  }

  println(exec(l, 12))
 // println(memo)
}
