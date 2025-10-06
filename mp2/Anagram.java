import java.util.*;

public class Anagram {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String str1 = console.nextLine().toLowerCase();
        
        System.out.print("Enter String 2: ");
        String str2 = console.nextLine().toLowerCase();

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

       if(array1.length != array2.length){
        System.out.println("Different lengths, not Anagrams");
        return;
       }
        
       Arrays.sort(array1);
       Arrays.sort(array2);

      if(Arrays.equals(array1, array2)){
        System.out.print("The string are Anagrams.");
      }else{
        System.out.print("The strings are not Anagrams.");
      }
    }
}
