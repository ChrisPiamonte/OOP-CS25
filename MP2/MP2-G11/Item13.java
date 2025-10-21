import java.util.*;

public class Item13 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[][] mat1, mat2, result;

        System.out.println("Matrix A: ");
        int sizeOfRowA = getSize(console, "row");
        int sizeOfColA = getSize(console, "column");

        System.out.println("\nMatrix B: ");
        int sizeOfRowB = getSize(console, "row");
        int sizeOfColB = getSize(console, "column");

        if (sizeOfColA != sizeOfRowB) {
            System.out.println("\nMatrix multiplication NOT possible! Columns of A must equal rows of B.");
            return;
        }

        mat1 = new int[sizeOfRowA][sizeOfColA];
        mat2 = new int[sizeOfRowB][sizeOfColB];

        inputMatrix(console, mat1, "A");
        inputMatrix(console, mat2, "B");

        result = multiplyMatrices(mat1, mat2);

        System.out.println("\nMatrix A:");
        displayMatrix(mat1);
        System.out.println("\nMatrix B:");
        displayMatrix(mat2);
        System.out.println("\nMatrix A x B:");
        displayMatrix(result);

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

    static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length, colsA = a[0].length, colsB = b[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
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

