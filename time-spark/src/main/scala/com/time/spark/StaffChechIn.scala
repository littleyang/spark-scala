package com.time.spark

import org.apache.spark.{SparkContext, SparkConf}

/**
  * Created by yangyang on 5/26/16.
  */
object StaffChechIn {
  def main(args: Array[String]) {
    val logFile = "hdfs://10.0.58.21:9000/nginx/2016/05/24/*.log"
    //val conf = new SparkConf().setAppName("Simple Application").setMaster("spark://10.0.58.21:7077")
    val conf = new SparkConf().setAppName("Simple Application").setMaster("local")
    val sc = new SparkContext(conf)
    val logData = sc.textFile(logFile)
    //println(logData.count())
    val checkInData = logData.filter(line=>line.contains("/api/lebang/staffs/me/work"))
    println(checkInData.count())
  }

}
