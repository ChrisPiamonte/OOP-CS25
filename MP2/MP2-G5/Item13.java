import java.util.Scanner;

public class Item13 {
    static int rows = 4;
    static int columns = 4;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int [][] matrixA = new int [rows][columns];
        int [][] matrixB = new int [rows][columns];

        matrixInput(scanner, matrixA, "first");
        matrixInput(scanner, matrixB, "second");

        System.out.println("The first matrix contains:");
        displayMatrix(matrixA);
        System.out.println("The second matrix contains:");
        displayMatrix(matrixB);

        System.out.println("Product");
        int [][] result = multiplyMatrices(matrixA, matrixB);
        displayMatrix(result);

        scanner.close();
    }

    public static void matrixInput (Scanner scanner, int matrix[][], String name){
        System.out.println("Enter the numbers for the " + name + "matrix:");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB){
        int [][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < columns; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}