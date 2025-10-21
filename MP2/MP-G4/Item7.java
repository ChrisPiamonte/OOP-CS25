import java.util.Scanner;

public class Item7 {
    public static void main(String args[]) {
        int start = 0, end = 0;
        Scanner console = new Scanner(System.in); // inits
        
        System.out.println("This program is defined for non-negative intervals only");
        
        do {
            do {
                System.out.println("Enter start of range: ");
                if ((start = console.nextInt()) < 0) {
                    System.out.println("Interval inputs cannot be negative!\n");
                } else {
                    break;
                }
            }   while(true);
            
            do {
                System.out.println("Enter end of range: ");
                if ((end = console.nextInt()) < 0) {
                    System.out.println("Interval inputs cannot be negative!\n");
                } else {
                    break;
                }
            }   while(true);
                
            if (start > end) {
                System.out.println("Abnormal interval! try again..");
            } else {
                break;
            }
        } while (true);
        
        System.out.println("The twin primes found for interval [" + start + "," + end +"] :");
        twinPrimes(start, end, 0);
        System.out.println("------ nothing follows -----");
    }
    
    public static void twinPrimes(int currentNumber, int endOfRange, int previousPrime){
        if (currentNumber > endOfRange) return;
        if (currentNumber != 1) {
            if(isPrime(currentNumber)){
                if(previousPrime != 0 && currentNumber - previousPrime == 2) {
                    System.out.println("("+ previousPrime +", " + currentNumber +")");
                    previousPrime = currentNumber;
                } 
                previousPrime = currentNumber;
            }
        } 
        twinPrimes(currentNumber + 1, endOfRange, previousPrime);
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false; // automatically not prime nor composite
        for (int i = 2; i <= ((int)Math.sqrt(number)); i++){ // check until sqrt of n to majke fastr
            //System.out.println(number + " % " + i);
            if (number % i == 0) return false; // is it divisible
        }
        return true; // if it is able to go through the entire range without being divisible by anything
    }    
}
