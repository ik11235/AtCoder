package production.ABC182.D_WIP

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  val a = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  var aa = a
  var ans = BigInt(0)
  /// 末尾のマイナスはエミュレート不要
  // 正の数字でもより大きいマイナスが前にいればエミュレート不要
  // これで削っていく
  // 最後は掛け算
  //↑　まちがい

  // 1つ前の数までの合計が、今の値のマイナスより大きければ必要
  var sum = a.map(BigInt(_)).sum - aa.last
  //while (aa.nonEmpty && Math.abs(aa.last) < sum) {
  while (aa.nonEmpty && Math.abs(aa.last) < sum) {
    //1回目
    //sumの利益が小さいから削除
    // 2回目
    // sumの利益が大きいから残す
    //1 <> -2
    //2 <> -1
    /*
        println("1====-")
        println(sum)
        println(aa.last)
        println("1====---")
    */
    aa = aa.dropRight(1)
    sum = sum - aa.last
    /*
    println("====-")
    println(sum)
    println(aa.last)
    println("====---")
    println(aa.deep)
    */
  }

  var ans_tmp = aa.zipWithIndex.map { case (xx: Int, i: Int) =>
    BigInt(xx) * (aa.length - i)
  }.sum
  if (ans_tmp > ans) {
    ans = ans_tmp
  }
  var ans_tmp2 = ans_tmp

  aa.reverse.foreach { xx =>
    ans_tmp -= xx
    if (ans_tmp > ans) {
      ans = ans_tmp
    }
  }

  if (aa.length < a.length) {
    // 削ってた場合最後の1回をエミュレート
    aa.foreach { xx =>
      ans_tmp2 += xx
      if (ans_tmp2 > ans) {
        ans = ans_tmp2
      }
    }
  }

  println(ans)
}
