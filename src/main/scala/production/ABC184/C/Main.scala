package production.ABC184.C


object Main extends App {

  import scala.math.BigInt
  import scala.math.Numeric.BigIntIsIntegral.abs


  val Array(r1, c1) = scala.io.StdIn.readLine.split(" ").map(BigInt(_))
  val Array(r2, c2) = scala.io.StdIn.readLine.split(" ").map(BigInt(_))

  def kyori(x1: BigInt, y1: BigInt, x2: BigInt, y2: BigInt): BigInt = {
    //println(abs(x1 - x2) + abs(y1 - y2))
    abs(x1 - x2) + abs(y1 - y2)
  }

  def kousa(x1: BigInt, y1: BigInt, x2: BigInt, y2: BigInt): Boolean = {
    val kyori1 = x2 - x1
    val yy1 = y1 + kyori1
    //println("kyori1:" + kyori1)
    //println("yy1:" + yy1)
    if (kyori(x2, yy1, x2, y2) <= 3) {
      return true
    }

    val kyori11 = x1 - x2
    val yy11 = y1 - kyori11
    //println("kyori1:" + kyori1)
    //println("yy1:" + yy1)
    if (kyori(x2, yy11, x2, y2) <= 3) {
      return true
    }


    val kyori2 = y2 - y1
    val xx1 = x1 + kyori2
    // println("kyori2:" + kyori2)
    // println("xx1:" + xx1)
    if (kyori(xx1, y2, x2, y2) <= 3) {
      return true
    }

    val kyori22 = y1 - y2
    val xx11 = x1 + kyori22
    // println("kyori2:" + kyori2)
    // println("xx1:" + xx1)
    if (kyori(xx11, y2, x2, y2) <= 3) {
      return true
    }


    return false
  }

  var ans = 3
  if ((abs(r1 - r2) + abs(c1 - c2)) % 2 == 0) {
    ans = 2
  }
  if (kousa(r1, c1, r2, c2)) {
    // 線分と点の距離が3以内
    ans = 2
  }
  if (kyori(r1, c1, r2, c2) <= 6) {
    //ユーグリット距離が6以内
    ans = 2
  }
  if (r1 + c1 == r2 + c2 || r1 - c1 == r2 - c2) {
    //　無限の斜めでヒットする
    ans = 1
  }
  if (kyori(r1, c1, r2, c2) <= 3) {
    ans = 1
  }
  if (r1 == r2 && c1 == c2) {
    ans = 0
  }
  /*

  if (r1 == r2 && c1 == c2) {
    println(0)
  } else if (kyori(r1, c1, r2, c2) <= 3) {
    //ユーグリット距離が3以内
    println(1)
  } else if (r1 + c1 == r2 + c2 || r1 - c1 == r2 - c2) {
    //　無限の斜めでヒットする
    println(1)
  } else if (kyori(r1, c1, r2, c2) <= 6) {
    //ユーグリット距離が6以内
    println(2)
  } else if (kousa(r1, c1, r2, c2)) {
    // 線分と点の距離が3以内
    println(2)
  } else if ((abs(r1 - r2) + abs(c1 - c2)) % 2 == 0) {
    // 無限の斜めが交差する
    // 奇数だったら交差しない
    println(2)
  } else {
    println(3)
  }
   */
  println(ans)
}
