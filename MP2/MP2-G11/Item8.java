import java.util.Scanner;

public class Item8{

    public static boolean strConversion(int num, int sqr) {

        String strNum = String.valueOf(num);
        String strSqr = String.valueOf(sqr);

        if(strSqr.endsWith(strNum)){
            return true;
        }
        return false;
        
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int intNum = sc.nextInt();

        int intSquare = intNum * intNum;

        if(strConversion(intNum, intSquare)){
            System.out.println(intNum + " is an Automorphic Number");
        } else {
            System.out.println(intNum + " is not an Automorphic Number");
        }
        sc.close();
    }
}
