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
    double dblFirstNum= 0;
    double dblSecondNum = 0;
    int intChoice = 0;

    // Calculator Interface
    System.out.println("\n--- Calculator ---");
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
    intChoice = scanner.nextInt();

    // Switch case for operations
    switch (intChoice) {
      case 1:
        operationAdd(scanner); // Add numbers
        break;
      case 2: 
        operationSubtract(scanner); // Subtract numbers
        break;
      case 3: 
        operationMultiply(scanner); // Multiply numbers
        break; 
      case 4: 
        operationDivide(scanner); // Divide numbers
        break;
      case 5: 
        operationModulo(scanner); // Modulo numbers
        break;
      case 6: 
        operationFactorial(scanner); // Factorial of a number
        break;
      case 7: 
        operationPower(scanner); // Power of numbers
        break;
      case 8: 
        System.out.println("Exiting Calculator... Goodbye!"); // Exit option
        break;
      default: 
        System.out.println("Invalid choice. Please enter a valid number from 1-8"); // Error handling
        break;
	}

    // Not handling errors as of the moment such as inputting newline
    // Only applicable for addition, subtraction, multiplication, & division
	public static void operationAdd(Scanner scanner) {
		System.out.println("Type numbers to add (Press Enter if done)"); // Need to find a way that when user enter a newline it will stop the loop

		double dblTotalSum = 0;
		/* Only apply this in the dividing operator method
  		int intCounter = 0;
		*/

    	while (true) {
        System.out.print("Enter a number: ");
        if (scanner.hasNextDouble()) { 
			// Checks if the input is a valid double
        	double dblGetNumber = scanner.nextDouble();

			// Iterates each inputted number
        	dblTotalSum += dblGetNumber;
		
			/* Only apply this in the dividing operator method

   			// Counting to locate the position of the number of inputs
        	counter++;
		 
        	// If the divisor is equal to zero then it prints undefined
        	if(intCounter >= 2 && dblGetNumber == 0) {
        		System.out.println("Zero is not a valid number. It is undefine.");
        		break;
    		} 
        	*/
		}
    	else {
        	System.out.println("Invalid input. Please try again.");
        	break;
    		}
    	}
    	scanner.close();
    	System.out.println("Total sum is: " + dblTotalSum); // Need to work on how to not print it if result is undefined
    	// Suggestion, could be transform into a do while loop
		}
	}
}
