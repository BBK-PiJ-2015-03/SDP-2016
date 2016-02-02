// Q1. Create classes for Hippo, Lion, Tiger, Monkey, and Giraffe,
// then create an in- stance of each one of those classes. Display
// the objects. Do you see five different ugly-looking (but unique) strings?
// Count and inspect them.
// A1. Yes, 5 ugly strings are being displayed I believe these are the address in memory of the objects
class Hippo
class Lion
class Tiger
class Monkey
class Giraffe

var h = new Hippo
var l = new Lion
var t = new Tiger
var m = new Monkey
var g = new Giraffe

println(s"$h\n$l\n$t\n$m\n$g")

// Q2. Create a second instance of Lion and two more Giraffes.
// Print those objects. How do they differ from the original
// objects that you created?
// A2. They have a different address in memory because they are different objects even though they are of the same type.

var l1 = new Lion
var g2 = new Giraffe
var g3 = new Giraffe
println(s"$l1\n$g2\n$g3")
