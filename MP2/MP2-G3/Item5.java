import java.util.Scanner;

public class Item5 {
    public static void main(String[] args) {
        System.out.print("Input Number: ");
        Scanner scan = new Scanner(System.in);

        long num = scan.nextLong();
        long squared = num * num; 
        String str = Long.toString(squared);
        int length = str.length();
        boolean isKaprekar = false;
        
        for (int i = 1; i < length; i++) {
            long leftSide = Long.parseLong(str.substring(0, i)); 
            long rightSide = Long.parseLong(str.substring(i));
            if (rightSide > 0 && leftSide + rightSide == num) {
                isKaprekar = true;
                break;
            }
        }

        if (isKaprekar)
            System.out.printf("%d is a Kaprekar Number", num);
        else
            System.out.printf("%d is not a Kaprekar Number", num);

        scan.close();
    }
}