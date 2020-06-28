package practice.ABC047.C

object Main extends App {
  val s = scala.io.StdIn.readLine

  var now = s(0)
  var b_cnt = 0
  var w_cnt = 0

  s.foreach { ch =>
    if (now != ch) {
      if (now == 'B') {
        b_cnt += 1
      } else {
        w_cnt += 1
      }
      now = ch
    }
  }
  if (now == 'B') {
    b_cnt += 1
  } else {
    w_cnt += 1
  }

  var memo: Map[(Int, Int, (Char, Char)), Int] = Map.empty

  def exec(wc: Int, bc: Int, top: (Char, Char)): Int = {
    memo.get((wc, bc, top)) match {
      case Some(ans) => ans
      case None =>

        if (wc == 0 || bc == 0) {
          return 0
        }

        var list = List[Int]()

        if (top._1 == 'W') {
          list = list.::(exec(wc - 1, bc, ('B', top._2)))
        }
        if (top._1 == 'B') {
          list = list.::(exec(wc, bc - 1, ('W', top._2)))
        }
        if (top._2 == 'W') {
          list = list.::(exec(wc - 1, bc, (top._1, 'B')))
        }
        if (top._2 == 'B') {
          list = list.::(exec(wc, bc - 1, (top._1, 'W')))
        }
        val newans = list.min + 1
        memo += ((wc, bc, top) -> newans)
        newans
    }
  }

  println(exec(w_cnt, b_cnt, (s.head, s.last)))
}
