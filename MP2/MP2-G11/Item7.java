import java.util.Scanner;

public class Item7 {
    public static boolean isPrime(int num) {
        if(num <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void twinPrimes(int start, int end){
        for(int i = start; i < end; i++){
            if(isPrime(i) && isPrime(i + 2)){
                System.out.printf("(%d, %d)", i, i+2);
            }
        }
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int intMin = 0;
        int intMax = 0;

        System.out.print("Enter minimum range: ");
        intMin = sc.nextInt();

        System.out.print("Enter maximum range: ");
        intMax = sc.nextInt();

        System.out.printf("Twin primes between %d and %d are: \n", intMin, intMax);
        twinPrimes(intMin, intMax);

        sc.close();
    }
}
