// Q1. Create a Range object and print the step value.
// Create a second Range object with a step value of 2
// and then print the step value. Whats different?
// A1. The difference is that the second range contains every second element inclusive of the first
// in this case it happens to be all the odd numbers but depending on the range it may not be
val range1 = 1 to 10
val range2 = 1 to 10 by 2
println(range1)
println(range2)

// Q2. Create a String object s1 (as a var) initialised
// to "Sally". Create a second String object s2 (as a var)
// initialised to "Sally". Use s1.equals(s2) to determine if
// the two Strings are equivalent. If they are, print s1 and
// s2 are equal, otherwise print s1 and s2 are not equal.
var s1 = "Sally"
var s2 = "Sally"
if(s1.equals(s2)){
  println(s"$s1 and $s2 are equal")
} else {
  println(s"$s1 and $s2 are not equal")
}

