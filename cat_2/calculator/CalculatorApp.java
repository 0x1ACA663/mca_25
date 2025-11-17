import java.util.Scanner;

void main() {
  Scanner sc = new Scanner(System.in);
  Calculator calc = new Calculator();

  System.out.print("Enter an integer 1: ");
  int num1 = sc.nextInt();
  sc.nextLine();

  System.out.print("Enter an integer 2: ");
  int num2 = sc.nextInt();
  sc.nextLine();

  sc.close();
  System.out.println("sum of the provided numbers: " + calc.add(num1, num2));
}
