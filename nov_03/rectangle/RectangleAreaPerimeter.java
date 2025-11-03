public class RectangleAreaPerimeter extends RectangleArea {
  RectangleAreaPerimeter(double length, double breadth) {
    super(length, breadth);
  }

  public double perimeter() {
    return 2 * (getLength() + getBreadth());
  }
}
