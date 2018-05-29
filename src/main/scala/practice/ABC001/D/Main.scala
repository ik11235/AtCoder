package practice.ABC001.D

object Main extends App {
  def dec(i: Int): Int = {
    i match {
      case ii if ii % 5 == 0 =>
        i
      case _ =>
        dec(i - 1)
    }
  }

  def inc(i: Int): Int = {
    i match {
      case ii if ii % 5 == 0 =>
        i
      case _ =>
        inc(i + 1)
    }
  }

  def seiki(i: Int): Int = {
    if (i % 100 == 60) {
      i + 100 - 60
    } else {
      i
    }
  }


  def canJoinRange(a: Range, b: Range): Boolean = (a intersect b).nonEmpty

  def joinRange(a: Range, b: Range): Range = {
    Range(List(a.start, b.start).min, List(a.end, b.end).max)
  }

  def marume(ss: String): (Int, Int) = {
    val Array(a, b) = ss.split("-").map(_.toInt)
    val aa = seiki(dec(a))
    val bb = seiki(inc(b))
    (aa, bb)
  }

  val n = scala.io.StdIn.readLine.toInt
  var rangeList = List[Range]()
  (1 to n).foreach { _ =>
    val ss = scala.io.StdIn.readLine
    val (a, b) = marume(ss)
    rangeList :+= Range(a, b + 1)
  }

  var loop = true
  while (rangeList.size > 1 && loop) {
    var nextRangeList = List[Range]()

    loop = false
    (0 to rangeList.size - 2).foreach { i =>
      if (canJoinRange(rangeList(i), rangeList(i + 1))) {
        loop = true
        nextRangeList :+= joinRange(rangeList(i), rangeList(i + 1))
      }
    }
    rangeList = nextRangeList
  }

  rangeList.foreach { range =>
    println(s"${range.start}-${range.end}")
  }
}
