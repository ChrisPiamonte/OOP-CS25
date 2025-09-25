/*
 * ==========================================================
 *  Machine Problem 1 - Workspace for Group 03
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

public class Group03 {
  public static void main(String[] args) {
    System.out.println("\nGroup 03 Min/Max Tracker with Running Average (No Arrays)");
    
    // hardcoded n numbers
    int intNum1 = 5;
    int intNum2 = 4;
    int intNum3 = 7;
    int intNum4 = 3;
    int intNum5 = 9;
    int intMax = Integer.MIN_VALUE;
    int intMin = Integer.MAX_VALUE;
    int intSum = 0; // for calculating average
    int intCounter = 0; // for calculating average
    double dblAve; 
    double dblLastAve; // for final average
    int intAboveAve = 0; // for challenge part
    int intBelowAve = 0; // for challenge part
    
    // printing hardcoded n numbers
    System.err.println("\nEnter a number");
    for (int intI = 0; intI < 5; intI++){
      int intCurr = 0;
      switch(intI){
        case 0: intCurr = intNum1; break;
        case 1: intCurr = intNum2; break;
        case 2: intCurr = intNum3; break;
        case 3: intCurr = intNum4; break;
        case 4: intCurr = intNum5; break;
      }
      
      System.out.printf("Input %d: %d\n", intI+1, intCurr);
    }

    // loop for tracking max, min, and average
    System.out.print("\nTracking the Maximum, Minimum, and Average");
    for (int intI = 0; intI < 5; intI++){
      int intCurr = 0;
      switch(intI){
        case 0: intCurr = intNum1; break;
        case 1: intCurr = intNum2; break;
        case 2: intCurr = intNum3; break;
        case 3: intCurr = intNum4; break;
        case 4: intCurr = intNum5; break;
      }
      if(intCurr > intMax){
        intMax = intCurr;
      }

      if(intCurr < intMin){
        intMin = intCurr;
      }

      intSum = intSum+ intCurr;
      intCounter++;

      dblAve = (double)intSum / intCounter;

      System.out.printf("\nCurrent Number: %d, max = %d, min = %d, average = %.2f ", intCurr, intMax, intMin, dblAve);
    }

    dblLastAve = (double)intSum / intCounter;

    System.out.println("\n\nFinal Results");
    System.out.printf("Maximum: %d\n", intMax);
    System.out.printf("Minimum: %d\n", intMin);
    System.out.printf("Final Average: %.2f\n", dblLastAve);
    System.out.println("\nChallenge Part");

    for(int intI = 0; intI<5 ; intI++){
      int intCurr = 0;
      switch(intI){
        case 0: intCurr = intNum1; break;
        case 1: intCurr = intNum2; break;
        case 2: intCurr = intNum3; break;
        case 3: intCurr = intNum4; break;
        case 4: intCurr = intNum5; break;
      }

      if (intCurr > dblLastAve){
        intAboveAve++;
      } else if(intCurr < dblLastAve){
        intBelowAve++;
      }
    }

    System.out.printf("Above Average Count: %d\nBelow Average Count: %d", intAboveAve, intBelowAve);

  }
}
