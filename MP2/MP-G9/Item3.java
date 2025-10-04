import java.util.*;
public class Item3 {
    public static void main(String[] args) {
        
    Scanner console = new Scanner(System.in);

    System.out.println("=== Strong Number Checker === ");
    System.out.print("Please enter a number: ");
    int n = console.nextInt();

    int tempN = n; int sum = 0;
    while (tempN > 0){
       int lastDigit = tempN % 10; // get last digit
       long fact = 1;
        for (int i = 1; i <= lastDigit; i++) {
            fact *= i; // factorial of last digit
            sum += fact; // get the sum
        tempN /= 10; // remove last digit then proceed to the next iteration
        }
    }
    
    if (n == sum){
        System.out.println(n + " is a STRONG NUMBER");
    } else {
        System.out.println(n + " is NOT a STRONG NUMBER");
    }
    console.close();
    }
}

