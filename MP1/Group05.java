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
    int intNumber = 5;
    
    // Problem 1
    for (int intI = 1; intI <= intNumber; intI++) {
      for (int intJ = 1; intJ <= intI; intJ++){
        System.out.print ("* ");
      }
      System.out.println();
    }

    System.out.println ();

    //Problem 2
    for (int intI = intNumber; intI >= 1; intI--) {
      for (int intJ = 1; intJ <= intI; intJ++) {
        System.out.print ("* ");
      }
      System.out.println();
    }

    System.out.println ();

    //Problem 3
    for (int intI = 1; intI <= intNumber; intI++){
      for (int intJ = 1; intJ <= intI; intJ++){
        System.out.print (intJ + " ");
      }
      System.out.println();
    }

    System.out.println();

    //Challenge Problem 
    for (int intI = 1; intI <= intNumber; intI++){
      for (int intK = intNumber - 1; intK >= intI; intK--){
        System.out.print (" ");
      }
      for (int intJ = 1; intJ <= intI; intJ++){
        System.out.print ("* ");
      }
      System.out.println();
    }
  }
}
