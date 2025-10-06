import java.util.Scanner;

public class Item13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter size of Matrix A");
        System.out.print("Row/s: ");
        int intRowA = sc.nextInt();
        System.out.print("Column/s: ");
        int intColA = sc.nextInt();

        System.out.println("\nPlease enter size of Matrix B");
        System.out.print("Row/s: ");
        int intRowB = sc.nextInt();
        System.out.print("Column/s: ");
        int intColB = sc.nextInt();

        if (intColA != intRowB) {
            System.out.println("Invalid Matrix sizes. Number of columns of Matrix A must equal number of rows of Matrix B.");
            sc.close();
            return;
        }

        int[][] A = new int[intRowA][intColA];
        int[][] B = new int[intRowB][intColB];
        int[][] result = new int[intRowA][intColB];

        System.out.println("\nEnter elements for Matrix A:");
        for (int i = 0; i < intRowA; i++) {
            for (int j = 0; j < intColA; j++) {
                System.out.print("Row " + (i + 1) + ", Col " + (j + 1) + ": ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter elements for Matrix B:");
        for (int i = 0; i < intRowB; i++) {
            for (int j = 0; j < intColB; j++) {
                System.out.print("Row " + (i + 1) + ", Col " + (j + 1) + ": ");
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < intRowA; i++) {
            for (int j = 0; j < intColB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < intColA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("\nMatrix A:");
        for (int i = 0; i < intRowA; i++) {
            for (int j = 0; j < intColA; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix B:");
        for (int i = 0; i < intRowB; i++) {
            for (int j = 0; j < intColB; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nResult Matrix (A x B):");
        for (int i = 0; i < intRowA; i++) {
            for (int j = 0; j < intColB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
