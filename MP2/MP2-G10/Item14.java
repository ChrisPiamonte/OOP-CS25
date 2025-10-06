import java.util.*;

public class Item14 {
  public static int[][] readMatrix(Scanner sc, int intRows, int intCols) {
    int[][] intMatrix = new int[intRows][intCols];
    System.out.println("Enter the elements of the matrix row by row (integers only).");

    for (int i = 0; i < intRows; i++) {
      for (int j = 0; j < intCols; j++) {
        while (true) {
          System.out.print("matrix[" + i + "][" + j + "]: ");
          if (sc.hasNextInt()) {
            intMatrix[i][j] = sc.nextInt();
            break;
          } else {
            System.out.println("Invalid input! Please enter an integer.");
            sc.next();
          }
        }
      }
    }

    return intMatrix;
  }

  public static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int[][] transposeMatrix(int[][] intMatrix) {
    int intRows = intMatrix.length;
    int intCols = intMatrix[0].length;
    int[][] intMatrixTranspose = new int[intCols][intRows];

    for (int i = 0; i < intRows; i++) {
      for (int j = 0; j < intCols; j++) {
        intMatrixTranspose[j][i] = intMatrix[i][j];
      }
    }

    return intMatrixTranspose;
  }

  public static void main(String[] args) {
    System.out.println("This program asks the user to enter a matrix and then displays its transpose.");
    Scanner sc = new Scanner(System.in);

    int intRows = 0, intCols = 0;

    while (true) {
      System.out.print("Enter the number of rows: ");
      if (sc.hasNextInt()) {
        intRows = sc.nextInt();
        if (intRows > 0) break;
        else System.out.println("Number of rows must be positive.");
      } else {
        System.out.println("Invalid input! Please enter a positive integer.");
        sc.next();
      }
    }

    while (true) {
      System.out.print("Enter the number of columns: ");
      if (sc.hasNextInt()) {
        intCols = sc.nextInt();
        if (intCols > 0) break;
        else System.out.println("Number of columns must be positive.");
      } else {
        System.out.println("Invalid input! Please enter a positive integer.");
        sc.next();
      }
    }

    int[][] intMatrix = readMatrix(sc, intRows, intCols);

    System.out.println("\nOriginal Matrix:");
    printMatrix(intMatrix);

    int[][] intMatrixTranspose = transposeMatrix(intMatrix);
    System.out.println("\nTranspose of the Matrix:");
    printMatrix(intMatrixTranspose);

    sc.close();
  }
}
