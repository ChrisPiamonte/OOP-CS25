import java.util.Scanner;
// Matrix Transpose
public class Item14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sizes of the matrix:");
        System.out.print("1st Matrix [Row]: ");
        int intRowOne = scanner.nextInt();
        System.out.print("1st Matrix [Column]: ");
        int intColumnOne= scanner.nextInt();
        int[][] intMatrixOne = new int[intRowOne][intColumnOne];
        for(int i = 0;i < intRowOne; i++){
            for(int j = 0; j< intColumnOne;j++){
                System.out.printf("1st Matrix[%d][%d]: ",i,j);
                intMatrixOne[i][j] = scanner.nextInt();
            }
        }
        // Printing the original Matrix
        printMatrix(intMatrixOne, intRowOne, intColumnOne, false);
        // Reverse the Column and Row arguements print transposed Matrix
        printMatrix(intMatrixOne, intColumnOne, intRowOne, true);
        scanner.close();
    }
    public static void printMatrix(int[][] intMatrix, int intFirstSize, int intSecondSize, boolean boolTranspose){
        System.out.println(boolTranspose ? "\nTransposed Matrix\n": "\nOriginal Matrix:\n");

        for (int i = 0; i < intFirstSize; i++) {
            for (int j = 0; j < intSecondSize; j++) {
                System.out.print((boolTranspose ? intMatrix[j][i] : intMatrix[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
