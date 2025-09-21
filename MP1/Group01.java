import java.util.Scanner;

/*
 * ==========================================================
 *  Machine Problem 1 - Workspace for Group 01
 * ==========================================================
 *
 * Instructions:
 * - This file is your workspace for solving Machine Problem 1.
 * - You will practice the Programming Core Concepts discussed in class,
 *   such as variables, data types, operators, and basic string operations.
 * - Do NOT create additional classes or advanced features (like arrays)
 *   unless instructed.
 * ==========================================================
 */

// Remember to add comments!!!

public class Group01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initializes scanner and standard variables
        double dblFirstNumber = 0;
        double dblSecondNumber = 0;
        int intUserChoice = 0;
        char charConfirm = '0';

        do {
            System.out.println("--- Scientific Calculator ---"); // Prints the calculator interface
            System.out.println("1. Add the Numbers");
            System.out.println("2. Subtract the Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Modulus of Two Numbers");
            System.out.println("6. Factorial of a Number");
            System.out.println("7. Power of a Number");
            System.out.println("8. Exit");
            System.out.print("Enter your choice here: ");

            while (!scanner.hasNextInt()) { // Takes user input for menu choice and checks for valid input
                System.out.print("Invalid.\nPlease enter a valid choice: ");
                scanner.nextLine(); // Consumes invalid input
            }
            intUserChoice = scanner.nextInt();
            scanner.nextLine(); // Consumes leftover new line

            switch (intUserChoice) { // Switch Case for methods
                case 1:
                    operationAdd(dblFirstNumber, dblSecondNumber, scanner); // Calls the method for addition
                    break;
                case 2:
                    operationSubtract(dblFirstNumber, dblSecondNumber, scanner); // Calls method for subtraction
                    break;
                case 3:
                    operationMultiply(dblFirstNumber, dblSecondNumber, scanner); // Calls method for multiplication
                    break;
                case 4:
                    operationDivide(dblFirstNumber, dblSecondNumber, scanner); // Calls method for division
                    break;
                case 5:
                    operationModulo(dblFirstNumber, dblSecondNumber, scanner); // Calls method for modulo
                    break;
                case 6:
                    operationFactorial(scanner); // Calls method for factorial
                    break;
                case 7:
                    operationPower(dblFirstNumber, dblSecondNumber, scanner); // Calls method for power
                    break;
                case 8:
                    System.out.println("Exiting Calculator..."); // Prints exit message
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid number from 1-8."); // Handles invalid input
                    break;
            }

            if (intUserChoice == 8) { // Confirms user choice upon exit
                while (true) {
                    System.out.println("Are you sure you want to exit? (Y/N)");
                    charConfirm = scanner.next().charAt(0);

                    if (charConfirm == 'y' || charConfirm == 'Y') { // Checks character input
                        System.out.println("Terminated.");
                        System.exit(0);
                    } else if (charConfirm == 'n' || charConfirm == 'N') {
                        System.out.println("Returning to menu...");
                        break;
                    } else { // Handles invalid input
                        System.out.println("Enter a valid character.");
                        continue;
                    }
                }
            }
        } while (true);
    }

    // OPERATION METHODS

    // Addition Method
    public static void operationAdd(double dblFirstValue, double dblSecondValue, Scanner scanner) {
        System.out.print("Input first number: "); // Asks for the first number
        while (!scanner.hasNextDouble()) { // Checks for invalid input
            System.out.print("Invalid.\nInput first number: ");
            scanner.nextLine();
        }
        dblFirstValue = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Input second number: "); // Asks for the second number
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid.\nInput second number: ");
            scanner.nextLine();
        }
        dblSecondValue = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("%.1f + %.1f = %.1f\n\n", dblFirstValue, dblSecondValue, (dblFirstValue + dblSecondValue)); // Prints and computes result
    }

    // Subtraction Method
    public static void operationSubtract(double dblFirstValue, double dblSecondValue, Scanner scanner) {
        System.out.print("Input first number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid.\nInput first number: ");
            scanner.nextLine();
        }
        dblFirstValue = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Input second number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid.\nInput second number: ");
            scanner.nextLine();
        }
        dblSecondValue = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("%.1f - %.1f = %.1f\n\n", dblFirstValue, dblSecondValue, (dblFirstValue - dblSecondValue));
    }

    // Multiplication Method
    public static void operationMultiply(double dblFirstValue, double dblSecondValue, Scanner scanner) {
        System.out.print("Input first number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid.\nInput first number: ");
            scanner.nextLine();
        }
        dblFirstValue = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Input second number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid.\nInput second number: ");
            scanner.nextLine();
        }
        dblSecondValue = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("%.1f x %.1f = %.1f\n\n", dblFirstValue, dblSecondValue, (dblFirstValue * dblSecondValue));
    }

    // Division Method
    public static void operationDivide(double dblFirstValue, double dblSecondValue, Scanner scanner) {
        System.out.print("Input first number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid.\nInput first number: ");
            scanner.nextLine();
        }
        dblFirstValue = scanner.nextDouble();
        scanner.nextLine();

        while (true) { // Handles an edge case: if divisor is 0
            System.out.print("Input second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid.\nInput second number: ");
                scanner.nextLine();
            }
            dblSecondValue = scanner.nextDouble();
            scanner.nextLine();

            if (dblSecondValue == 0) {
                System.out.println("Zero is not a valid divisor.");
                continue;
            } else {
                System.out.printf("%.1f / %.1f = %.1f\n\n", dblFirstValue, dblSecondValue, (dblFirstValue / dblSecondValue));
                break;
            }
        }
    }

    // Modulo Method
    public static void operationModulo(double dblFirstValue, double dblSecondValue, Scanner scanner) {
        System.out.print("Input first number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid.\nInput first number: ");
            scanner.nextLine();
        }
        dblFirstValue = scanner.nextDouble();
        scanner.nextLine();

        while (true) {
            System.out.print("Input second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid.\nInput second number: ");
                scanner.nextLine();
            }
            dblSecondValue = scanner.nextDouble();
            scanner.nextLine();

            if (dblSecondValue == 0) {
                System.out.println("Zero is not applicable for modulos operation.");
                continue;
            } else {
                System.out.printf("%.1f %% %.1f = %.1f\n\n", dblFirstValue, dblSecondValue, (dblFirstValue % dblSecondValue));
                break;
            }
        }
    }

    // Factorial Method
    public static void operationFactorial(Scanner scanner) {
        long longFactorial, longResult = 1;
        
        while (true) { // Handles an edge case: if the input is negative
            System.out.print("Input a non-negative integer: ");
            if (scanner.hasNextLong()) {
                longFactorial = scanner.nextLong();

                if (longFactorial < 0) {
                    System.out.println("Factorial is not defined for negative numbers.");
                    continue;
                }

                break;
            } else {
                System.out.println("Invalid input.");
                scanner.next();
            }
        }
        
        for (long i = 1; i <= longFactorial; i++) { // Computes for the factorial
                longResult *= i;
        }

        System.out.printf("%d! = %d\n\n", longFactorial, longResult);
    }

    // Power Method
    public static void operationPower(double dblFirstValue, double dblSecondValue, Scanner scanner) {
        System.out.print("Input the base: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid.\nInput the base: ");
            scanner.nextLine();
        }
        dblFirstValue = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Input the exponent: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid.\nInput the exponent: ");
            scanner.nextLine();
        }
        dblSecondValue = scanner.nextDouble();
        scanner.nextLine();

        double dblResult = 1; // Initializes variables for positive and negative exponents
        int intResult = 0;
        double dblDecimal;

        if (dblSecondValue >= 0) { // Handles an edge case: if exponent is negative
            for (int i = 0; i < dblSecondValue; i++) {
                dblResult *= dblFirstValue;
            }
            
            System.out.printf("%.1f ^ %.1f = %.1f\n", dblFirstValue, dblSecondValue, dblResult);
        } else {
            for (int i = 0; i < (-dblSecondValue); i++) {
                dblResult *= dblFirstValue;
                intResult = (int) dblResult; // Typecast double into int
            }
            dblDecimal = 1 / dblResult;

            System.out.printf("%.1f ^ %.1f = 1 / %d or %.2f\n\n", dblFirstValue, dblSecondValue, intResult, dblDecimal);
        }
    }
}
