import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of the matrix : ");
        int x = sc.nextInt();
        System.out.print("Enter the number of columns of the matrix : ");
        int y = sc.nextInt();

        int[][] arr = new int[x][y];
        int[][] transposeArr = new int[x][y];

        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Enter element [" + i + "][" + j + "] of the array : ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                transposeArr[i][j] = arr[j][i];
            }
        }

        System.out.println("\nOriginal Matrix: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }

        System.out.println("\nTranspose of the Matrix: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(transposeArr[i][j] + " ");
            }
        }

    }
}
