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

import java.util.Scanner;

public class Group01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initializes scanner and standard variables
        double dblFirstNumber = 0, dblSecondNumber = 0;
        int intUserChoice = 0;
        char charConfirm = '0';

        do {
            System.out.println("\t\t--- Scientific Calculator ---"); // Prints the calculator interface
            System.out.println("\t1. Add the Numbers");
            System.out.println("\t2. Subtract the Numbers");
            System.out.println("\t3. Multiply Numbers");
            System.out.println("\t4. Divide Numbers");
            System.out.println("\t5. Modulus of Two Numbers");
            System.out.println("\t6. Factorial of a Number");
            System.out.println("\t7. Power of a Number");
            System.out.println("\t8. Exit");
            System.out.print("\tEnter your choice here: ");

            while (!scanner.hasNextInt()) { // Takes user input for menu choice and checks for valid input
                System.out.print("\tInvalid.\n\tPlease enter a valid choice: ");
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
                    System.out.println("\tExiting Calculator..."); // Prints exit message
                    break;
                default:
                    System.out.println("\tInvalid choice. Please enter a valid number from 1-8.\n\n"); // Handles invalid input
                    break;
            }

            if (intUserChoice == 8) { // Confirms user choice upon exit
                while (true) {
                    System.out.println("\tAre you sure you want to exit? (Y/N)");
                    charConfirm = scanner.next().charAt(0);

                    if (charConfirm == 'y' || charConfirm == 'Y') { // Checks character input
                        System.out.println("\tTerminated.");
                        System.exit(0);
                    } else if (charConfirm == 'n' || charConfirm == 'N') {
                        System.out.println("\tReturning to menu...");
                        break;
                    } else { // Handles invalid input
                        System.out.println("\tEnter a valid character.");
                        continue;
                    }
                }
            }
        } while (true);
    }

    // OPERATION METHODS

    // Addition Method
    public static void operationAdd(double dblFirstValue, double dblSecondValue, Scanner scanner) {
        System.out.println("\n\tADDITION");
        System.out.print("\tInput first number: "); // Asks for the first number
        while (!scanner.hasNextDouble()) { // Checks for invalid input
            System.out.print("\tInvalid.\n\tInput first number: ");
            scanner.nextLine(); // Consumes invalid input
        }
        dblFirstValue = scanner.nextDouble();
        scanner.nextLine(); // Consume leftover newline 

        System.out.print("\tInput second number: "); // Asks for the second number
        while (!scanner.hasNextDouble()) {
            System.out.print("\tInvalid.\n\tInput second number: ");
            scanner.nextLine();
        }
        dblSecondValue = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("\t%.1f + %.1f = %.1f\n\n", dblFirstValue, dblSecondValue, (dblFirstValue + dblSecondValue)); // Prints and computes result
    }

    // Subtraction Method
    public static void operationSubtract(double dblFirstValue, double dblSecondValue, Scanner scanner) {
        System.out.println("\n\tSUBTRACTION");
        System.out.print("\tInput first number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("\tInvalid.\n\tInput first number: ");
            scanner.nextLine();
        }
        dblFirstValue = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("\tInput second number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("\tInvalid.\n\tInput second number: ");
            scanner.nextLine();
        }
        dblSecondValue = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("%.1f - %.1f = %.1f\n\n", dblFirstValue, dblSecondValue, (dblFirstValue - dblSecondValue));
    }

    // Multiplication Method
    public static void operationMultiply(double dblFirstValue, double dblSecondValue, Scanner scanner) {
        System.out.println("\n\tMULTIPLICATION");
        System.out.print("\tInput first number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("\tInvalid.\n\tInput first number: ");
            scanner.nextLine();
        }
        dblFirstValue = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("\tInput second number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("\tInvalid.\n\tInput second number: ");
            scanner.nextLine();
        }
        dblSecondValue = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("%.1f x %.1f = %.1f\n\n", dblFirstValue, dblSecondValue, (dblFirstValue * dblSecondValue));
    }

    // Division Method
    public static void operationDivide(double dblFirstValue, double dblSecondValue, Scanner scanner) {
        System.out.println("\n\tDIVISION");
        System.out.print("\tInput first number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("\tInvalid.\n\tInput first number: ");
            scanner.nextLine();
        }
        dblFirstValue = scanner.nextDouble();
        scanner.nextLine();

        while (true) { // Handles an edge case: if divisor is 0
            System.out.print("\tInput second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("\tInvalid.\n\tInput second number: ");
                scanner.nextLine();
            }
            dblSecondValue = scanner.nextDouble();
            scanner.nextLine();

            if (dblSecondValue == 0) {
                System.out.println("\tZero is not a valid divisor.");
                continue;
            } else {
                System.out.printf("\t%.1f / %.1f = %.1f\n\n", dblFirstValue, dblSecondValue, (dblFirstValue / dblSecondValue));
                break;
            }
        }
    }

    // Modulo Method
    public static void operationModulo(double dblFirstValue, double dblSecondValue, Scanner scanner) {
        System.out.println("\n\tMODULO");
        System.out.print("\tInput first number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("\tInvalid.\n\tInput first number: ");
            scanner.nextLine();
        }
        dblFirstValue = scanner.nextDouble();
        scanner.nextLine();

        while (true) {
            System.out.print("\tInput second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("\tInvalid.\n\tInput second number: ");
                scanner.nextLine();
            }
            dblSecondValue = scanner.nextDouble();
            scanner.nextLine();

            if (dblSecondValue == 0) {
                System.out.println("\tZero is not applicable for modulos operation.");
                continue;
            } else {
                System.out.printf("\t%.1f %% %.1f = %.1f\n\n", dblFirstValue, dblSecondValue, (dblFirstValue % dblSecondValue));
                break;
            }
        }
    }

    // Factorial Method
    public static void operationFactorial(Scanner scanner) {
        System.out.println("\n\tFACTORIAL");
        long longFactorial, longResult = 1;
        
        while (true) { // Handles an edge case: if the input is negative
            System.out.print("\tInput a non-negative integer: ");
            if (scanner.hasNextLong()) {
                longFactorial = scanner.nextLong();

                if (longFactorial < 0) {
                    System.out.println("\tFactorial is not defined for negative numbers.");
                    continue;
                }

                break;
            } else {
                System.out.println("\tInvalid input.");
                scanner.next();
            }
        }
        
        for (long i = 1; i <= longFactorial; i++) { // Computes for the factorial
                longResult *= i;
        }

        System.out.printf("\t%d! = %d\n\n", longFactorial, longResult);
    }

    // Power Method
    public static void operationPower(double dblFirstValue, double dblSecondValue, Scanner scanner) {
        System.out.println("\n\tPOWER");
        System.out.print("\tInput the base: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("\tInvalid.\n\tInput the base: ");
            scanner.nextLine();
        }
        dblFirstValue = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("\tInput the exponent: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("\tInvalid.\n\tInput the exponent: ");
            scanner.nextLine();
        }
        dblSecondValue = scanner.nextDouble();
        scanner.nextLine();

        double dblResult = 1; // Initializes variables for positive and negative exponents
        int intResult = 0;
        double dblDecimal;

        if (dblSecondValue >= 0) {
            for (int i = 0; i < dblSecondValue; i++) {
                dblResult *= dblFirstValue;
            }
            
            System.out.printf("\t%.1f ^ %.1f = %.1f\n\n", dblFirstValue, dblSecondValue, dblResult);
        } else { // Handles an edge case: if exponent is negative
            for (int i = 0; i < (-dblSecondValue); i++) {
                dblResult *= dblFirstValue;
                intResult = (int) dblResult; // Typecast double into int
            }
            dblDecimal = 1 / dblResult;

            System.out.printf("\t%.1f ^ %.1f = 1 / %d or %.2f\n\n", dblFirstValue, dblSecondValue, intResult, dblDecimal);
        }
    }
}
