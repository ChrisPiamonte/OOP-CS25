import java.util.Scanner;

public class Number9 {

  static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String reversedInput = "";

    System.out.println("Enter Word here: ");
    String userInput = scanner.nextLine();

    for (int i = userInput.length() - 1; i >= 0; i--) {

      reversedInput += userInput.charAt(i);
    }

    System.out.println("Orignal Word: " + userInput);
    System.out.println("Reverse Word: " + reversedInput);

    scanner.close();
  }
}
