public class Group08 {
  public static void main(String[] args) {
        int start = 1;
        int end = 200;
        int sumEven = 0;
        int sumOdd = 0;
        int evenDiv5 = 0;
        int oddsDiv5 = 0;
        int div3 = 0;

        for(int i = start; i <= end; i++) {
            if(i % 2 == 0){
                sumEven += i; 
                if(i % 5 == 0) {
                    evenDiv5++;
                }
            }
            if(i % 2 == 1){
                sumOdd += i;
                if(i % 5 == 0) {
                    oddsDiv5++;
                }
            }
            if(i % 3 == 0){
                div3++;
            }
        }
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
        System.out.println("Difference of the sum of even and odd numbers: " + (sumEven - sumOdd));
        
        if(evenDiv5 > oddsDiv5) {
            System.out.println("Even has more number divisible by 5");
        } else if(evenDiv5 < oddsDiv5) {
            System.out.println("Odd has more number divisible by 5");
        } else {
            System.out.println("Both odd and even have the same number of numbers divisible by 5");
        } 

        double percentage = (div3 * 100.0) / (end - start + 1); 
        System.out.printf("The percentage of the numbers divisible by 3 in the range is %.2f%%%n", percentage);
  }
}