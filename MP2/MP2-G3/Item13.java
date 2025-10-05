import java.util.Scanner; 

public class Item13 {
    public static void main(String args[]){
        try (Scanner scanner = new Scanner(System.in)){

        System.out.print("Enter rows and columns for the first matrix: "); 
        int row1 = scanner.nextInt(), col1 = scanner.nextInt(); 

        System.out.print("Enter rows and columns for the second matrix: "); 
        int row2 = scanner.nextInt(), col2 = scanner.nextInt(); 
    
        if(col1 != row2){
            System.out.println("Invalid input! First column must be equal to second row."); 
            return; 
        }

        int[][] m1 = new int[row1][col1]; 
        int[][] m2 = new int[row2][col2]; 
        int[][] result = new int[row1][col2]; 

        System.out.println("Enter the first matrix: "); 
        for (int i = 0; i < row1; i++) 
            for (int j = 0; j < col1; j++){
                System.out.print("[" + (i+1) + "][" + (j+1) + "]: ");
                m1[i][j] = scanner.nextInt();
            } 

        System.out.println("Enter the second matrix: "); 
        for (int i = 0; i < row2; i++)
            for (int j = 0; j < col2; j++){
                System.out.print("[" + (i+1) + "][" + (j+1) + "]: ");
                m2[i][j] = scanner.nextInt();
            }

        for (int i = 0; i < row1; i++)
            for (int j = 0; j < col2; j++)
                for (int k = 0; k < col1; k++)
                    result[i][j] += m1[i][k] * m2[k][j]; 

        System.out.println("The results are: "); 
        for (int i = 0; i < row1; i++){
            for (int j = 0; j < col2; j++)
                System.out.print(result[i][j] + "\t"); 
            System.out.println(); 
        }
      } 
    }
}