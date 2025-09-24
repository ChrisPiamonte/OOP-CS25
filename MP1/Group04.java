/*
 * ==========================================================
 *  Machine Problem 1 - Workspace for Group 04
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

public class Group04 {
  public static void main(String[] args) {
    double dblFirstGrade = 96;
    double dblSecondGrade = 79;
    double dblThirdGrade = 73;
    double dblFourthGrade = 88;
    double dblFifthGrade = 67;

    double fltAverageGrade = (double) (dblFirstGrade + dblSecondGrade + dblThirdGrade + dblFourthGrade + dblFifthGrade) / 5;
    double dblHighestGrade = highest(highest(highest(highest(dblFirstGrade, dblSecondGrade), dblThirdGrade), dblFourthGrade), dblFifthGrade);
    double dblLowestGrade  = lowest(lowest(lowest(lowest(dblFirstGrade, dblSecondGrade), dblThirdGrade), dblFourthGrade), dblFifthGrade); 

    int studentsPassed = 0;
    for (int i = 0; i < 5; i++) {
        double tempGrade = 0; 
        switch (i) {
            case 0: tempGrade = dblFirstGrade; break;
            case 1: tempGrade = dblSecondGrade; break;
            case 2: tempGrade = dblThirdGrade; break;
            case 3: tempGrade = dblFourthGrade; break;
            case 4: tempGrade = dblFifthGrade; break; 
        }
        printGradeRemark(tempGrade);
        if (tempGrade >= 75) {
            studentsPassed++;
        } 
    }
    int studentsFailed = 5 - studentsPassed;

    System.out.println("Highest Grade: " + dblHighestGrade);
    System.out.println("Lowest Grade: " + dblLowestGrade);
    System.out.println("Average Grade: " + fltAverageGrade);
    System.out.println(studentsPassed + " student/s have passed"); 
    System.out.println(studentsFailed + " student/s have failed");
  }

  public static double highest(double newItem, double currentHighest) {
    if (newItem > currentHighest) {
        return newItem;
    } else {
        return currentHighest;
    }
  }
  
  public static double lowest(double newItem, double currentLowest) {
    if (newItem < currentLowest) {
        return newItem;
    } else {
        return currentLowest;
    } 
  }

  public static void printGradeRemark(double intGrade) {
    System.out.print(intGrade + "- ");
    if (intGrade < 75) {
        System.out.println("Fail");
    } else if (intGrade < 80) {
        System.out.println("Good");
    } else if (intGrade < 90) {
        System.out.println("Very Good");
    } else {
        System.out.println("Excellent");
    }
  }
}
