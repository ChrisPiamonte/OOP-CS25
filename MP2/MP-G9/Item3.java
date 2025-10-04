import java.util.*;
public class Item3 {
    public static void main(String[] args) {
        
    Scanner console = new Scanner(System.in);

    System.out.println("=== Strong Number Checker === ");
    System.out.print("Please enter a number: ");
    int intNumber = console.nextInt();

    int tempN = intNumber; int sum = 0;
    while (tempN > 0){
       int lastDigit = tempN % 10; // get last digit
       long longFact = 1;
        for (int i = 1; i <= lastDigit; i++) {
            longFact *= i; // factorial of last digit
            sum += longFact; // get the sum
        tempN /= 10; // remove last digit then proceed to the next iteration
        }
    }
    
    if (intNumber == sum){`
        System.out.println(intNumber + " is a STRONG NUMBER");
    } else {
        System.out.println(intNumber + " is NOT a STRONG NUMBER");
    }
    console.close();
    }
}

