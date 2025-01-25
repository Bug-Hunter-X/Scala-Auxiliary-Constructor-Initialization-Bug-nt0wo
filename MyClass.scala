```scala
class MyClass(val x: Int) {
  def this() = this(0) 
  def getX = x
}

object Main extends App {
  val myObject = new MyClass()
  println(myObject.getX)
}
```