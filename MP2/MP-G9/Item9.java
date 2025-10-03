import java.util.Scanner;
public class StringReversal {
    public static void main(String[] args){
        Scanner scrInput = new Scanner(System.in);
        String strReverse = "";  
        System.out.print("Enter a string: ");
        String strInput = scrInput.nextLine();
        while (strInput.equals("")) {
             System.out.println("No input detected try again!");
            System.out.print("Enter a string: ");
            strInput = scrInput.nextLine();
        }
        for (int i = strInput.length() - 1; i >= 0; i--) {
            strReverse += strInput.charAt(i);
        }

        System.out.println("Reversed string: " + strReverse);
    }
}
