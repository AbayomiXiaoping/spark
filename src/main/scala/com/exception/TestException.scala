package com.exception

object TestException {
  
  def main(args:Array[String]){
    
    
//    case class person(name:String,age:Int)
//    
//    val bob = person("Sazzad",31)
//    
//    val data = bob match{
//      
//      case person(n,a) if a>2=>{ println(s"Hi my name is $n and my age is $a")}
//      
//    }
    
    def sum(a:Int,b:Int,c:Int):Int=a+b+c
    
    println(sum(1,2,3))
    
    def sum1(a:Int)(b:Int)(c:Int)=a+b+c
    
    println(sum1(2)(3)(4)) 
    
    val curryFun:Int=>Int=>Int=>Int = a=>b=>c=>a+b+c
    
   println( curryFun(2)(4)(1))
    
    
   // val myException = throw new NullPointerException()
    
//    class exception extends Exception
//    
//    val exce = new Exception
//    
//    throw exce
    
  //  val ofm = Array.ofDim(Int.MaxValue )
    
//    def infinite:Int=1+infinite
//    
//    val nolimit = infinite
    
    
//    def isPrime(num:Int):Boolean={
//      (num>1) && !(2 to scala.math.sqrt(num).toInt).exists(x=>num%x  == 0)
//      
//    }
//    
// 
//   println( isPrime(3))
   }
  
}