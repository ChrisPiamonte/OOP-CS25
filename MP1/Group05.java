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

  public static void rightTriangle (int intNumber){
     for (int intI = 1; intI <= intNumber; intI++) { //handles the row number
      for (int intJ = 1; intJ <= intI; intJ++){ // handles the column number and the amount of instances to print *
        System.out.print ("* ");
      }
      System.out.println(); //proceeds to next row/line
    }
  }

  public static void invertedRightTriangle (int intNumber){
    for (int intI = intNumber; intI >= 1; intI--) { // handles the row number
      for (int intJ = 1; intJ <= intI; intJ++) { // handles the column number and the amount of instances to print *
        System.out.print ("* ");
      }
      System.out.println(); //proceeds to next row/line
    }
  }
  public static void numberTriangle (int intNumber){
    for (int intI = 1; intI <= intNumber; intI++){ //handles the row number
      for (int intJ = 1; intJ <= intI; intJ++){ //handles the column number and the amount of instances to print intJ
        System.out.print (intJ + " "); //print the current index number of intJ and a space
      }
      System.out.println(); //proceeds to next row/line
    }
  }
  public static void challengePyramid (int intNumber){
    for (int intI = 1; intI <= intNumber; intI++){ //handles the row number 
      for (int intK = intNumber - 1; intK >= intI; intK--){ //handles the amount of spaces to be printed before printing asterisk/s
        System.out.print (" ");
      }
      for (int intJ = 1; intJ <= intI; intJ++){ // handles the column number and the amount of instances to print * 
        System.out.print ("* ");
      }
      System.out.println(); //proceed to next row/line
    }
  }
  public static void main(String[] args) {
    int intNumber = 5; //hardcode number 
    
    // Problem 1
    rightTriangle(intNumber);
    System.out.println ();

    //Problem 2
    invertedRightTriangle (intNumber);
    System.out.println ();

    //Problem 3
    numberTriangle (intNumber);
    System.out.println();

    //Challenge Problem 
    challengePyramid (intNumber);
  }
}
