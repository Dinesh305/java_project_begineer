import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
object ExceptionDemoScala {
  def main(args : Array[String]): Unit ={
    println("welcome scala")

//    try {
//      println(getposition("Dinesh", 73))
//    }catch {
//      case i: StringIndexOutOfBoundsException => println("Wrong input" + i)
//
//    }
    try

    {
      throwing()
    }
    catch
    {
      case a => println("sample" + a);
    }
  }
//
//  def getposition(a:String,b:Int ): Char ={
//
//    val pos = a.charAt(b)
//    pos
//

//  }
  def throwing (){
    throw new Exception ("Sample throw exception")
  }
}
