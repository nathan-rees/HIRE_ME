import scala.collection.immutable
import scala.collection.immutable.List
import scala.collection.mutable.ListBuffer
import scala.io.Source

object Main extends App {
  val penis="penis"
 // println(penis.indices.filter(_!=1).co)
   val s=Source.fromFile("src/main/enable1.txt" ).getLines().toList
  println(funnel("princesses"))

  def funnel(word:String):Int ={
    var ss=""
   var arr = new Array[Int](word.length)
    if(s.contains(word)){
      var i=0;
      for(jj<-0 until word.length) {
        for (j <- 0 until word.length) {
          if (j != i) {
            ss += word.charAt(j)
          }
        }
        if(ss.length>1){
          arr(jj)= funnel(ss)
        }
        i += 1
        ss = "";
      }
    }else{
      return 0//if the word to this function is not a valid word
    }
    1+arr.max//should add the max child function
  }
}
