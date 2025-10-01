import java.util.Arrays;

public class ArrayMethods {
  public static void main(String[] args) {
    // Sorting an array
    int[] numbers = {5, 2, 8, 1, 7};
    System.out.println("Original array: " + Arrays.toString(numbers));
    Arrays.sort(numbers);
    System.out.println("Sorted array: " + Arrays.toString(numbers));

    // Searching in a sorted array
    int searchElement = 7;
    int index = Arrays.binarySearch(numbers, searchElement);
    System.out.println("Index of " + searchElement + ": " + index);

    // Filling an array
    int[] filledArray = new int[5];
    Arrays.fill(filledArray, 42);
    System.out.println("Filled array: " + Arrays.toString(filledArray));

    // Converting array to a string
    String[] stringArray = {"apple", "banana", "orange"};
    System.out.println("String array: " + Arrays.toString(stringArray));

    // Checking array equality
    int[] array1 = {1, 2, 3};
    int[] array2 = {1, 2, 3};
    boolean arraysEqual = Arrays.equals(array1, array2);
    System.out.println("Arrays equal? " + arraysEqual);

    // Copying arrays
    int[] originalArray = {10, 20, 30, 40, 50};
    int[] copiedArray = Arrays.copyOf(originalArray, 3);
    System.out.println("Copied array: " + Arrays.toString(copiedArray));

    // Hash code of an array
    int[] hashArray = {3, 7, 1, 4, 2};
    int arrayHashCode = Arrays.hashCode(hashArray);
    System.out.println("Hash code of the array: " + arrayHashCode);
  }
}