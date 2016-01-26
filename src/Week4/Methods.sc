// Q1. Create a method getSquare that takes an Int argument and returns its square.
// Print your answer. Test using the following code.

def getSquare(num: Int) : Int = num*num

val a = getSquare(3)
println(a)
assert(a == 9)
val b = getSquare(6)
assert(b == 36)
val c = getSquare(5)
assert(c == 25)
// Q2. Create a method isArg1GreaterThanArg2 that takes two Double arguments.
// Re- turn true if the first argument is greater than the second.
// Return false otherwise. Print your answer. Satisfy the following:
def isArg1GreaterThanArg2(num1: Double, num2: Double) : Boolean = if(num1>num2) true else false
val t1 = isArg1GreaterThanArg2(4.1, 4.12)
assert(!t1)
val t2 = isArg1GreaterThanArg2(2.1, 1.2)
assert(t2)
// Q3. Create a method manyTimesString that takes a String and an Int as arguments
// and returns the String duplicated that many times. Print your answer. Satisfy the following:

def manyTimesString(text: String, num: Int) : String = {
  var result = text
  if (num!=0) {
    for (i <- 1 until num) {
      result += text
    }
  }
  result
}

val m1 = manyTimesString("abc", 3)
assert("abcabcabc" == m1, "This works")
val m2 = manyTimesString("123", 2)
assert("123123" == m2, "This works")