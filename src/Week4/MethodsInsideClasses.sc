// Q1. Create a Sailboat class with methods to raise and lower the sails,
// printing Sails raised, and Sails lowered, respectively.
// Create a Motorboat class with methods to start and stop the motor,
// returning Motor on, and Motor off, respectively. Create an object (instance)
// of the Sailboat class. Use assert for verification:

class Sailboat {
  def raise  = "Sails raised"
  def lower = "Sails lowered"
}

val sailboat = new Sailboat
val r1 = sailboat.raise
assert(r1 == "Sails raised", "Expected Sails raised, Got " + r1)
val r2 = sailboat.lower
assert(r2 == "Sails lowered", "Expected Sails lowered, Got " + r2)

class Motorboat {
  def on  = "Motor on"
  def off = "Motor off"
}

val motorboat = new Motorboat
val s1 = motorboat.on
assert(s1 == "Motor on", "Expected Motor on, Got " + s1)
val s2 = motorboat.off
assert(s2 == "Motor off", "Expected Motor off, Got " + s2)

// IntelliJ is giving a "Cannot resolve symbol" error on the sailboat methods but
// on the motorboat methods there are no errors, strange behaviour. Code compiles and works as expected.