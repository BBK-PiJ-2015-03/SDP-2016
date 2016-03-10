// Q1. Given the following type;

//sealed trait IntList
//final case object End extends IntList
//final case class Pair(head: Int, tail: IntList) extends IntList

// (a) Change the name to LinkedList and make the type of data stored in the list generic.

sealed trait LinkedList[T]{
  def length : Int
}
final case object End extends LinkedList {
  override def length: Int = 0
}
final case class Pair(head: Int, tail: LinkedList) extends LinkedList[Int]{
  override def length: Int = {
    return head+tail.length
  }
}

//(b) Now implement length, returning the length of the LinkedList. Some test cases are below:
val example = Pair(1, Pair(2, Pair(3, End)))
assert(example.length == 3)
assert(example.tail.length == 2)
assert(End.length == 10)