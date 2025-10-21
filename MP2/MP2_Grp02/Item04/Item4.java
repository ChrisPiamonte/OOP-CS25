import java.util.Scanner;

class Item4 {

     static int happyNumChecker(int num) {
        int result = 0;

        while (num > 0){
            result += Math.pow(num % 10, 2);
            num /= 10;
        }
        return result;
    }
   public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("HAPPY NUMBER CHECKER!\n");
        System.out.println("Please enter a number:");
        int num = sc.nextInt();

        int result = num;

        while (result != 1 && result != 4){
             result = happyNumChecker(result);
        }

        if(result == 1){
            System.out.println(num + " is a Happy number.");
        }
        else {
            System.out.println(num + " is not a Happy number.");
        }
        sc.close();
   }
}
