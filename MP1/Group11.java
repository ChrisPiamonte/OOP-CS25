/*
 * ==========================================================
 *  Machine Problem 1 - Workspace for Group 11
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

public class Group11 {
  public static void main(String[] args) {


    int intPrimeCount = 0;
    int intLargestPrime = 0;
    int intPrimeSum = 0;

    System.out.print("Prime Numbers (1-100): ");

    for(int i = 1; i <= 100; i++){
      boolean boolIsPrime = true; // Assume number is a prime

      if(i <= 1){ //Checks if number is less than or equal to 1
        boolIsPrime = false; //If so the number is not a prime

      } else {
        for(int j = 2; j * j <= i; j++){ //Checks 2 onwards if number is divisible by it
          if (i % j == 0){
            boolIsPrime = false;  // If so then it is not a prime
            break;
          }
        }
      }
      
      if(boolIsPrime){  //If number is prime increment count, add to sum and assume it is the largest
        intPrimeCount++;
        intPrimeSum += i;
        intLargestPrime = i;  //Largest will keep changing until loop stops
        System.out.print(i + " "); //Displays to the list of prime number
      }
    }
    
    //Display numbers count, sum and the largest prime
    System.out.println();
    System.out.printf("Prime Numbers Count: %d\n", intPrimeCount);
    System.out.printf("Sum of all Primes(1-100): %d\n", intPrimeSum);
    System.out.printf("Largest Prime: %d", intLargestPrime);
  }
}
