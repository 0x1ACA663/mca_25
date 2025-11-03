import java.util.Scanner;

void main() {
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter a String: ");
  String str = sc.nextLine();
  sc.close();

  Child child = new Child(str);
  System.out.printf("Value of Child.value property: %s%n", child.value);
}
