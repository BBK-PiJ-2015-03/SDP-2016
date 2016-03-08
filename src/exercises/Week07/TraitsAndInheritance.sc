// 5. A)

sealed abstract trait Shape{
  def sides(): Int
  def perimeter(): Double
  def area(): Double
}
trait Rectangular extends Shape{}

case class Circle(radius :Int) extends Shape{
  override def sides() = 1
  override def perimeter() = Math.PI * (radius*2)
  override def area() = Math.PI * (radius*radius)
}
case class Rectangle(val width :Int, val length :Int) extends Rectangular{
  override def sides() = 4
  override def perimeter() = 2*(width+length)
  override def area() = width*length
  def getWidth() = width
  def getLength() = length
}
case class Square(sidesLength :Int) extends Rectangular{
  override def sides() = 4
  override def perimeter() = 4*sidesLength
  override def area() = sidesLength*sidesLength
}

object Draw{
  def apply(shape :Shape) ={
    if(shape.getClass.getSimpleName == "Circle"){
     println("A circle of radius " + ((shape.perimeter()/Math.PI)/2).toInt + "cm")
    }
    else if(shape.getClass.getSimpleName == "Square"){
      println("A square of width and height " + (shape.perimeter()/4).toInt + "cm")
    }
    else if(shape.getClass.getSimpleName == "Rectangle"){
      println("A rectangle of width ")// Unsure how to get width/length here
    }
  }
}

println(Draw(Circle(10)))
println(Draw(Square(4)))
println(Draw(Rectangle(8, 15))) // Would not compile when I removed case for Rectangle class

sealed trait Colour