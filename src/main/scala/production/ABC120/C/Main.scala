package production.ABC120.C

object Main extends App {
  val s = scala.io.StdIn.readLine
  println(List(s.count(_ == '0') * 2, s.count(_ == '1') * 2).min)
}

/*
object Main extends App {
  /* このあたりはmemoに初期値として登録しておく
   if (ss.length <= 1) {
          memo = memo + (ss -> ss)
          ss
        } else if (ss.length == 2) {
          if (ss == "01" || ss == "10") {
            memo = memo + (ss -> ss)
            ""
          } else {
            ss
          }
        }
   */
  var memo: Map[String, String] = Map("" -> "", "0" -> "0", "1" -> "1", "01" -> "", "10" -> "", "00" -> "00", "11" -> "11")

  val s = scala.io.StdIn.readLine

  def check(ss: String): String = {
    memo.get(ss) match {
      case Some(sss) => sss
      case None =>
        if (ss.forall(_ == '0') || ss.forall(_ == '1')) {
          memo = memo + (ss -> ss)
          return ss
        }

        var ans = ss
        (0 until ss.length - 1).foreach { i =>
          //  println(s"${s}: ${i}")
          if (ss(i) != ss(i + 1)) {
            val tmp = check(ss.substring(0, i) + ss.substring(i + 2))
            if (tmp.length < ans.length) {
              ans = tmp
            }
          }
        }
        memo = memo + (ss -> ans)

        ans

    }

  }

  println(s.length - check(s).length)
}
*/