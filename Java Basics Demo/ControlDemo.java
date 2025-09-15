public class ControlDemo {
  public static void main(String[] args) {
    int intNumber = 7;

    // if-else
    if (intNumber % 2 == 0) {
      System.out.println(intNumber + " is even");
    } else {
      System.out.println(intNumber + " is odd");
    }

    // switch
    int intDay = 3;
    switch (intDay) {
      case 1: System.out.println("Monday"); break;
      case 2: System.out.println("Tuesday"); break;
      case 3: System.out.println("Wednesday"); break;
      default: System.out.println("Other Day");
    }

    // Loops
    System.out.println("For loop:");
    for (int intI = 1; intI <= 5; intI++) {
      System.out.print(intI + " ");
    }

    System.out.println("\nWhile loop:");
    int intJ = 1;
    while (intJ <= 5) {
      System.out.print(intJ + " ");
      intJ++;
    }

    System.out.println("\nDo-While loop:");
    int intK = 1;
    do {
      System.out.print(intK + " ");
      intK++;
    } while (intK <= 5);
  }
}
