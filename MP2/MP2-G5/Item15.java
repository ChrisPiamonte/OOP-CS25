package OOPM2;
import java.util.Scanner;

public class no15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input array Size: ");
        int intSize = scanner.nextInt();


        int[] arrNumbers = new int[intSize];

        for(int i = 0; i < intSize; i++){
            System.out.print("Input element " + i + ": ");
            arrNumbers[i] = scanner.nextInt();
        }
        scanner.close();

        int intFrequency = 0;

        for(int i = 0; i < intSize; i++){
            for(int j = 0; j<intSize; j++){
                if(arrNumbers[j] == arrNumbers[i]){
                    intFrequency++;
                }
            }
            System.out.println("number " + arrNumbers[i] + " = " + intFrequency + " instances");
            intFrequency = 0;
        }
    }
}
