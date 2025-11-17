import java.util.Arrays;
import java.util.Scanner;

void main() {
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter the size of the array: ");
  int size = sc.nextInt();
  sc.nextLine(); // Clears the int buffer

  int[] arr = new int[size];

  for (int i = 0; i < size; i++) {
    System.out.print("Enter the arr[" + i + "] value: ");
    arr[i] = sc.nextInt();
    sc.nextLine(); // Clears the int buffer
  }

  System.out.println("Array: " + Arrays.toString(arr));
  System.out.print("Enter the element value of count: ");
  int value = sc.nextInt();

  int count = 0;
  for (int element : arr) {
    if (element == value) count++;
  }

  System.out.println("Element " + value + " occurs " + count + " times!");
  sc.close();
}
