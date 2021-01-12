package com.aibee.leetcode.DP01

import scala.collection.mutable

object MapUse {
  def main(args: Array[String]): Unit = {
    val emptyMap : mutable.HashMap[String,Int] = new mutable.HashMap[String,Int]()
    val empyMapInt = new mutable.HashMap[Int, Int]()
    val immutableMap = Map(4 -> 8 , 5 -> 10)
    val map = immutableMap + (2 -> 4)
    emptyMap("3") = 20
    println(emptyMap.getOrElse("3",0))

    val stringToInt: mutable.Map[String, Int] = scala.collection.mutable.Map[String, Int]()



  }

}
