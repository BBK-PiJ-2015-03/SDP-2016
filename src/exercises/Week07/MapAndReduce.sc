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

// 2. Was having trouble with the first for loop - wil give this one a go and if I get it I will apply to 1.C as well.
// tried a few different ways none worked for me **UPDATE** still unsure about this have not found much on google
// UPDATE** Have managed to do it but very long winded way - the same will apply for the above use a list to grab each
// element and apply a calculation to it, the assign that list to the vector as a vector.
var v5 = Vector(1, 2, 3, 4)
var arrayV5 = new Array[Int](v5.length)
var i = 0
for(n <- v5){
  arrayV5(i) = n+1
  i += 1
}
v5 = arrayV5.toVector
v5 is Vector(2, 3, 4, 5)


// 3.

val v6 = Vector(1, 10 , 100, 1000)

//v6.reduce((sum, n)) => sum + n) is 1111  - not working throws an error

i = 0
var result = 0
for(n <- v6){
  result += v6(i)
  i += 1
}

result is 1111
println(arrayV5(1))

def sumIt(args: Int*): Int = {
  args.reduce((a,v) => a+v)
}


sumIt(1, 2, 3) is 6
sumIt(45, 45, 45, 60) is 195


val someValue: Option[String] = Some("I am wrapped in something")
someValue.get is (
  "I am wrapped in something"
)