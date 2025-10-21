import java.util.Scanner;

public class Item14 {

    static int[][] getTransposeMatrix(int[][] intMatrix) {
        int intRows = intMatrix.length;
        int intColumns = intMatrix[0].length;
        int[][] intTransposeMatrix = new int[intColumns][intRows];

        for (int intRow = 0; intRow < intRows; intRow++) {
            for (int intColumn = 0; intColumn < intColumns; intColumn++) {
                intTransposeMatrix[intColumn][intRow] = intMatrix[intRow][intColumn];
            }
        }
        return intTransposeMatrix;
    }

    static void displayMatrix(int[][] intMatrix) {
        for (int intRow = 0; intRow < intMatrix.length; intRow++) {
            System.out.println("\n======================");
            for (int intColumn = 0; intColumn < intMatrix[intRow].length; intColumn++) {
                System.out.print(intMatrix[intRow][intColumn] + " ");
            }

            System.out.println("\n======================");
        }
    }

    static int getValidInteger(Scanner scanner, String strMessage) {
        String strInput;
        boolean boolValid = false;
        int intNumber = 0;

        while (!boolValid) {
            System.out.print(strMessage);
            strInput = scanner.next();

            boolean boolIsNumber = true;
            for (int i = 0; i < strInput.length(); i++) {
                if (!Character.isDigit(strInput.charAt(i))) {
                    boolIsNumber = false;
                    break;
                }
            }

            if (boolIsNumber) {
                intNumber = Integer.parseInt(strInput);
                boolValid = true;
            } else {
                System.out.println("Please input numbers only! NO CHARACTER !!");
            }
        }

        return intNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intRows = getValidInteger(scanner, "Enter number of rows: ");
        int intColumns = getValidInteger(scanner, "Enter number of columns: ");

        int[][] intMatrix = new int[intRows][intColumns];

        System.out.println("\nEnter elements of the matrix: ");
        for (int intRow = 0; intRow < intRows; intRow++) {
            System.out.println("Row " + intRow + ":");
            for (int intColumn = 0; intColumn < intColumns; intColumn++) {
                intMatrix[intRow][intColumn] = getValidInteger(scanner, 
                    "Enter element at column [" + intColumn + "]: ");
            }
        }

        System.out.println("\nOriginal Matrix: ");
        displayMatrix(intMatrix);

        int[][] intTransposeMatrix = getTransposeMatrix(intMatrix);

        System.out.println("\nTransposed Matrix: ");
        displayMatrix(intTransposeMatrix);

        scanner.close();
    }
}
