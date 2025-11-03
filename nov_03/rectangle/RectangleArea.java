public class RectangleArea {
  private double length;
  private double breadth;

  public RectangleArea(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public double getLength() {
    return length;
  }

  public double getBreadth() {
    return breadth;
  }

  public double area() {
    return length * breadth;
  }
}
