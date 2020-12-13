package production.ABC185.D_WIP

object Main extends App {
  val Array(n, m) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  var now = 1
  var li = List.empty[Int]
  var min = n
  if (m > 0) {
    val a = scala.io.StdIn.readLine.split(" ").map(_.toInt).sorted

    a.foreach { a2 =>
      /// println(a2 - now)
      if ((a2 - now) >= 1) {
        li :+= (a2 - now)
        min = List(min, (a2 - now)).min
      }
      now = a2 + 1
      //println("now:" + now)
    }
    if (n - now >= 1) {
      li :+= (n - now)
      min = List(min, (n - now)).min
    }

    import scala.math.ceil
    //println(li)
    println(li.map { tt =>
      ceil(tt.toFloat / min).toInt
    }.sum)

  } else {
    println(1)
  }
}
