import jdk.jfr.Category

fun main ()  {
  println(isEven(333))
   var rice=product("Ayugi",56,800,"hygeine")
   println(rice.option("I love fresh juice"))
   print(set("Mango"))


}
fun isEven(num:Int) :Boolean {
   if(num  %2==0){
      return true
   }
   else{
      return false
   }

}
 data class product(var name:String,var weight:Int,var price:Int,var categories:String) {
    fun option(Category:String){
       when (Category){
          "groseries"-> println("I love fresh juice")
          "hygeine"->println("I like clean clean environment")
          else->println("look for more")
       }
    }
}
fun set(str:String) :String  {
   var b ="   "
   for(items in str){
      if (str.indexOf(items)%2==0){
         print(items)
      }
   }
   return "${b}"
}
fun items(names:Array<String>):ArrayList<String>{


}






