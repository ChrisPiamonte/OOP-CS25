import java.util.Scanner;

public class Item6 {
    public static void main(String args[]){
        // init int, scanner inst
        int inputNumber = 0;
        Scanner console = new Scanner(System.in);

        System.out.println("This program is defined for all integers");
        System.out.println("Input an integer to prime factorize: ");
        
        if ((inputNumber = console.nextInt()) < 0) inputNumber += inputNumber * -2;
    
        System.out.println("Here are the prime factors of " + inputNumber);
        primeFactorize(inputNumber, 2);
    }

    public static void primeFactorize(int number, int factor){
        if (number == 1) return;
    
        if (number % factor == 0) { // if divisible by current divisor
            System.out.println(factor);
            primeFactorize(number / factor, factor);
        } else { // increase divisor
            primeFactorize(number, factor + 1);
        }
    }
}
