import java.util.Scanner;

public class Item13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sizes of the two matrices:");
        int[][] matrixOne = getMatrix("One", scanner);
        int[][] matrixTwo = getMatrix("Two", scanner);
        if(!validateMatrices(matrixOne[0].length, matrixTwo.length)){
            System.out.println("\nERROR: The Column of the first matrix and the Row of the second matrix must match to multiply.");
        } else {
            printMatrix("One", matrixOne);
            printMatrix("Two", matrixTwo);
            int[][] matrixResult = multiplyMatrices(matrixOne, matrixTwo);
            printMatrix("Result", matrixResult);
        }
    }
    public static boolean validateMatrices(int matrixOneCol, int matrixTwoRow){
        return matrixOneCol == matrixTwoRow;
    }
    public static int[][] getMatrix(String strArrayLabel, Scanner scanner){
        System.out.printf("\nSizes of the Matrix %s:\n", strArrayLabel);
        System.out.printf("Matrix %s [Row]: ", strArrayLabel);
        int intRow= scanner.nextInt();
        System.out.printf("Matrix %s [Column]: ", strArrayLabel);
        int intColumn= scanner.nextInt();
        int[][] matrixTemp = new int[intRow][intColumn];
        System.out.println("\nNow put the values inside of the matrix:");
        for(int i = 0;i < intRow; i++){
            for(int j = 0; j< intColumn;j++){
                System.out.printf("Matrix %s [%d][%d]: ", strArrayLabel, i, j);
                matrixTemp[i][j] = scanner.nextInt();
            }
        }
        return matrixTemp;
    }
    public static void printMatrix(String strArrayLabel, int[][] matrix) {
        int intRow = matrix.length;
        int intColumn = matrix[0].length;
        System.out.printf("\n--- Matrix %s ---\n", strArrayLabel);
        for(int i = 0;i < intRow; i++){
            for(int j = 0; j< intColumn;j++){
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] multiplyMatrices(int[][] matrixOne, int[][] matrixTwo){
        int intRowOne = matrixOne.length;
        int intColumnOne = matrixOne[0].length;
        int intColumnTwo = matrixTwo[0].length;

        int[][] matrixTemp = new int[intRowOne][intColumnTwo];
        for(int i = 0;i < intRowOne; i++){
            for(int j = 0; j< intColumnTwo;j++){
                matrixTemp[i][j] = 0;
                for(int n = 0; n < intColumnOne; n++){
                    matrixTemp[i][j] += matrixOne[i][n] * matrixTwo[n][j];
                }
            }
        }
        return matrixTemp;
    }
}
