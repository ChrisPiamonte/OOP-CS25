/*
 * 14. Transpose of a Matrix
 * Ask the user to enter a matrix and display its transpose.
 */

import java.util.Scanner;

public class Item14 {
    public static void main (String[] args){

        try (Scanner scanner = new Scanner(System.in)) {

            // Input validation for rows
            int intRows = 0;
            while (true) {
                System.out.print("Enter number of rows: ");
                if (scanner.hasNextInt()) {
                    intRows = scanner.nextInt();
                    if (intRows > 0) break;
                    else System.out.println("Please enter a positive integer.");
                } else {
                    System.out.println("Invalid input! Please enter a number.");
                    scanner.next(); // clear invalid input
                }
            }

            // Input validation for columns
            int intColumns = 0;
            while (true) {
                System.out.print("Enter number of columns: ");
                if (scanner.hasNextInt()) {
                    intColumns = scanner.nextInt();
                    if (intColumns > 0) break;
                    else System.out.println("Please enter a positive integer.");
                } else {
                    System.out.println("Invalid input! Please enter a number.");
                    scanner.next(); // clear invalid input
                }
            }

            // Safe matrix input with error handling
            int[][] matrix = inputMatrix(scanner, intRows, intColumns);

            System.out.println("\nOriginal Matrix:");
            printMatrix(matrix);

            System.out.println("\nTransposed Matrix:");
            int[][] transpose = transposeMatrix(matrix);
            printMatrix(transpose);
        }
    }

    // Method to input matrix
    public static int[][] inputMatrix(Scanner scanner, int intRows, int intColumns){
        int[][] matrix = new int[intRows][intColumns];
        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < intRows; i++) {
            for (int j = 0; j < intColumns; j++) {
                while (true) {
                    System.out.print("[" + (i+1) + "][" + (j+1) + "]: ");
                    if (scanner.hasNextInt()) {
                        matrix[i][j] = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Invalid input! Please enter an integer.");
                        scanner.next(); // clear invalid input
                    }
                }
            }
        }
        return matrix;
    }

    // Method to print matrix
    public static void printMatrix(int[][] matrix) {
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
