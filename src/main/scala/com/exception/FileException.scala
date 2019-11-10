package com.exception
import scala.util.{Try,Success,Failure}
import java.io.FileNotFoundException
import org.apache.spark.sql.{DataFrame,SparkSession}
object FileException {
  
  def main(args:Array[String]){
    
     if (args.length == 0) {
        println("dude, i need at least one parameter")
        System.exit(0)
    }
    createFile(args(0)) match {
      
      case Success(df)=>{}
      
      case Failure(ex)=>{println(s"Error occured $ex")}
      
    }
    
  }
  
  def createFile(name:String):Try[DataFrame]={
    
    try{
      
       val spark = SparkSession.builder().appName("Exceptions").enableHiveSupport().master("local[*]").getOrCreate()
       
       val df = spark.read.format("csv").option("inferSchema", "true").option("header", "true").load(name)
       
       Success(df)      
    }
    catch{
      case ex:FileNotFoundException=>Failure(ex)
                                     
      case unknown:Exception =>Failure(unknown)
    }
}
}

