package com.aibee.leetcode.DP01

import scala.collection.mutable

object MapUse {
  def main(args: Array[String]): Unit = {
    val emptyMap : mutable.HashMap[String,Int] = new mutable.HashMap[String,Int]()
    val empyMapInt = new mutable.HashMap[Int, Int]()
    val immutableMap:mutable.Map[Int,Int] = mutable.Map(4 -> 8 , 5 -> 10)
    var z = Array("Runoob", "Baidu", "Google")
    var im:mutable.Map[String,mutable.Map[String,String]] = mutable.Map("a" -> mutable.Map("a1" -> "z"))
    var imtest:Array[String] = Array[String]()
    val strings= im.get("a").get("a1")
    var strings1= im.get("a").get("a")
    val strings2= im.get("a").get("b")
    val maybeStringToStrings: Option[mutable.Map[String, String]] = im.get("a")
    val strings3= maybeStringToStrings.get("a")


    val myMap: mutable.Map[String, String] = mutable.Map("key1" -> "value")
    val value = ""
    val maybeString = myMap.getOrElse("key1","a")
    val value2: Option[String] = myMap.get("key2")
    val map = immutableMap + (2 -> 4)
    val t1 = new mutable.HashMap[Int,String]()
    val map2 = t1 + (3 -> "333")
    println(emptyMap.getOrElse("3",0))
    val stringToInt: mutable.Map[String, Int] = scala.collection.mutable.Map[String, Int]()
  }
}