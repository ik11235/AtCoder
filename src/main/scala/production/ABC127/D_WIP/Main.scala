package production.ABC127.D_WIP

object Main extends App {

  val Array(n, m) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  var a = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  (1 to m).foreach { _ =>
    val Array(b, c) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    (1 to b).foreach { _ =>
      a = a :+ c
    }
  }

  println(a.sorted.takeRight(n).map(_.toLong).sum)

  /*
    var tree = scala.collection.immutable.TreeSet.empty[Long]
    val Array(n, m) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    val a = scala.io.StdIn.readLine.split(" ").map(_.toLong)
    tree = tree ++ a

    (1 to m).foreach { _ =>
      val Array(b, c) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
      val rr = tree range(1, c)
      println("rr:" + rr)
      if (rr.size <= b) {
        tree = tree.drop(rr.size) ++ List.fill(rr.size)(c.toLong)
      } else {
        val ee: List[Long] = List.fill(b)(c.toLong)
        println(tree.drop(b) ++ ee.toSet)
        tree = tree.drop(b) ++ List.fill(b)(c.toLong)
      }
      println(tree)
    }

    println(tree.sum)
    */

  /*

  val Array(n, m) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  var a = scala.io.StdIn.readLine.split(" ").map(_.toLong).sorted
  (1 to m).foreach { _ =>
    val Array(b, c) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    (1 to b).foreach { _ =>
      if (a.head < c) {
        a = (c.toLong +: a.tail).sorted
      }
     // println(a.deep)
    }
  }


  println(a.sum)

   */
}
