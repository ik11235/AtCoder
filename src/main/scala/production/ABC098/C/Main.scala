package production.ABC098.C

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  val s = scala.io.StdIn.readLine
  var arr1 = Array.fill[Int](n)(0)
  var arr2 = Array.fill[Int](n)(0)
  var cnt = n

  arr1(0) = 0

  // 0人目をリーダーに
  cnt = s.takeRight(n - 1).count(_ == 'E')
  arr2(0) = cnt

  (1 until n).foreach { x =>
    if (s.charAt(x - 1) == 'W') {
      arr1(x) = arr1(x - 1) + 1
    } else {
      arr1(x) = arr1(x - 1)
    }

    if (s.charAt(x) == 'E') {
      arr2(x) = arr2(x - 1) - 1
    } else {
      arr2(x) = arr2(x - 1)
    }

    cnt = List(cnt, arr1(x) + arr2(x)).min
  }
}
