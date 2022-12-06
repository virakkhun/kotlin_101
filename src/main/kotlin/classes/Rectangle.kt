package classes

// @inlines props
class Rectangle(var height: Double, var length: Double): Shape() {
  val perimeter = (height + length) * 2
}