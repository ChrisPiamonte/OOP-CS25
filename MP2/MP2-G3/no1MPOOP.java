import java.util.Scanner;

public class no1MPOOP
{
    static Scanner console = new Scanner(System.in);
    public static void main (String[] args)
    {
        int divideSum = 0;
        System.out.println("Input a number");
        if (!console.hasNextInt()) 
        {
            System.out.println("Invalid input! Please enter an integer.");
            return;
        }
        int inputNum = console.nextInt();
        System.out.println("You input " + inputNum + "!");
        for(int i = 1; i<= inputNum-1; i++)
        {
            if(inputNum % i == 0)
            {
                divideSum = divideSum + i;
            }
        }
        if(divideSum == inputNum)
        {
            System.out.println("The number you input, " + inputNum + ", is a Perfect number");
        }
        else
        {
            System.out.println("The number you input, " + inputNum + ", is NOT a Perfect number");
        }
        return;
    }
}