package L2mod2.Part1


object class_objects {
// Name of the class is Car
class Car(val make: String = "Audi" , val model: String = "A3", val fuel: Int = 55 ) {

  // Class variables
  var company: String = make
  var model_name: String = model
  var fuel_cap: Int = fuel

  // Class method
  def Display()
  {
    println("Make of the Car : " + company)
    println("Model of the Car : " + model_name)
    println("Fuel capacity of the Car : " + fuel_cap)
  }
}


  // Main method
  def main(args: Array[String]) {

    // Class object
    var obj1 = new Car("BMW", "X7", 40)
    obj1.Display()
  }
}

