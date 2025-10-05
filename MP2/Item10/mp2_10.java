import java.util.*;

public class mp2_10 {

    public static boolean areAnagrams(String str1, String str2) {
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        String concatenatedStr1 = str1.replaceAll("\\s", "");

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
        String concatenatedStr2 = str2.replaceAll("\\s", "");
        

        if(areAnagrams(concatenatedStr1, concatenatedStr2) == true){
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        }
        else{
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
        
    }
}
