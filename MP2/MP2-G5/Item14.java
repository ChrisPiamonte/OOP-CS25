import java.util.Scanner;

public class Item14 {
    
    public static void main(String[] args) {
        //Scanner initialization
        Scanner scanner = new Scanner(System.in); 

        //Prompt user to input rows and columns
        System.out.print(String.format("Please input the number of rows: "));
        int rows = scanner.nextInt();
        System.out.print(String.format("Please input the number of columns: "));
        int columns = scanner.nextInt();

        //initialization and user input for matrix
        int[][] myMatrix = new int[rows][columns];
        System.out.println("Please input elements into the matrix:");
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < columns;j++){
                System.out.print(String.format("Enter element at [%d][%d]: ",i, j));
                myMatrix[i][j] = scanner.nextInt();
            }
        
        }

        //Printing myMatrix
        System.out.println();
        System.out.println("Original Matrix:");
        printMatrix(myMatrix, 0, 0);
        System.out.println();
        
        //Initialization for transposedMatrix
        System.out.println("Transposed Matrix");
        int[][] transposedMatrix = new int[columns][rows];

        //Method to make transposedematrix
        transposedMatrix(myMatrix, transposedMatrix, 0, 0); 
        printMatrix(transposedMatrix, 0, 0);

        scanner.close(); //close scanner
    }

    public static void printMatrix(int[][] matrix, int row, int column){
        //method to print matrices, used both for myMatrix and transposedMatrix
        if(row >= matrix.length){
            return;
        }
        if(column >= matrix[row].length){
            System.out.println();
            printMatrix(matrix, row + 1, 0);
            return;
        }
        System.out.print(matrix[row][column] + " ");
        printMatrix(matrix, row, column + 1);
    
    }

    public static int[][] transposedMatrix(int[][] matrix, int[][]transposedMatrix, int row, int column){
        //method used to transpose myMatrix
        if(column >= transposedMatrix.length){
            return transposedMatrix;
        }
        if(row >= transposedMatrix[column].length){
            transposedMatrix(matrix, transposedMatrix, 0, column + 1);
            return transposedMatrix;
        }
        transposedMatrix[column][row] = matrix[row][column];
        transposedMatrix(matrix, transposedMatrix, row + 1, column);
        return transposedMatrix;

    }

}


