import java.util.*;

public class mp2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int ctr = 0;

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for (i = 1; i <= n/2; i++) {
            if(n % i == 0){
                ctr += i;
            }
        }

        if(ctr == n){
            System.out.println(n + " is a perfect number.");
        } else{
            System.out.println(n + " is not a perfect number.");
        }
    }
}
