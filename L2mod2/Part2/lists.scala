package L2mod2.Part2


import scala.collection.immutable._
object lists{
  def main(args:Array[String]){

    var list1 = List(1,8,5,6,9,58,23,15,4)
    var list2 = List(88,100)

    print("Elements: ")

    list1.foreach((element:Int) => print(element+" "))        // Iterating using foreach loop

    print("\nElement at 2 index: "+list1(2))             // Accessing element of 2 index

    var list3 = list1 ++ list2                               // Merging two list
    print("\nElement after merging list and list2: ")
    list3.foreach((element:Int)=>print(element+" "))

    var list4 = list3.sorted                            // Sorting list
    print("\nElement after sorting list3: ")
    list4.foreach((element:Int)=>print(element+" "))

    var list5 = list3.reverse                           // Reversing list elements
    print("\nElements in reverse order of list5: ")
    list5.foreach((element:Int)=>print(element+" "))
  }
}
