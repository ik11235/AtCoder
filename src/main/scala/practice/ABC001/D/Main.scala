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

  def countUp(i: Int): Int = {
    seiki(i + 1)
  }


  def marume(ss: String): (Int, Int) = {
    val Array(a, b) = ss.split("-").map(_.toInt)
    val aa = seiki(dec(a))
    val bb = seiki(inc(b))
    (aa, bb)
  }

  var timer = Array.fill[Boolean](2401)(false)
  val n = scala.io.StdIn.readLine.toInt
  (1 to n).foreach { _ =>
    val ss = scala.io.StdIn.readLine
    val (a, b) = marume(ss)
    (a to b).foreach { i =>
      timer(i) = true
    }
  }

  var count = 0
  var printnow = false
  while (count <= 2400) {
    if (!printnow && timer(count)) {
      print("%04d".format(count))
      printnow = true
    } else if (printnow && !timer(count)) {
      println("-%04d".format(count - 1))
      printnow = false
    } else if (printnow && count == 2400) {
      println(s"-2400")
      printnow = false
    }
    count = countUp(count)
  }
}
