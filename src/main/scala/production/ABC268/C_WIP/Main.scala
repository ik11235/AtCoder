package production.ABC268.C_WIP

object Main extends App {

  val n = scala.io.StdIn.readLine.toInt
  val a = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  def exec(a: Array[Int]): Int = {
    a.zipWithIndex.count {
      case (aa, i) => aa == i || aa == ((i + 1) % n) || aa == ((i - 1) % n)
    }
  }

  var ans: Int = exec(a)
  var aa = a
  (1 until n).foreach { i =>
    val t = aa.last
    aa = aa.dropRight(1)
    aa = t  +: aa
    //println(aa.deep)
    val tmp = exec(aa)
    if (tmp > ans) {
      ans = tmp
    }
  }
  println(ans)
}
