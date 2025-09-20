/*
 * ==========================================================
 *  Machine Problem 1 - Workspace for Group 10
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

public class Group10_1 {
  public static final int INT_RANGE_MIN = 100;
  public static final int INT_RANGE_MAX = 999;

  public static boolean isArmstrong(int intN) {
    int intTemp = intN;
    int intDigitCount = 0;
    int intPowSum = 0;

    while (intTemp > 0) {
      intTemp /= 10;
      intDigitCount++;
    }
    intTemp = intN;

    while (intTemp > 0) {
      int intDigit = intTemp % 10;
      intPowSum += (int)Math.pow(intDigit, intDigitCount);
      intTemp /= 10;
    }

    return intN == intPowSum;
  }

  public static void main(String[] args) {
    int intSum = 0;
    for (int intI = INT_RANGE_MIN; intI <= INT_RANGE_MAX; intI++) {
      if (isArmstrong(intI)) {
        System.out.print(intI + " ");
        intSum += intI;
      }
    }
    System.out.println("\nSum: " + intSum);
  }
}
