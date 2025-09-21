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
// remember to add comments!!!
public class Group01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //scanner for inputs
        int intChoice = 0;
        double FirstNum= 0;
        double SecondNum = 0;
        // Menu and switch case
        do{
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
            intChoice = scanner.nextInt();
          switch (intChoice) {
            case 1: operationAdd(scanner); break;
            case 2: operationSubtract(scanner); break;
            case 3: operationMultiply(scanner); break; 
            case 4: operationDivide(scanner); break;
            case 5: operationModulo(scanner); break;
            case 6: operationFactorial(scanner); break;
            case 7: operationPower(scanner); break;
            case 8: System.out.println("Exiting Calculator... Goodbye!"); break;
            default: System.out.println("Invalid choice. Please enter a valid number from 1-8");
  }
}
