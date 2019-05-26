package production.ABC128.C

object Main extends App {
  val Array(n, m) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val k = (1 to m).map { _ =>
    scala.io.StdIn.readLine.split(" ").map(_.toInt).drop(1)
  }
  val p = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  var ans = 0
  (0 to n).foreach { i =>
    val l = Array.fill(i)(true) ++ Array.fill(n - i)(false)
    //l.permutations.foreach(a => println(a.mkString(",")))

    l.permutations.foreach { flaglist =>
     // println(flaglist.mkString(","))
      val xx = (0 until m).forall { j =>
        // println(j)
        //println(k(j).deep)
        val cnt = k(j).count { cnts =>
          // println(s"Cnt:${cnts}")
          //println()
          //println(s"l:${flaglist(cnts - 1)}")
          flaglist(cnts - 1)
        }

        //  println(cnt)
        //println(cnt % 2)
        //        println(p(j))
        cnt % 2 == p(j)
      }
      //    println(xx)
      if (xx) {
        ans += 1
      }
    }
  }
  println(ans)
}

/*
false,false,true,false,false
true
*/