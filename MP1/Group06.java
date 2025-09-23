/*
 * ==========================================================
 *  Machine Problem 1 - Workspace for Group 06
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

public class Group06 {

  //methods of calculating factorial
  static long recursiveFactorial(long longNumber){
    //base cases
    if (longNumber == 1 || longNumber == 0){
        return 1;
    }

    //recursive call
    return longNumber * recursiveFactorial(longNumber-1);
  }

  static long iterativeFactorial(long longNumber){
    //stores factorial progress
    long longAccumulator = 1;

    //loops to multiply accumulator by the progress
    for(long longProgress = 1; longProgress <= longNumber; longProgress++ ){
        longAccumulator *= longProgress;
    }

    return longAccumulator;
  }


  //full algorithms, both use the same template as commented
  static void useRecursiveFactorial(long longNumber){
    //variables 
    long longLargestNumberRecursive = 0,
    longLargestValueRecursive = 0,
    longSumAccumulatorRecursive = 0;
    
    //loop for printing and accumulating sum
    System.out.println("\nUsing Recursive Factorial Solution...");
    for (long longRecursiveIndex = 1; longRecursiveIndex <= longNumber; longRecursiveIndex++){
        long longRecursiveFactorialResult = recursiveFactorial(longRecursiveIndex);
        longSumAccumulatorRecursive += longRecursiveFactorialResult;

        //sets largest below 10k for printing below
        if(longRecursiveFactorialResult < 10000){
            longLargestNumberRecursive = longRecursiveIndex;
            longLargestValueRecursive = longRecursiveFactorialResult;
        }
        //print per factorial
        System.out.println(longRecursiveIndex + "! = " + longRecursiveFactorialResult);
    }
    //print sum and largest below 10k
    System.out.println(longLargestNumberRecursive + "! is the biggest below 10000 with value of "+ longLargestValueRecursive);
    System.out.println("Sum of all factorials from 1 to " + longNumber + " is: " + longSumAccumulatorRecursive);
  }

  static void useIterativeFactorial(long longNumber){

    long longLargestValueIterative = 0,
    longLargestNumberIterative = 0,
    longSumAccumulatorIterative = 0;

    System.out.println("\nUsing Iterative Factorial Solution...");
    for(long longIterativeIndex = 1; longIterativeIndex <= longNumber; longIterativeIndex++){
        long longIterativeFactorialResult = iterativeFactorial(longIterativeIndex);
        longSumAccumulatorIterative += longIterativeFactorialResult;

        if(longIterativeFactorialResult < 10000){
            longLargestNumberIterative = longIterativeIndex;
            longLargestValueIterative = longIterativeFactorialResult;
        }

        System.out.println(longIterativeIndex + "! = " + longIterativeFactorialResult);
    }

    System.out.println(longLargestNumberIterative + "! is the biggest below 10000 with value of "+ longLargestValueIterative);
    System.out.println("Sum of all factorials from 1 to " + longNumber + " is: " + longSumAccumulatorIterative);
  }
  public static void main(String[] args) {
      long longNumber = 20;
      
      //negative checker for N
      if (longNumber < 0){
          System.out.println("number is negative, factorial is not defined for negatives :<");
          return;
      }

      //use both factorial algorithms
      useIterativeFactorial(longNumber);
      useRecursiveFactorial(longNumber);
  }   
}
