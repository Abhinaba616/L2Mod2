package L2mod2.Part4

object zipwithIndex {
  def main(args: Array[String]): Unit ={
    val days = Array("Sunday", "Monday", "Tuesday", "Wednesday",
      "Thursday", "Friday", "Saturday")
    for ((day, count) <- days.zipWithIndex) {
      println(count + " is " + day)
    }
  }
}
