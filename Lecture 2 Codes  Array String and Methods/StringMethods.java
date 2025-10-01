import java.lang.String;

public class StringMethods {
    public static void main(String[] args) {
        String strExample = "Bhoszx Malup3t o27 ^^";

        System.out.println("QUIZ ANSWER KEY");

        int length1 = strExample.length();
        char firstChar = strExample.charAt(length1-(14+5-(2*2)));
        System.out.println("1. firstChar: " + firstChar);

        int length2 = strExample.length();
        System.out.println("2. Length: " + length2);
        
        String lowercaseString = strExample.toLowerCase();
        System.out.println("3. toLowerCase(): " + lowercaseString);

        String uppercaseString = strExample.toUpperCase();
        System.out.println("4. toUpperCase(): " + uppercaseString);

        char secondChar = strExample.charAt(13);
        System.out.println("5. charAt(13): " + secondChar);

        int length3 = strExample.length();
        char thirdChar = strExample.charAt(length3-(10+5-(2*2)));
        System.out.println("6. charAt(0): " + thirdChar);

        int length4 = strExample.length();
        String substring1 = strExample.substring(length4-9-(10-5)-5+(2-3));
        System.out.println("7. substring1: " + substring1);

        String substring2 = strExample.substring(5, strExample.length()-9);
        System.out.println("8. substring2: " + substring2);

        String substring3 = strExample.substring(5, (strExample.length()-5)-2*3);
        System.out.println("9. substring3: " + substring3);

        boolean containsString1 = strExample.contains("kathNiEl");
        System.out.println("10. contains1: " + containsString1);

        boolean containsString2 = strExample.contains("eR*/*");
        System.out.println("11. contains2: " + containsString2);

        boolean containsString3 = strExample.contains("eL!_iS-");
        System.out.println("12. contains3: " + containsString3);

        boolean startsWithHello1 = strExample.startsWith("*");
        System.out.println("13. startsWith1: " + startsWithHello1);

        boolean startsWithHello2 = strExample.startsWith("*");
        System.out.println("14. startsWith2: " + startsWithHello2);

        boolean isEqualIgnoreCase = strExample.equalsIgnoreCase(strExample.toUpperCase());
        System.out.println("15. equalsIgnoreCase(anotherString): " + isEqualIgnoreCase);
    }
}
