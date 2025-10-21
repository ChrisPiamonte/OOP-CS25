
import java.util.Scanner;


public class Item5{
    //implementation using Strings
    static boolean isKarprekar(int intNumber){
        //Parse square of number into string for further processing
        String stringNumSquared = String.valueOf(intNumber*intNumber);
        int numSquaredLength = stringNumSquared.length();

        //Evenly splitting stringNumSquare, parsing and storing
        int halfStringIndex = numSquaredLength/2;
        int intLeftHalf = Integer.parseInt(stringNumSquared.substring(0, halfStringIndex));
        int intRightHalf = Integer.parseInt(stringNumSquared.substring(halfStringIndex));

        //boolean to be returned
        boolean boolIsKarprekar = intLeftHalf + intRightHalf == intNumber;
        return boolIsKarprekar;
    }
    static void checkKarprekar(int intNumber){
        if(isKarprekar(intNumber)){
            System.out.println("Number " + intNumber + " is a Karprekar Number");
        } else {
            System.out.println("Number " + intNumber + " is not a Karprekar Number");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("||========||Karprekar Checker||========||\nEnter a number: ");
        if(scanner.hasNextInt()){
            int intNumber = scanner.nextInt();
            checkKarprekar(intNumber);
        } else {
            System.out.println("Input is not valid");
        }
        System.out.println("||=====================================||");

    }
}