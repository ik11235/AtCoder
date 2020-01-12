package production.ABC151.D_WIP

object Main extends App {

  val Array(h, w) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val s = (1 to h).map { i =>
    scala.io.StdIn.readLine
  }

  var map_data = Map.empty[(Int, Int), Map[(Int, Int), Int]]
  // h 高さ y j
  // w 幅 x i

  def exec(startx: Int, starty: Int, i: Int, j: Int, cnt: Int, maps: Map[(Int, Int), Int]): Map[(Int, Int), Int] = {
    if (maps.isDefinedAt((i, j))) {
      return Map.empty
    }
    //if ()

    val new_maps = maps + ((i, j) -> 0)
  }

  (0 until h).foreach { j =>
    (0 until w).foreach { i =>
      map_data.updated((i, j), exec(i, j, i, j, 0, Map.empty))
    }
  }
  println(s)
}
