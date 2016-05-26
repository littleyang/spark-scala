package com.time.spark

import org.apache.spark.{SparkContext, SparkConf}

/**
 * Hello world!
 *
 */
object App {
  def main(args: Array[String]) {
    val logFile = "hdfs://10.0.58.21:9000/nginx/2016/05/24/*.log"
    val conf = new SparkConf().setAppName("Simple Application").setMaster("spark://10.0.58.21:7077")
    val sc = new SparkContext(conf)
    val logData = sc.textFile(logFile)
    println(logData.count())
  }
}
