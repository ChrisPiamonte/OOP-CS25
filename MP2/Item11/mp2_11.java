import java.util.*;

public class mp2_11 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int vowels = 0;
    int consonants = 0;
    int whitespaces = 0;

    System.out.print("Enter a string: ");
    String line = input.nextLine();
    line = line.toLowerCase();
    
    for (int i = 0; i < line.length(); i++) {
      char ch = line.charAt(i);

      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowels++;
      } else if (ch >= 'a' && ch <= 'z'){
        consonants++;
      } 
    }
        
    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
    }
}
