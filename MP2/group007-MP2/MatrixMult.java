import java.util.InputMismatchException;
import java.util.*;

public class MatrixMult {
    public static void main(String[] args) {
        try {
            Scanner matrixIn = new Scanner(System.in);
            Scanner lengthIn = new Scanner(System.in);

            System.out.println("Enter the length of the X and Y for your First Matix: ");
            int LENGTH_X_AXIS_ONE = lengthIn.nextInt();
            int LENGTH_Y_AXIS_ONE = lengthIn.nextInt();

            System.out.println("Enter the length of the X and Y for your Second Matix: ");
            int LENGTH_X_AXIS_TWO = lengthIn.nextInt();
            int LENGTH_Y_AXIS_TWO = lengthIn.nextInt();

            if (LENGTH_Y_AXIS_ONE != LENGTH_X_AXIS_TWO) {
                System.out.println("Matrix multiplication not possible! The Y length of the first matrix must equal the X length of the second matrix.");
                lengthIn.close();
                matrixIn.close();
                return;
            }

            int[][] matrixHolderOne = new int[LENGTH_X_AXIS_ONE][LENGTH_Y_AXIS_ONE];
            int[][] matrixHolderTwo = new int[LENGTH_X_AXIS_TWO][LENGTH_Y_AXIS_TWO];
            int[][] matrixMult = new int[LENGTH_X_AXIS_ONE][LENGTH_Y_AXIS_TWO];

            System.out.println("Enter the numbers for your First matrix: ");
            for (int i = 0; i < LENGTH_X_AXIS_ONE; i++) {
                for (int j = 0; j < LENGTH_Y_AXIS_ONE; j++) {
                    System.out.printf("Enter value for First Matrix [%d][%d]: ", i, j);
                    matrixHolderOne[i][j] = matrixIn.nextInt();
                }
            }

            System.out.println("Enter the numbers for your Second matrix: ");
            for (int i = 0; i < LENGTH_X_AXIS_TWO; i++) {
                for (int j = 0; j < LENGTH_Y_AXIS_TWO; j++) {
                    System.out.printf("Enter value for Second Matrix [%d][%d]: ", i, j);
                    matrixHolderTwo[i][j] = matrixIn.nextInt();
                }
            }

            for (int i = 0; i < LENGTH_X_AXIS_ONE; i++) {
                for (int j = 0; j < LENGTH_Y_AXIS_TWO; j++) {
                    matrixMult[i][j] = 0;
                    for (int k = 0; k < LENGTH_Y_AXIS_ONE; k++) {
                        matrixMult[i][j] += matrixHolderOne[i][k] * matrixHolderTwo[k][j];
                    }
                }
            }

            System.out.println("Result of Matrix Multiplication:");
            for (int i = 0; i < LENGTH_X_AXIS_ONE; i++) {
                for (int j = 0; j < LENGTH_Y_AXIS_TWO; j++) {
                    System.out.print(matrixMult[i][j] + " ");
                }
                System.out.println();
            }
            matrixIn.close();
            lengthIn.close();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers only.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}