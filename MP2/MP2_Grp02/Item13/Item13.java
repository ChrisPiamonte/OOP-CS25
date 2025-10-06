import java.util.Scanner;
public class Item13
{
    public static void main(String[] args) 
    {
        //asks user for the dimensions of the matrix
        int rowsA, colsA;
        int rowsB, colsB;


        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number of rows for Matrix A: ");
        rowsA = userInput.nextInt();
        System.out.println("Enter the number of columns for Matrix A: ");
        colsA = userInput.nextInt();

        System.out.println("Enter the number of rows for Matrix B: ");
        rowsB = userInput.nextInt();
        System.out.println("Enter the number of columns for Matrix B: ");
        colsB = userInput.nextInt();


        if(isPossible(colsA, rowsB))
        {
            matrices(userInput, colsA, rowsA, colsB, rowsB);
        }
        userInput.close();

    }
    //checks the program if multiplication is possible
    //column A should be equal to row B
    public static boolean isPossible(int colsA, int rowsB)
    {
        if(colsA != rowsB)
        {
            System.out.println("Multiplication not possible");
            return false;
        }
        else
        {
            return true;
        }
    }
    //create and multiply matrices
    public static void matrices(Scanner userInput,int colsA, int rowsA, int colsB, int rowsB)
    {
        int[][] a = new int[rowsA][colsA];
        int[][] b = new int[rowsB][colsB];
        int[][] answer = new int[rowsA][colsB];



        System.out.println("Enter elements of Matrix A, row by row: ");
        for(int i = 0; i < rowsA; i++)
        {
            for(int j = 0; j < colsA; j++)
            {
                System.out.println("for " + i + ":" + j);
                a[i][j] = userInput.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B, row by row: ");
        for(int i = 0; i < rowsB; i++)
        {
            for(int j = 0; j < colsB; j++)
            {
                System.out.println("for " + i + ":" + j);
                b[i][j] = userInput.nextInt();
            }
        }


        //matrix multiplication
        for (int i = 0; i < rowsA; i++)
        {
            for (int j = 0; j < colsB; j++)
            {
                for (int k = 0; k < colsA; k++)
                {
                    answer[i][j] += a[i][k] * b[k][j];
                }
            }
        }


        //display results
        System.out.println("Result: ");
        
        for (int i = 0; i < rowsA; i++)
        {
            for (int j = 0; j < colsB; j++)
            {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }

}
