import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.collection.parallel.immutable._
import scala.collection.parallel.mutable._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object test {



        def checkDivisibility(arr: Array[String]): Array[String] = {
    // Write your code here
        var result:Array[String] =null
        var index:Int=0;
        var i:Int=1;
        for(i <- arr){

          var size = arr(0)

          if(i.toInt%8==0){
          // i = i+1
            result(index)="YES"
             index=index+1
          }
          else{
             result(index)="NO"
            index=index+1
          }
        
    }
      
         result
  }
  
  
  
    // Complete the findNumber function below.
    def findNumber(arr: Array[Int], k: Int): String = {

    arr.contains(k)
      
        var cond = 0;

        if(arr.contains(k)){
          
          "True"
          
           }
        else
        "False"
    }

    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arrCount = StdIn.readLine.trim.toInt

        val arr = Array.ofDim[Int](arrCount)

        for (i <- 0 until arrCount) {
            val arrItem = StdIn.readLine.trim.toInt
            arr(i) = arrItem
        }

        val k = StdIn.readLine.trim.toInt

        val res = findNumber(arr, k)

        printWriter.println(res)

        printWriter.close()
    }
}
