// 2. WAP to calculate the sum ad average of array element.

public class SumAverage {
  public static void main(String[] args) {
    int[] arr = {5, 7, 3, 9, 1};

    int sum = 0;
    for (int element : arr) {
      sum += element;
    }

    System.out.println("Sum: " + sum);

    int average = sum / arr.length;
    System.out.println("Average: " + average);
  }
}
