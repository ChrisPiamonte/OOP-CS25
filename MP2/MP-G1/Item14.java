import java.util.*;

public class Item14 {
    static Scanner scanner = new Scanner(System.in);
    static int intRows, intColumns;

    public static void main(String[] args) {
        System.out.print("\n\n\n\tGroup 1 - Item 14: Transpose of a Matrix");

        System.out.print("\n\n\tInput the number of rows in the matrix."); // Asks the user for the number of rows
        intRows = inputSize(scanner);
        
        System.out.print("\n\n\tInput the number of columns in the matrix."); // Asks the user for the number of columns
        intColumns = inputSize(scanner);

        float[][] arrMatrix = new float[intRows][intColumns]; // Asks the user for the elements of the matrix
        System.out.println("\n\n\tInput the elements of the matrix.\n");
        
        for (int i = 0; i < intRows; i++) {
            for (int j = 0; j < intColumns; j++) {
                System.out.printf("\tMatrix[%d][%d]: ", i, j);
                arrMatrix[i][j] = inputMatrix(scanner);
                System.out.println();
            }
        }

        System.out.print("\n\n\n\tMatrix: "); // Displays the user input matrix
        displayMatrix(arrMatrix, intRows, intColumns);

        float[][] arrTranspose = new float[intColumns][intRows]; // Calculates the transpose of the input matrix
        for (int i = 0; i < intRows; i++) {
            for (int j = 0; j < intColumns; j++) {
                arrTranspose[j][i] = arrMatrix[i][j];
            }
        }

        System.out.print("\n\tTransposed Matrix: "); // Displays the transposed matrix
        displayMatrix(arrTranspose, intColumns, intRows);

        System.out.print("\n\n\n\tThank you for using this program! Exiting...\n");
        scanner.close();
    }

    public static int inputSize(Scanner scanner) { // Checks the user input for the matrix size
        int intNumber = -1;

        while (intNumber <= 0) {
            System.out.print("\n\n\tEnter a positive integer: ");
            if (scanner.hasNextInt()) {
                intNumber = scanner.nextInt();
                scanner.nextLine(); // Consumes the leftover new line

                if (intNumber <= 0) {
                    System.out.print("\tInvalid input."); 
                }
            } else {
                System.out.print("\tInvalid input.");
                scanner.nextLine(); 
            }
        }

        return intNumber;
    }

    public static float inputMatrix(Scanner scanner) { // Checks the user input for the matrix elements
        float fltNumber;

        while (!scanner.hasNextFloat()) {
            System.out.print("\tInvalid input. Enter a number: ");
            scanner.nextLine();
        }

        fltNumber = scanner.nextFloat();
        scanner.nextLine();
        return fltNumber;
    }

    public static void displayMatrix(float[][] arrMatrix, int intRows, int intColumns) { // Displays the given matrix
        System.out.print("{");
        for (int i = 0; i < intRows; i++) {
            System.out.print("\n\t\t");
            for (int j = 0; j < intColumns; j++) {
                System.out.printf("%6.2f", arrMatrix[i][j]); 
            }
        }
        System.out.println("\n\t}");
    }
}
