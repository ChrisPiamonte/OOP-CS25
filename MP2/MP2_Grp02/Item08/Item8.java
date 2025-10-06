import java.util.Scanner;

class Item8 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int modulus = 10;
        int result = 0;

        System.out.println("AUTOMORPHIC NUMBER CHECKER!\n");
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int numSquared = num * num;

        while (result < num){
            result = numSquared % modulus;
            modulus *= 10;
        }

        if (result == num){
            System.out.println(num + " is an automorphic number!");
        }
        else{
            System.out.println(num + " is not an automorphic number!");
        }

        sc.close();
    }
}
