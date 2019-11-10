package com.exception

object UserException {
  
  def main(args:Array[String]){
    
    def isPrime(num:Int):Boolean=(num>1) && !(2 to scala.math.sqrt(num).toInt).exists(x=>num%x==0)
    
    println(isPrime(8))
  }
}