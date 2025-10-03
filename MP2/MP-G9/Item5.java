import java.util.Scanner;
// Kaprekar Number

public class Item5 {

    static boolean boolKaprekar (int intNumber) {
        if (intNumber == 1) {
            return true;
        }

        long lngSquare = (long) intNumber * intNumber; // long to avoid overflow
        String strSquare = Long.toString(lngSquare);
        int intLength = strSquare.length();

        // split
        for (int i = 1; i < intLength; i++) {
            String strLeft = strSquare.substring(0, i);
            String strRight = strSquare.substring(i);

            int intLeft = Integer.parseInt(strLeft);
            int intRight = Integer.parseInt(strRight);

            if (intLeft + intRight == intNumber && intRight != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int intNumber = sc.nextInt();

        if (boolKaprekar(intNumber)) {
            System.out.println("["+intNumber+"] IS a Kaprekar Number.");
        } else {
            System.out.println("["+intNumber+"] is NOT a Kaprekar Number.");
        }

        sc.close();
    }
}