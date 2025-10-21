
import java.util.*;

public class Item13 {

    public static int inputValidation(Scanner console, String strPrompt) {
        int intValue;
        System.out.print(strPrompt);

        while (true) {
            if (console.hasNextInt()) {
                intValue = console.nextInt();
                if (intValue <= 0) {
                    System.out.print("Please enter a positive integer: ");
                } else {
                    return intValue;
                }
            } else {
                System.out.print("Invalid input. Please enter a positive integer: ");
                console.next();
            }
        }
    }

    public static void intMultiplicationOfMatrices(int[][] intMatrixA, int[][] intMatrixB, int[][] intMultipliedMatrices, int intRowSize, int intColumnSize) {
        int int1stIndex, int2ndIndex, int3rdIndex;

        for (int1stIndex = 0; int1stIndex < intRowSize; int1stIndex++) {
            for (int2ndIndex = 0; int2ndIndex < intColumnSize; int2ndIndex++) {
                intMultipliedMatrices[int1stIndex][int2ndIndex] = 0;
                for (int3rdIndex = 0; int3rdIndex < intColumnSize; int3rdIndex++) {
                    intMultipliedMatrices[int1stIndex][int2ndIndex] += intMatrixA[int1stIndex][int3rdIndex] * intMatrixB[int3rdIndex][int2ndIndex];
                }
            }
        }

        System.out.println("\nThe resulting matrix after multiplication is:");
        for (int1stIndex = 0; int1stIndex < intRowSize; int1stIndex++) {
            for (int2ndIndex = 0; int2ndIndex < intColumnSize; int2ndIndex++) {
                System.out.print(intMultipliedMatrices[int1stIndex][int2ndIndex] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int intColumnSize;
        int intRowSize;
        int int1stIndex, int2ndIndex;

        Scanner console = new Scanner(System.in);

        System.out.println("Please enter the size of the matrices");
        intRowSize = inputValidation(console, "Number of rows: ");
        intColumnSize = inputValidation(console, "Number of columns: ");
        int[][] intMatrixA = new int[intRowSize][intColumnSize];
        int[][] intMatrixB = new int[intRowSize][intColumnSize];
        int[][] intMultipliedMatrices = new int[intRowSize][intColumnSize];

        System.out.println("\nEnter the elements of Matrix A:");
        for (int1stIndex = 0; int1stIndex < intRowSize; int1stIndex++) {
            for (int2ndIndex = 0; int2ndIndex < intColumnSize; int2ndIndex++) {
                intMatrixA[int1stIndex][int2ndIndex] = inputValidation(console, "Element [" + (int1stIndex + 1) + "][" + (int2ndIndex + 1) + "]: ");
            }
        }

        System.out.println("\nEnter the elements of Matrix B:");
        for (int1stIndex = 0; int1stIndex < intRowSize; int1stIndex++) {
            for (int2ndIndex = 0; int2ndIndex < intColumnSize; int2ndIndex++) {
                intMatrixB[int1stIndex][int2ndIndex] = inputValidation(console, "Element [" + (int1stIndex + 1) + "][" + (int2ndIndex + 1) + "]: ");
            }
        }

        intMultiplicationOfMatrices(intMatrixA, intMatrixB, intMultipliedMatrices, intRowSize, intColumnSize);

        console.close();

    }

}
