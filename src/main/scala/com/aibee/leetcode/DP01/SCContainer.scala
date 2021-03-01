package com.aibee.leetcode.DP01

import scala.collection.mutable

/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，
 * 垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器。
 *
 */
object SCContainer {
  var water = Array(5, 2, 3, 4, 5)

  def main(args: Array[String]): Unit = {
  print(test())
  }

  def maxArea(height: Array[Int]): Int = {
    var sum = 0
    val arr = new Array[Int](2)
    for (i <- 0 until height.length) {
      for (j <- i + 1 until height.length) { //sum = Math.min(height[i], height[j]) * (j - i);
        if (Math.min(height(i), height(j)) * (j - i) > sum) {
          sum = Math.min(height(i), height(j)) * (j - i)
          arr(0) = i
          arr(1) = j
        }
      }
    }
    sum
  }
  def test(map: mutable.Map[String,Int] = mutable.Map("张三" -> 2)) ={
    var testmap = scala.collection.mutable.Map[String,Int]()
    testmap = map.+ ("小明" -> 1)
    testmap
  }
  def filter(map:mutable.Map[String,String]) = {

  }


  def maxAr1(height: Array[Int]): Int = {
    if (height.size <= 1) return -1
    var i = 0
    var j: Int = height.size - 1
    var res = 0
    while (i < j) {
      val h: Int = Math.min(height(i), height(j))
      res = Math.max(res, h * (j - i))
      if (height(i) < height(j))
        i += 1
      else j -= 1
    }
    res
  }
}
