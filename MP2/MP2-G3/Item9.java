import java.util.Scanner;
public class Item9 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scan.nextLine();
    
    for (int i = input.length() - 1; i >= 0; i--) {
        System.out.print(input.charAt(i));
    }
    scan.close();
}
}