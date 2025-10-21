import java.util.Scanner;
import java.util.Arrays;

public class Item10 {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input two strings: ");
        
        String str1 = in.nextLine().toLowerCase().replaceAll("\\s", "");
        String str2 = in.nextLine().toLowerCase().replaceAll("\\s", "");
        
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        String sortedstr1 = new String(arr1);
        String sortedstr2 = new String(arr2);
        
        if(sortedstr1.equals(sortedstr2)) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("not an Anagram");
        }
    }
    
}
