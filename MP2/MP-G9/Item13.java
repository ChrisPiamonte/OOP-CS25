import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sizes of the two matrices:");
        System.out.print("1st Matrix [Row]: ");
        int intRowOne = scanner.nextInt();
        System.out.print("1st Matrix [Column]: ");
        int intColumnOne= scanner.nextInt();
        System.out.print("2nt Matrix [Row]: ");
        int intRowTwo = scanner.nextInt();
        System.out.print("2nt Matrix [Column]: ");
        int intColumnTwo= scanner.nextInt();
        int[][] matrixOne = new int[intRowOne][intColumnOne];
        int[][] matrixTwo = new int[intRowTwo][intColumnTwo];
        for(int i = 0;i < 3; i++){
            for(int j = 0; j<3;j++){
                System.out.printf("1st Matrix[%d][%d]: ",i,j);
                matrixOne[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0;i < 3; i++){
            for(int j = 0; j<3;j++){
                System.out.printf("2st Matrix[%d][%d]: ",i,j);
                matrixTwo[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatrix 1:\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix 2:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixTwo[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}
