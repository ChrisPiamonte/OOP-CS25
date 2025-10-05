/*
 * Transpose of a Matrix
 * Ask the user to enter a matrix and display its transpose.
 */

import java.util.Scanner;

public class Item14 {
    public static void main (String[] args){

         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter number of rows: ");
         int intRows = scanner.nextInt();
         System.out.print("Enter number of columns: ");
         int intColumns = scanner.nextInt();

         int [][] matrix = inputMatrix(scanner, intRows, intColumns);

         System.out.println("\nOriginal Matrix:");
         printMatrix(matrix);


         System.out.println("\nTransposed Matrix:");
         int[][] transpose = transposeMatrix(matrix);
         printMatrix(transpose);


         scanner.close();
    }

    // Method to input matrix
    public static int[][] inputMatrix(Scanner scanner, int intRows, int intColumns){
        int[][] matrix = new int[intRows][intColumns];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < intRows; i++) {
            for (int j = 0; j < intColumns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Method to print matrix
    public static void  printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

     // Method to compute transpose
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}