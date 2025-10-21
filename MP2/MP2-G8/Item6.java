import java.util.*;
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int origNum = sx.nextInt();
        System.out.print("Prime factors of " + origNum + ": ");
        while (origNum % 2 == 0) {
            System.out.print("2 ");
            origNum /= 2;
        }
        for (int i = 3; i * i <= origNum; i += 2) {
            while (origNum % i == 0) {
                System.out.print(i + " ");
                origNum /= i;
            }
        }
        if (origNum > 1) {
            System.out.print(origNum);
        }
        sx.close();
    }
}
