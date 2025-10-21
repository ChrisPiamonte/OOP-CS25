import java.util.Scanner;

public class Item11 {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter String: ");
        
        String str1 = in.nextLine().toLowerCase();
        
        int vowels = 0;
        int consonants = 0;
        
        for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        
        System.out.println("Vowels: " +vowels);
        System.out.println("Consonants: " +consonants);
    }
}
