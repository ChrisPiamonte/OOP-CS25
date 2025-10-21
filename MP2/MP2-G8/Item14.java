import java.util.*;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        
        System.out.println("Enter numbers for a matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sx.nextInt();
            }
        }
        System.out.println(" ");
        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sx.close();
    }
}
