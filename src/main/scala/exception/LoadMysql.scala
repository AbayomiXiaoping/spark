package exception

import org.apache.spark.sql.SparkSession

object LoadMysql {
  
  def main(args:Array[String]){
    
    if(args.length != 2 ){
      
      println("Not sufficent argument")
      System.exit(0)
    }
    val spark = SparkSession.builder().appName(args(0)).master(args(1)).getOrCreate()
    
    val df = spark.read.format("csv").option("inferSchema", "true").option("header", "true").load("d:\\Spark-WorkPlace\\emp.txt")
    
    println(df.printSchema())
    
    if(spark!=null)
    spark.stop()
  }
}