/*
 * ==========================================================
 *  Machine Problem 1 - Workspace for Group 05
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

public class Group05 {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++){
        System.out.print ("* ");
      }
      System.out.println();
    }

    System.out.println ();

    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print ("* ");
      }
      System.out.println();
    }

    System.out.println ();

    for (int i = 1; i <= n; i++){
      for (int j = 1; j <= i; j++){
        System.out.print (j + " ");
      }
      System.out.println();
    }

    System.out.println();

    for (int i = 1; i <= n; i++){
      for (int k = n - 1; k >= i; k--){
        System.out.print (" ");
      }
      for (int j = 1; j <= i; j++){
        System.out.print ("* ");
      }
      System.out.println();
    }
  }
}
