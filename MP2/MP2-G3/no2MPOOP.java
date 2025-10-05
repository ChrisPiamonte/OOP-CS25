import java.util.Scanner;

public class no2MPOOP
{
    static Scanner console = new Scanner(System.in);
    public static void main (String[] args)
    {
        int trackedNum;
        int digitSum = 0;
        System.out.println("Input a number");
        if (!console.hasNextInt()) 
        {
            System.out.println("Invalid input! Please enter an integer.");
            return;
        }
        int inputNum = console.nextInt();
        trackedNum = inputNum;
        System.out.println("You input " + inputNum + "!");
        while(trackedNum > 0)
        {
            int lDigit = trackedNum%10;
            digitSum = digitSum + lDigit;
            trackedNum = trackedNum/10;
        }
        if(inputNum % digitSum == 0)
        {
            System.out.println("Your input, " + inputNum + ", is a Harshad number");
        }
        else
        {
            System.out.println("Your input, " + inputNum + ", is NOT a Harshad number");
        }
        return;
    }
}