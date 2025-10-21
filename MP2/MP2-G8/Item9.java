import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = console.nextLine();

        String result = "";

        for(int i = str.length()-1; i>=0; i--){
           result += str.charAt(i);
        }

        System.out.println("Reversed string: " + result);
    }
}
