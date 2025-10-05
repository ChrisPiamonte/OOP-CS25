import java.util.ArrayList;
import java.util.Scanner;

public class Item6{
    public static void main (String args[]){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int myNumber = scanner.nextInt();
        ArrayList<Integer> primeFactors = getPrimeFactors(myNumber);
        System.out.println("The prime factors of " + myNumber + " are " + primeFactors);
        scanner.close();
    }

    public static ArrayList<Integer> getPrimeFactors(int myNumber){
        ArrayList<Integer> factors = new ArrayList <> ();
        int i = 2;
        while (myNumber > 1){
            if (myNumber % i == 0){
                factors.add(i);
                myNumber /= i;
            } else {
                i++;
            }
        }
            return factors;
        }
}