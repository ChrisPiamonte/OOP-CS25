import java.util.Scanner;

public class Item14 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of rows: ");
    int intRow = sc.nextInt();
    System.out.print("Enter number of columns: ");
    int intCol = sc.nextInt();

    int[][] matrix = new int[intRow][intCol];

    System.out.println("\nEnter elements of the matrix:");
    for (int i = 0; i < intRow; i++) {
        for (int j = 0; j < intCol; j++) {
            System.out.print("Row " + (i + 1) + ", Column " + (j + 1) + ": ");
            matrix[i][j] = sc.nextInt();
        }
    }

    int[][] transposedMatrix = new int[intCol][intRow];

    for (int i = 0; i < intRow; i++) {
        for (int j = 0; j < intCol; j++) {
            transposedMatrix[j][i] = matrix[i][j];
            }
        }

    System.out.println("\nTransposed Matrix:");
    for (int i = 0; i < intCol; i++) {
        for (int j = 0; j < intRow; j++) {
            System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }


    sc.close();
   }    
}
