import java.util.Scanner;

public class Item11 {

    public static void vowelAndConsonantCounter(String strInput) {
        int intVowelsCount = 0;
        int intConsonantsCount = 0;

        strInput = strInput.toLowerCase();

        for (int loopStart = 0; loopStart < strInput.length(); loopStart++) {
            char charInputted= strInput.charAt(loopStart);

            if (charInputted >= 'a' && charInputted <= 'z') {
                if (charInputted == 'a' || charInputted == 'e' || charInputted == 'i' || charInputted == 'o' || charInputted == 'u') {
                    intVowelsCount++;
                } else {
                    intConsonantsCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + intVowelsCount);
        System.out.println("Number of consonants: " + intConsonantsCount);
    }

    public static boolean inputChecker (String strInput) {
        for (int loopStart = 0; loopStart < strInput.length(); loopStart++) {
            char charInputted= strInput.charAt(loopStart);
              if (charInputted >= 'a' && charInputted <= 'z') {
                continue;
            } else if (charInputted == ' ') {
                continue;
            } else {
                return false; 
            }

        }
        return true; 
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String strInput = scanner.nextLine();

         if (inputChecker(strInput)) {
                vowelAndConsonantCounter(strInput);
            } else {
                System.out.println("Please enter a word or letters only! :> ");
            }
        scanner.close();
    }
    }


