package com.aibee.leetcode.DP01

object SCRobber01 {
  private var  arr : Array[Int]= _
  arr = Array(4,3,2,8,100)
  private val inclusive: Range.Inclusive = 1 to 10
  def main(args: Array[String]): Unit = {
    print(roudr(arr))
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
  def roudr(ints : Array[Int]):Int = {
    if(ints.length == 1){

    }
    Math.max(robberround(ints,0,ints.length - 2),robberround(ints,1,ints.length - 1))
  }
  def robberround(ints:Array[Int],first:Int,last:Int):Int = {
    var nu1: Int = 0
    var nu2: Int = 0
    for (i <- first to last ) {
      var curr : Int = 0
      curr = Math.max(nu1,nu2 + ints(i))
      nu2 = nu1
      nu1 = curr
    }
    nu1
  }
}
