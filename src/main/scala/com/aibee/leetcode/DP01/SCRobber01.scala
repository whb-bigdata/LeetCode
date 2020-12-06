package com.aibee.leetcode.DP01

object SCRobber01 {
  private var  arr : Array[Int]= _
  arr = Array(1,2,3,4)
  private val inclusive: Range.Inclusive = 1 to 10
  def main(args: Array[String]): Unit = {
    print(robber(arr))
  }

  def robber(ints: Array[Int]): Int = {
    var nu1: Int = 0
    var nu2: Int = 0
    for (elem <- ints) {
      var curr : Int = 0
      curr = Math.max(nu1,nu2 + elem)
      nu2 = nu1
      nu1 = curr
    }
    nu1
  }
}
