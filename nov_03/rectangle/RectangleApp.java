import java.util.Scanner;

void main() {
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter the length of the rectangle: ");
  double length = sc.nextDouble();
  sc.nextLine(); // Clears the remaining buffer.

  System.out.print("Enter the breadth of the rectangle: ");
  double breadth = sc.nextDouble();
  sc.close();

  RectangleAreaPerimeter rect = new RectangleAreaPerimeter(length, breadth);

  System.out.printf("Area of the rectangle: %.2f%n", rect.area());
  System.out.printf("Perimeter of the rectangle: %.2f%n", rect.perimeter());
}
