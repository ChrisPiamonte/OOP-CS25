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
import java.util.Scanner;

public class Group01 {
  public static void main(String[] args) {
    // Initialize scanner
    Scanner scanner = new Scanner(System.in);

    // Standard variables
    double dblFirstNumber = 0;
    double dblSecondNumber = 0;
    int intUserChoice = 0;
	char charConfirm = 0;

	do {
    	// Calculator Interface
    	System.out.println("--- Scientific Calculator ---");
    	System.out.println("1. Add the Numbers");
    	System.out.println("2. Subtract the Numbers");
    	System.out.println("3. Multiply Numbers");
    	System.out.println("4. Divide Numbers");
    	System.out.println("5. Modulus of Two Numbers");
    	System.out.println("6. Factorial of a Number");
    	System.out.println("7. Power of a Number");
    	System.out.println("8. EXIT");
    	System.out.print("Enter your choice here: ");

    	// Take input for Menu Choice
    	intUserChoice = scanner.nextInt();

    	// Switch case for operations
    	switch (intUserChoice) {
      		case 1:
        		operationAdd(dblFirstNumber, dblSecondNumber, scanner); // Add numbers
        		break;
      		case 2: 
        		operationSubtract(dblFirstNumber, dblSecondNumber, scanner); // Subtract numbers
        		break;
      		case 3: 
        		operationMultiply(dblFirstNumber, dblSecondNumber, scanner); // Multiply numbers
        		break; 
      		case 4: 
        		operationDivide(dblFirstNumber, dblSecondNumber, scanner); // Divide numbers
        		break;
      		case 5: 
        		operationModulo(dblFirstNumber, dblSecondNumber, scanner); // Modulo numbers
        		break;
      		case 6: 
        		operationFactorial(dblFirstNumber, scanner); // Factorial of a number
        		break;
      		case 7: 
        		operationPower(dblFirstNumber, dblSecondNumber, scanner); // Power of numbers
        		break;
      		case 8: 
        		System.out.println("Exiting Calculator..."); // Exit option
        		break;
      		default: 
        		System.out.println("Invalid choice. Please enter a valid number from 1-8"); // Error handling
        		break;
			}

		// Exit Confirmation
		if (inputOperation == 8) {
			// Loop until user inputs Y or N
        	while (true) {
                System.out.println("Are you sure you want to exit? (Y/N)"); // Ask for confirmation
                charConfirm = scanner.next().charAt(0); // Takes the first character
				// if input is Y immediately exit
                if (charConfirm == 'y' || charConfirm == 'Y') {
                    System.out.println("Terminated.");
                    System.exit(0);
                } else if (charConfirm == 'n' || charConfirm == 'N') { // If input is N then return to menu
                    System.out.println("Returning to menu...");
                    break;
                } else { // if Input is none of the above, repeat loop
                    System.out.println("Enter a valid character (Y/N):");
                    continue;
                	}
            	}
            }
		
		} while (true);
	}

	// PUBLIC OPERATION METHODS

	// Add Method
	public static void operationAdd(double dblFirstValue, double dblSecondValue, Scanner scanner) {
		// Input first number
        System.out.print("Input first number: ");
        dblFirstValue = scanner.nextDouble();
        // Input second number
        System.out.print("Input second number: ");
        dblSecondValue = scanner.nextDouble();
        // Print output
        System.out.printf("%.1f + %.1f = %.1f\n\n", dblFirstValue, dblSecondValue, (dblFirstValue + dblSecondValue));
	}

    // Subtract Method
    public static void operationSubtract(double dblFirstValue, double dblSecondValue, Scanner scanner) {
        // Input first number
        System.out.print("Input first number: ");
        dblFirstValue = scanner.nextDouble();
        // Input second number
        System.out.print("Input second number: ");
        dblSecondValue = scanner.nextDouble();
        // Print output
        System.out.printf("%.1f - %.1f = %.1f\n\n", dblFirstValue, dblSecondValue, (dblFirstValue - dblSecondValue));
    }

    // Multiply Method
    public static void product(double dblFirstValue, double dblSecondValue, Scanner scanner) {
        // Input first number
        System.out.print("Input first number: ");
        dblFirstValue = scanner.nextDouble();
        // Input second number
        System.out.print("Input second number: ");
        dblSecondValue = scanner.nextDouble();
        // Print output
        System.out.printf("%.1f x %.1f = %.1f\n\n", dblFirstValue, dblSecondValue, (dblFirstValue * dblSecondValue));
    }

    // Divide Method
    public static void divide(double dblFirstValue, double dblSecondValue, Scanner scanner) {
        // Input first number
        System.out.print("Input first number: ");
        dblFirstValue = scanner.nextDouble();
        // Error case handling if divisor is 0
        while (true) {
            System.out.print("Input second number: ");
            dblSecondValue = scanner.nextDouble();
            // Conditionals
            if (dblSecondValue == 0) {
                // Return to top if divisor is 0
                System.out.println("Zero is not a valid divisor.");
                continue;
            } else {
                // Print output
                System.out.printf("%.1f / %.1f = %.1f\n\n", dblFirstValue, dblSecondValue, (dblFirstValue / dblSecondValue));
                break;
            }
        }
    }

    // Modulo Method
    public static void modulo(double dblFirstValue, double dblSecondValue, Scanner scanner) {
        // Input first number
        System.out.print("Input first number: ");
        dblFirstValue = scanner.nextDouble();

        // Error case handling in case of 0 modulos
        while (true) {
            // Input second number
            System.out.print("Input second number: ");
            dblSecondValue = scanner.nextDouble();
            // Conditionals
            if (dblSecondValue == 0) {
                // If divisor is 0, return to top
                System.out.println("Zero is not applicable for modulos operation.");
                continue;
            } else {
                // Print output
                System.out.printf("%.1f %% %.1f = %.1f\n\n", dblFirstValue, dblSecondValue, (dblFirstValue % dblSecondValue));
                break;
            }
        }
    }
}
