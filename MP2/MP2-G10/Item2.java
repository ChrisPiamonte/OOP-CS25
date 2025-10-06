import java.util.Scanner;

public class Item2 {
  public static boolean isHarshad(int intN) {
    int intSum = 0, intTemp = intN;
    while (intTemp > 0) {
      intSum += intTemp % 10;
      intTemp /= 10;
    }
    return intN % intSum == 0;
  }

  public static void harshadChecker(Scanner scanner) {
    while (true) {
      System.out.print("Enter any positive number: ");

      while (!scanner.hasNextInt()) {
        System.out.print("Invalid input! Please enter a positive integer: ");
        scanner.next();
      }

      int intNum = scanner.nextInt();

      while (intNum <= 0) {
        System.out.print("Not valid! Please input a positive integer only: ");
        while (!scanner.hasNextInt()) {
          System.out.print("Invalid input! Please enter a positive integer: ");
          scanner.next();
        }
        intNum = scanner.nextInt();
      }

      if (isHarshad(intNum))
      System.out.println(intNum + " is a Harshad number.");
      else
      System.out.println(intNum + " is not a Harshad number.");

      System.out.print("\n");

      char charChoice;
      while (true) {
        System.out.print("Do you want to check another number? (Y/N): ");
        String input = scanner.next().trim().toUpperCase();

        if (input.length() == 1) {
          charChoice = input.charAt(0);

          if (charChoice == 'Y') {
            break;
          }
          else if (charChoice == 'N') {
            System.out.println("Exiting program. Goodbye!");
            return;
          }
        }
        System.out.println("Invalid input! Please enter only Y or N.");
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("This program determines whether the entered number is a Harshad number.");
    Scanner scanner = new Scanner(System.in);

    harshadChecker(scanner);
    scanner.close();
  }
}
