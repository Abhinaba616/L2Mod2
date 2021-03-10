package L2mod2.Part5

object access_modifiers {
  class AccessExample{
    private var a:Int = 10               //private access means data accessible only within class
    protected var b:Int = 20            //protected class means data accessible within class,subclass & companion obj
    var c:Int = 30                      //no-access modifier
    def show(){
      println("a = " + a)
    }
  }
  class SubClass extends AccessExample {
    def display() {
      println("b = " + b)
    }
  }
    def main(args: Array[String]) {
      var p = new AccessExample()
      var q = new SubClass()
      //p.a = 12
      p.c = 30
      p.show()
      q.display()
      println("c = " + p.c)
    }
}
