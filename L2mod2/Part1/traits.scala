package L2mod2.Part1

// a class inherits multiple traits


object traits {
// Trait 1
trait Trait1 {
  // Abstract method
  def pet()
}

//Trait 2
trait Trait2 {
  // Non-abstract method
  def pet_color() {
    println("Color : Black & white")
  }
}

//Trait 3
trait Trait3 {
  def pet_name() {
    println("Name : Puku ")
  }
}

//Class Pet inherits multiple traits
class Pet extends Trait1 with Trait2 with Trait3 {
  // Implementation of abstract method
  def pet() {
    println("pet : Dog")
  }
}


  // Main method
  def main(args: Array[String]) {
    val pet1 = new Pet()
    pet1.pet()
    pet1.pet_color()
    pet1.pet_name()
  }
}
