// Q1. Use the REPL to create several Vectors,
// each populated by a different type of data.

val v1 = Vector("Hello", "World")
val v2 = Vector('a', 'b', 'c', 'd')
val v3 = Vector(1, 2, 3, 4, 5)
val v4 = Vector(1.5, 3.4, 14.52, -1.22)

// Q2. Use the REPL to see if you can make a
// Vector containing other Vectors.

val v5 = Vector(v1, v2, v3, v4)

// Q3. Create a Vector and populate it with words
// (which are Strings). Add a for loop that prints
// each element in the Vector. Append to a variable
// of type String to create a sentence. Satisfy the
// following test:

val v6 = Vector("The", "dog", "visited", "the", "fire", "station")
var sentence = ""
for(i <- 0 until v6.length){
  sentence += v6(i) + " "
  print(s"${v6(i)} ")
}

sentence == "The dog visited the fire station "
// I have had to adjust the above line as the 'to' symbol is giving an error (Cannot resolve symbol)

// Q4. Create and initialise two Vectors, one
// containing Ints and one containing Doubles.
// Call the sum, min, and max operations on each one.

val v7 = Vector(1,2,3,4,5)
val v8 = Vector(1.1,2.2,3.3,4.4,5.5)

println(v7.sum)
println(v7.min)
println(v7.max)

println(v8.sum)
println(v8.min)
println(v8.max)

// Q5. Create two Vectors of Int named myVector1
// and myVector2, each initialised to 1, 2, 3, 4, 5, 6.
// Use AtomicTest to show whether the two are equivalent.

//Could not work with this as I cannot import AtomicTest, not working for me.