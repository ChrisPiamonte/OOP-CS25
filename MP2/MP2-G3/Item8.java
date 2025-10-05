/*
 * 8. Automorphic Number 
 * Create a program to check if a number is 
 * an Automorphic Number. A number is Automorphic if its
 * square ends with the number itself (e.g., 76^2 = 5776).
 */

public class Item8 {
    static boolean isAutomorphic(int number){
        int square = number * number;

        int checker = 1;
        int extractNumber, extractSquare;

        int temp = number;

        while(temp != 0){
            // to extract digit
            extractNumber = number % 10; 
            extractSquare = square % 10;

            // checks if the extracted numbers are similar, if not, var checker will eqaul to 0
            if(extractNumber != extractSquare){
                checker = 0;
                break; 
            }

            // to remove last digit
            number = number /10;
            square = square / 10;
            temp = temp / 10;
        }

        // if the checker is still 1, then the ends are similar
        return (checker == 1);

        // it's ugly, yet it works ;-;;
    }

    public static void main(String[] args) {
        boolean example_1 = isAutomorphic(76); // true
        boolean example_2 = isAutomorphic(25); // true
        boolean example_3 = isAutomorphic(49); // flase
        boolean example_4 = isAutomorphic(64); // false
        boolean example_5 = isAutomorphic(376); // true

        System.out.println("Is automorphic number?");
        System.out.println("76? " + example_1);
        System.out.println("25? " + example_2);
        System.out.println("49? " + example_3);
        System.out.println("64? " + example_4);
        System.out.println("376? "+ example_5);
    }
}
