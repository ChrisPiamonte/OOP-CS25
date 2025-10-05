import java.util.*;

public class Item1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum == num && num != 0){
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
        input.close();

    }
}
