import org.apache.spark.SparkContext._
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by yangyang on 5/25/16.
  */
object Total {

  def main(args: Array[String]) {
    val logFile = "hdfs://10.0.58.21:9000/nginx/2016/05/24/*.log" // Should be some file on your system
    val conf = new SparkConf().setAppName("Simple Application").setMaster("spark://10.0.58.21:7077")
    val sc = new SparkContext(conf)
    val logData = sc.textFile(logFile)
    println(logData.count())
  }

}
