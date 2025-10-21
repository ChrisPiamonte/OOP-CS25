import java.util.*;

public class Item14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[][] matrix, transpose;
        int rows = getSize(console, "row");
        int cols = getSize(console, "column");

        matrix = new int[rows][cols];
        inputMatrix(console, matrix, "Matrix");

        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        transpose = transposeMatrix(matrix);
        System.out.println("\nTransposed Matrix:");
        displayMatrix(transpose);

        console.close();
    }

    static int getSize(Scanner console, String type) {
        System.out.print("Enter the size of the " + type + ": ");
        return console.nextInt();
    }

    static void inputMatrix(Scanner console, int[][] mat, String name) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Enter " + name + "[" + (i + 1) + "][" + (j + 1) + "]: ");
                mat[i][j] = console.nextInt();
            }
        }
    }

    static int[][] transposeMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = mat[i][j];
            }
        }
        return transposed;
    }

    static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.printf("[%4d] ", val);
            }
            System.out.println();
        }
    }
}
