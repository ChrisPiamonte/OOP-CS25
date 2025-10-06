import java.util.*;

public class ReverseString 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        String reversed = "";
        for (int i = string.length() - 1; i >= 0; i--)
        {
            reversed += string.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        sc.close();  
    }    
}
