package L2mod2.Part3

object sequential_search {
    def sequential_search(a: Array[Int], c: Int) {
      var i = 0
      while(i < a.length && a(i) != c) i += 1
      if(i < a.length)
        println("Element found at index: " + i)
      else
        println("Element not found")
    }

  def main(args: Array[String]){
    val num = Array(8,7,5,9,6,2,11,13,3)
    sequential_search(num, 6)
  }
}
