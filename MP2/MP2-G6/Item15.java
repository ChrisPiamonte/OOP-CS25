
import java.util.*;

public class Item15 {

    public static int inputValidation(Scanner console, String strPrompt) {
        int intValue;
        System.out.print(strPrompt);

        while (true) {
            if (console.hasNextInt()) {
                intValue = console.nextInt();
                if (intValue <= 0) {
                    System.out.print("Please enter a positive integer: ");
                } else {
                    return intValue;
                }
            } else {
                System.out.print("Invalid input. Please enter a positive integer: ");
                console.next();
            }
        }
    }

    public static void frequencyOfElements(int[] arrArrayofElements, int intNumberOfElements) {
        int intIndex, int2ndIndex;
        boolean[] boolIsVisited = new boolean[intNumberOfElements];

        for (intIndex = 0; intIndex < intNumberOfElements; intIndex++) {
            if (boolIsVisited[intIndex] == true) {
                continue;
            }
            int intFrequencyCounter = 1;
            for (int2ndIndex = intIndex + 1; int2ndIndex < intNumberOfElements; int2ndIndex++) {
                if (arrArrayofElements[intIndex] == arrArrayofElements[int2ndIndex]) {
                    boolIsVisited[int2ndIndex] = true;
                    intFrequencyCounter++;
                }
            }
            System.out.println(arrArrayofElements[intIndex] + " occurs " + intFrequencyCounter + " time(s)");
        }
    }

    public static void main(String args[]) {
        int intNumberOfElements, intIndex;

        Scanner console = new Scanner(System.in);
        intNumberOfElements = inputValidation(console, "Enter the number of elements in the array: ");
        int[] arrArrayofElements = new int[intNumberOfElements];

        System.out.print("Enter the elements of the array: ");
        for (intIndex = 0; intIndex < intNumberOfElements; intIndex++) {
            arrArrayofElements[intIndex] = inputValidation(console, "");
        }

        frequencyOfElements(arrArrayofElements, intNumberOfElements);

        console.close();
    }
}
