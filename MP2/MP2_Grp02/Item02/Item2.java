import java.util.Scanner;
public class Item2 
{
    public static void main(String[] args) 
    {   
        //Asks user for input
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String[] userNumber = userInput.nextLine().split("");


        System.out.println(harshad(userNumber));


        userInput.close();
    }

    //calculates user input
    //returns true if harshad, false if not
    public static boolean harshad(String[] userNumber)
    {

        int number;
        int sum = 0;

        number = Integer.parseInt(String.join("",userNumber));
        for(int i = 0; i < userNumber.length; i++)
        {
            sum += Integer.parseInt(userNumber[i]); 
        }
        return number % sum == 0;
    }
        
    
}
