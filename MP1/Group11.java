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
    int[] intRange = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100}; 

    //Hardcoded Range 1-100

    int intPrimeCount = 0;
    int intLargestPrime = 0;
    int intPrimeSum = 0;

    System.out.print("Prime Numbers (1-100): ");

    for(int i = 0; i < intRange.length; i++){
      boolean boolIsPrime = true; // Assume number is a prime

      if(intRange[i] <= 1){ //Checks if number is less than or equal to 1
        boolIsPrime = false; //If so the number is not a prime

      } else {
        for(int j = 2; j * j <= intRange[i]; j++){ //Checks 2 onwards if number is divisible by it
          if (intRange[i] % j == 0){
            boolIsPrime = false;  // If so then it is not a prime
            break;
          }
        }
      }
      
      if(boolIsPrime){  //If number is prime increment count, add to sum and assume it is the largest
        intPrimeCount++;
        intPrimeSum += intRange[i];
        intLargestPrime = intRange[i];  //Largest will keep changing until loop stops
        System.out.print(intRange[i] + " "); //Displays to the list of prime number
      }
    }
    
    //Display numbers count, sum and the largest prime
    System.out.println();
    System.out.printf("Prime Numbers Count: %d\n", intPrimeCount);
    System.out.printf("Sum of all Primes(1-100): %d\n", intPrimeSum);
    System.out.printf("Largest Prime: %d", intLargestPrime);
  }
}
