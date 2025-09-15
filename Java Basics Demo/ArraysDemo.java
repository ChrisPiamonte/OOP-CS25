public class ArraysDemo {
  public static void main(String[] args) {
    int[] arrNumbers = {10, 20, 30, 40, 50};

    System.out.println("First element: " + arrNumbers[0]);
    System.out.println("All elements:");
    for (int intNumber : arrNumbers) {
      System.out.println(intNumber);
    }
  }
}
