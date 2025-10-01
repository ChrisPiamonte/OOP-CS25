public class ArrayExample {
  public static void main(String[] args) {
      // Declare and initialize an array of integers
      int[] arrNumbers = {100, 200, 300, 400, 500};

      // Display the elements of the array
      System.out.println("Array elements:");

      for (int intCounter = 0; intCounter < arrNumbers.length; intCounter++) {
          System.out.println("Element at index " + intCounter + ": " + arrNumbers[intCounter]);
      }
  }
}