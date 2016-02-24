/**
  * Map & Reduce
  */

import exercises.atomicscala.src.com.atomicscala.AtomicTest._

//1. A)
val v = Vector(1, 2, 3, 4)
v.map(n => n + 1) is Vector(2, 3 ,4, 5)
val v2 = Vector(1, 2, 3, 4)
v2.map(n => n*11 + 10) is Vector(21, 32 ,43, 54)

// B)
val v3 = Vector(1, 2, 3, 4)
v3.foreach(n => n*11+10) is Vector(21, 32 ,43, 54) // foreach throws an error when testing the result

// C) - Having a lot of trouble as Vector is immutable and cannot be reassigned a value
// I am sure there is a way to do this but it is obviously more complex than using a map
var v4 = Vector(1, 2, 3, 4)
for(n <- v4){
  //n = n*11+10
}

// D) Was having trouble with the first for loop - wil give this one a go and if I get it I will apply to C aswell.
// tried a few different ways none worked for me
var v5 = Vector(1, 2, 3, 4)
v5.map(n => n + 1) is Vector(2, 3, 4, 5)
var list = for(n <- v5) yield n
for(n <- list){
  Array[Int]
}





