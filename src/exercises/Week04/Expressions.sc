// Q1.Write an expression that evaluates to true if the sky is sunny and the temperature is more than 80 degrees.
var sky = "sunny"
var temp = 80.1
var result = false

if(sky.equals("sunny") && temp > 80) {
  println("What a lovely day")
  result = true
} else {
  println("The weather could be better")
  result = false
}

//Q2. Write an expression that evaluates to true if the sky is either sunny or partly cloudy and the temperature is more than 80 degrees.
sky = "partly cloudy"
if(sky.equals("partly cloudy") || sky.equals("sunny") && temp > 80) {
  println("It looks like a nice day")
  result = true
} else {
  println("The weather could be better")
  result = false
}

//Q3. Write an expression that evaluates to true if the sky is either sunny or partly cloudy and the temperature is either more than 80 degrees or less than 20 degree
temp = 14
if((sky.equals("partly cloudy") || sky.equals("sunny")) && (temp > 80 || temp < 20)) {
  println("Either too hot or too cold!")
  result = true
} else {
  println("The weather could be better")
  result = false
}

// Q4. Convert Fahrenheit to Celsius.
// Hint: first subtract 32, then multiply by 5/9. If you get 0, check to make sure you didnt do integer maths.
println(s"Temp: ${temp}f = ${(temp-32.0)*(5.0/9.0)}c")

// Q5. Convert Celsius to Fahrenheit.
// Hint: first multiply by 9/5, then add 32. Use this to check your solution for the previous exercise.
temp = -10
println(s"Temp: ${temp}c = ${temp*(9.0/5.0)+32}f")
