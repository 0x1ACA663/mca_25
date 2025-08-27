import java.util.Arrays;

public class MergeArray {
  public static void main(String[] args) {
    int[] arr1 = {5, 4, 6, 9};
    int[] arr2 = {7, 1, 3, 2};

    int[] mergedArr = new int[arr1.length + arr2.length];
    for (int i = 0; i < arr1.length; i++) {
      mergedArr[i] = arr1[i];
    }
    for (int i = arr2.length; i < arr1.length + arr2.length; i++) {
      mergedArr[i] = arr2[arr2.length - i];
    }

    System.out.println("Arr1 = " + Arrays.toString(arr1));
    System.out.println("Arr2 = " + Arrays.toString(arr2));
 
    System.out.println("MergedArray = " + Arrays.toString(mergedArr));
  }
}
