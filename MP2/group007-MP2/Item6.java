import java.util.*;

public class Item6 {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number to get its prime factors: ");
        int intNumber = scan.nextInt();
        int intCopyOfNumber = intNumber, intSmallestPrime = 2;

        LessThanTwo(intNumber);
        
        System.out.print("The prime factors of " + intNumber + " are: ");
        
        GetPrimeFactors(intCopyOfNumber, intSmallestPrime);

        scan.close();

    }

    static void LessThanTwo(int intNumber) {
        if (intNumber < 2)
        {
            System.out.println("This number does not have any prime factors.");
        } 
    }

    static void GetPrimeFactors(int intCopyOfNumber, int intSmallestPrime) {
        while (intCopyOfNumber > 1) 
        {   
            while (intCopyOfNumber % intSmallestPrime == 0) 
            {
                System.out.print(intSmallestPrime + " ");
                intCopyOfNumber /= intSmallestPrime;
            }
            intSmallestPrime++;
        }
    }

}