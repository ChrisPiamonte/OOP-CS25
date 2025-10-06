import java.util.*;

public class Item11 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int intVowelCount=0;
        int intConsonantCount=0;

        System.out.print("Enter a string: ");
        String strInput = scanner.nextLine();

        strInput = strInput.toLowerCase(); //for easier checking 
        boolean boolLetterFound=false; //for checking if letters are present

        for(int i=0; i<strInput.length();i++){
            char charCharCheck = strInput.charAt(i); //checks each character in the string
            if(charCharCheck>='a'&&charCharCheck<='z'){
                if(charCharCheck=='a'||charCharCheck=='e'||charCharCheck=='i'||charCharCheck=='o'||charCharCheck=='u'){
                intVowelCount++;
                boolLetterFound=true;
            }else{
                intConsonantCount++;
                boolLetterFound=true;
            }

            }
            
        }

        System.out.println("Vowels found in the string: "+intVowelCount);
        System.out.println("Consonants found in the string: "+intConsonantCount);
        if(!boolLetterFound){ //if no letters were found in the string
            System.out.println("There are no vowels nor consonants in the string.");
        }
        scanner.close();

    }
}
