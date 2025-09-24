public class MP1 {
  public static void main(String[] args) {
    int evenTotal = 0;
    int oddTotal = 0;
    int evenSum = 0;
    int oddSum = 0;

    System.out.println("EVEN DIGITS: ");
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
      System.out.print(i + " ");
      evenTotal++;
      evenSum += i;
      }
    }

    System.out.println("\nODD DIGITS: ");
    for (int i = 1; i <= 100; i++) {
      if (i % 2 != 0) {
        System.out.print(i + " ");
        oddTotal++;
        oddSum += i;
      }
    }

    System.out.println("\n\nTotal Number of Evens: " + evenTotal);
    System.out.println("Total Number of Odds: " + oddTotal);
    
    System.out.println("\nEven Digits Sum: " + evenSum);
    System.out.println("Odd Digits Sum: " + oddSum);

    if (evenSum > oddSum) {
      System.out.println("\nGREATER TOTAL SUM: " + evenSum + " [EVEN]");
    } else {
      System.out.println("\nGREATER TOTAL SUM: " + oddSum + " [ODD]");
    }
  }
}
