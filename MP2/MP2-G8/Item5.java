import java.util.*;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int origNum = sx.nextInt();
        
        int square = origNum * origNum;
        int divide = 10;
        int kaprekar = 0;
        
        while (divide <= square) {
            int left = square / divide;
            int right = square % divide;
            
            if (left + right == origNum && right != 0) {
                kaprekar++;
                break;
            }
            divide *= 10;
        }
        if (kaprekar == 1) {
            System.out.println(origNum + " is a Kaprekar number.");
        } else {
            System.out.println(origNum + " is NOT a Kaprekar number.");
        }
        sx.close();
    }
}
