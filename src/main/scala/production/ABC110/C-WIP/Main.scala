package production.ABC110.C

object Main extends App {
  val s = scala.io.StdIn.readLine
  val t = scala.io.StdIn.readLine

  var maps: Set[String] = Set()
  var ss = s

  while (true) {
    if (ss == t) {
      println("Yes")
      sys.exit()
    }
    if (maps(ss)) {
      println("No")
      sys.exit()
    } else {
      maps = maps + ss

      var index = -1
      var aa: Char = ' '
      var bb: Char = ' '

      (0 until ss.length).foreach { i =>
        if (index == -1 && ss(i) != t(i)) {
          index = i
          aa = ss(index)
          bb = t(index)
        }


      }


      var new_ss = ""
      (0 until ss.length).foreach { i =>
        if (ss(i) == aa) {
          new_ss = new_ss + bb
        } else if (ss(i) == bb) {
          new_ss = new_ss + aa
        } else {
          new_ss = new_ss + ss(i)
        }
      }
      ss = new_ss
      println(ss)
    }
  }
}
