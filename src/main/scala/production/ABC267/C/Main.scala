package production.ABC267.C

object Main extends App {

  val Array(n, m) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val a = scala.io.StdIn.readLine.split(" ").map(_.toLong)

  val slice = a.slice(0, m)
  var sum = slice.zipWithIndex.map { x => (x._2 + 1) * x._1 }.sum
  var minus = slice.sum
  var beforesum = sum
  (1 to n - m ).foreach { i =>
    //println("xx:" + (i + m - 1))
    var tmpsum = beforesum - minus + a(i + m - 1) * m
    //println(beforesum + "-" + minus + "+" + a(i + m - 1) + "*" + m)
    minus = minus - a(i - 1) + a(i + m - 1)
    //println(tmpsum)
    //println("minus:" + minus)
    sum = List(sum, tmpsum).max
    beforesum = tmpsum
  }
  println(sum)
  /*
  println("==========")
  val ans = (0 to n - m).map { i =>
    val aa = a.slice(i, m + i)
    val sum2 = aa.zipWithIndex.map { x =>
      (x._2 + 1) * x._1
    }.sum
    println(aa.deep)
    println(sum2)
    sum2
  }
  println(ans.max)
*/
}
