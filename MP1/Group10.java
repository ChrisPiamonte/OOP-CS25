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

public class Group10 {
  public static final int INT_RANGE_MIN = 100;
  public static final int INT_RANGE_MAX = 999;

  public static void main(String[] args) {
    int intSum = 0;

    for (int intI = INT_RANGE_MIN; intI <= INT_RANGE_MAX; intI++) {
      int intDigit1 = intI / 100;
      int intDigit2 = (intI / 10) % 10;
      int intDigit3 = intI % 10;

      int intCube1 = intDigit1 * intDigit1 * intDigit1;
      int intCube2 = intDigit2 * intDigit2 * intDigit2;
      int intCube3 = intDigit3 * intDigit3 * intDigit3;

      if (intI == intCube1 + intCube2 + intCube3) {
        intSum += intI;
        System.out.print  (intI + " ");
      }
    }
    System.out.println("\nSum: " + intSum);
  }
}
