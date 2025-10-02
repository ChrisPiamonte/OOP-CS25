import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sizes of the matrix:");
        System.out.print("1st Matrix [Row]: ");
        int intRowOne = scanner.nextInt();
        System.out.print("1st Matrix [Column]: ");
        int intColumnOne= scanner.nextInt();
        int[][] matrixOne = new int[intRowOne][intColumnOne];  
        for(int i = 0;i < 3; i++){
            for(int j = 0; j<3;j++){
                System.out.printf("1st Matrix[%d][%d]: ",i,j);
                matrixOne[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nMatrix 1:\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }


    }
}
