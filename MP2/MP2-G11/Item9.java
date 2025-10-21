import java.util.Scanner;

public class Item9 {
    public static void stringReverse(String text){
        char[] charArray = text.toCharArray();

        System.out.print("Reversed String: ");
        for(int i = charArray.length - 1; i >= 0; i--){
            System.out.print(charArray[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String to be reversed: ");
        String strText = sc.nextLine();

        stringReverse(strText);

        sc.close();
    }
}
