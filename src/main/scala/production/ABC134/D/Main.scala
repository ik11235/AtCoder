package production.ABC134.D


object Main extends App {

  import scala.collection.mutable

  val n = scala.io.StdIn.readLine.toInt
  val a = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  var data = mutable.TreeSet.empty[Int]

  var cnt = n

  def getOdd(cnt: Int): Boolean = {
    data.count { a => a % cnt == 0 } % 2 == 0
  }

  def getOdd2(cnt: Int): Boolean = {
    var sumcnt = 0
    var now = cnt + cnt
    while (now <= n) {
      if (data(now)) {
        sumcnt += 1
      }

      now += cnt
    }

    sumcnt % 2 == 0
  }

  while (cnt >= 1) {
    val array_cnt = cnt - 1
    // 偶数 or 奇数
    val odd = getOdd2(cnt)

    if (odd && a(array_cnt) == 0) {
      // 偶数 & 求めるのも偶数
      //何もしない
    } else if (odd && a(array_cnt) == 1) {
      // 偶数 & 求めるのは奇数
      data += cnt
    } else if (!odd && a(array_cnt) == 0) {
      // 奇数 & 求めるのは偶数
      data += cnt
    } else if (!odd && a(array_cnt) == 1) {
      // 奇数 & 求めるのは奇数
      // なにもしない
    }
    cnt -= 1
  }

  println(data.size)
  if (data.nonEmpty) {
    println(data.toList.sorted.mkString(" "))
  }
}
