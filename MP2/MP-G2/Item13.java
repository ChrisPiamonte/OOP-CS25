import java.util.Scanner;

/* Machine Problem 2 Programming Concepts
 * Item 13
 * Write a program that accepts two matrices from the user and computes their product.
 * Display the resulting Matrix.
 */

public class Item13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get matrix dimensions
        System.out.print("Enter the number of rows and columns for Matrix A: ");
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();

        System.out.print("Enter the number of rows and columns for Matrix B: ");
        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();

        /* Error check for initialization of the dimensions.
        *  The number of columns in matrix A must be equal to the number of rows in matrix B.
        */
        if (colsA != rowsB) {
            System.out.println("Error. # of columns in matrix A must be equal to # of rows in matrix B");
            return;
        }

        // Input matrices
        int[][] matrixA = inputMatrix(scanner, rowsA, colsA, "A");
        int[][] matrixB = inputMatrix(scanner, rowsB, colsB, "B");

        // Multiply and display the resulting matrix
        int[][] result = multiplyMatrices(matrixA, matrixB);
        printMatrix(result);

        scanner.close();
    }

    // Method to input elements of the matrix
    static int[][] inputMatrix(Scanner scanner, int rows, int cols, String name) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements for Matrix " + name + ":");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = scanner.nextInt();
        return matrix;
    }

    // Method to multiply the two matrices
    static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++)
            for (int j = 0; j < colsB; j++)
                for (int k = 0; k < colsA; k++)
                    result[i][j] += A[i][k] * B[k][j];

        return result;
    }

    // Method to print a matrix
    static void printMatrix(int[][] matrix) {
        System.out.println("Resulting Matrix:");
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}