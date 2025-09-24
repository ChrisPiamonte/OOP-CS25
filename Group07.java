/*
 * ==========================================================
 *  Machine Problem 1 - Workspace for Group 07
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

 public class Group07 {
    public static void main(String[] args) {

        // Hardcoded base and exponent limit as per instructions
        final int BASE = 3;
        final int EXPONENT_LIMIT = 10;
        final int SUM_LIMIT = 10000;

        int power;
        int sumOfPowers = 0;
        
        for (int i = 1; i <= EXPONENT_LIMIT; i++) {
            power = (int) Math.pow(BASE, i);
            if ((sumOfPowers += power) > SUM_LIMIT) {
                sumOfPowers -= power; // Reverse the previous operation to get the value before it exceeded 10,000
                break;
            }
            else {
                System.out.println(BASE + "^" + i + " = " + power);
            }
        }
        System.out.println("Sum of powers: " + sumOfPowers);
        System.out.println("The succeeding power makes the sum of powers exceed 10,000");
    }
}

