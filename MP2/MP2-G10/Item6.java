import java.util.*;

public class Item6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String strChoice;

    System.out.println("This program asks the user to enter a number and displays all its prime factors.");

    do {
      int intNum = getValidNumber(scanner);
      System.out.print("The Prime factors of " + intNum + " are: ");
      printPrimeFactors(intNum);
      System.out.println();
      strChoice = getYesOrNo(scanner, "Do you want to try again? (Y/N): ");
    } while (strChoice.equalsIgnoreCase("Y"));

    System.out.println("Program terminated.");
    scanner.close();
  }

  public static int getValidNumber(Scanner scanner) {
    int intN = 0;
    boolean boolValidInput = false;

    while (!boolValidInput) {
      System.out.print("\nEnter a number: ");

      if (scanner.hasNextInt()) {
        intN = scanner.nextInt();
        if (intN > 1) {
          boolValidInput = true;
        } else {
          System.out.println("Please enter an integer greater than 1.");
        }
      } else {
        System.out.println("Invalid input! Please enter an integer.");
        scanner.next();
      }
    }

    return intN;
  }

  public static void printPrimeFactors(int intN) {
    for (int intI = 2; intI <= intN; intI++) {
      while (intN % intI == 0) {
        System.out.print(intI + " ");
        intN /= intI;
      }
    }
  }

  public static String getYesOrNo(Scanner scanner, String strPrompt) {
    String strChoice;
    do {
      System.out.print(strPrompt);
      strChoice = scanner.next();
      if (!strChoice.equalsIgnoreCase("Y") && !strChoice.equalsIgnoreCase("N")) {
        System.out.println("\nInvalid input! Please enter Y or N.");
      }
    } while (!strChoice.equalsIgnoreCase("Y") && !strChoice.equalsIgnoreCase("N"));

    return strChoice;
  }
}
