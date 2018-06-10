package production.ABC099.B

object Main extends App {
  var list = Seq[Int](1)
  (2 to 999).foreach { i =>
    list :+= (i + list.last)
  }

  val Array(a, b) = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  var i: Int = 1

  while (true) {
    val x = list.indexWhere(_ == a + i)
    if (x != -1) {
      if (list(x + 1) == b + i) {
        println(i)
        System.exit(0)
      }
    }

    i = i + 1
  }
}
