import java.util.Scanner;
// Prime Factors of a Number

public class Item6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int intNumber = sc.nextInt();

        System.out.print("The prime factors of ["+intNumber+"] are: ");


        while (intNumber % 2 == 0) {
            System.out.print(2 + " ");
            intNumber = intNumber / 2;
        }

        for (int intFactor = 3; intFactor <= Math.sqrt(intNumber); intFactor += 2) {
            while (intNumber % intFactor == 0) {
                System.out.print(intFactor + " ");
                intNumber = intNumber / intFactor;
            }
        }

        if (intNumber > 2) {
            System.out.print(intNumber);
        }

        sc.close();
    }
}
