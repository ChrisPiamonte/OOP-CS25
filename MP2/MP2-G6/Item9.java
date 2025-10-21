import java.util.Scanner;

public class Item9 {
    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);
    
        System.out.print("Enter your string: ");
        String stringInputted = stringScanner.nextLine();
        stringScanner.close();

        String resultString = "";
        for (int i = 0; i < stringInputted.length(); i++) {
            resultString = stringInputted.charAt(i) + resultString; 
        }
        System.out.println(resultString);
    }
    
}

