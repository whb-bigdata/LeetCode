package com.aibee.leetcode.DP01

object SCNumsum02 {

  def main(args: Array[String]): Unit = {
    val arr = Array(2, 7, 11, 15)
    print(sumnum(arr,17).toList)
  }

  def sumnum(args: Array[Int],sum:Int): Array[Int] = {
    var arr = scala.collection.mutable.Map[Int, Int]()
    for (a <- 0 to args.length - 1 ) {
      if(arr.getOrElse(args(a),"-1").equals("-1")){
      arr += ((sum - args(a)) -> a)
      }else{
      return Array(arr.getOrElse(args(a),-1),a)
      }
    }

    Array()
  }
}
