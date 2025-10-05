import java.util.Scanner;

public class Item13 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row for the first matrix:");
        int firstMatrixRow = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of column for the first matrix:");
        int firstMatrixColumn = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of row for the second matrix:");
        int secondMatrixRow = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of column for the second matrix:");
        int secondMatrixColumn = Integer.parseInt(scanner.nextLine());

        int[][] matrixOne = new int[firstMatrixRow][firstMatrixColumn];
        int[][] matrixTwo = new int[secondMatrixRow][secondMatrixColumn];

        scanner.close();
    }

    public static int[][] 

}
