import java.util.*;

public class Item14 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter size of rows: ");
        int Row = scan.nextInt();
        if (Row <= 0) {
            System.out.println("The size of rows must be greater than 0.");
            System.exit(0);
        }
        System.out.print("enter size of columns: ");
        int Column = scan.nextInt();
        if (Column <= 0) {
            System.out.println("The size of columns must be greater than 0.");
            System.exit(0);
        }
      
        int[][] Matrix = TakeInput(Row, Column, scan);
        
        System.out.println("Original Matrix: ");
        Prints(Matrix, Row, Column);

        int[][] Transposed_Matrix = Transposing_Matrix(Matrix, Row, Column);

        System.out.println("\n\nTransposed Matrix: ");
        Prints(Transposed_Matrix, Column, Row);

        scan.close();

    }

    static int[][] TakeInput(int Row, int Column, Scanner scan) {
        int[][] Returns_Matrix = new int[Row][Column];
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                System.out.printf("Enter a number(%d, %d): ", i, j);
                Returns_Matrix[i][j] = scan.nextInt();
            }
        }
        return Returns_Matrix;
    }

    static void Prints(int[][] Matrix_To_Print, int Row, int Column) {
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                System.out.print(Matrix_To_Print[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] Transposing_Matrix (int[][] Matrix, int Row, int Column) {
        int[][] Transposed_Matrix = new int[Column][Row];
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                Transposed_Matrix[j][i] = Matrix[i][j];
            }
        }
        return Transposed_Matrix;
    }

}