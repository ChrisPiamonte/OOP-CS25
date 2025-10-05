package OOPM2;

import java.util.Scanner;

public class no2 {
public static void main(String args[]){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int intInput = scanner.nextInt();
    int intTemp = intInput;
    int intSumOfItsDigits = 0;
    scanner.close();

while(intTemp > 0){
    int intModulo = intTemp % 10;
    intSumOfItsDigits += intModulo;
    intTemp /= 10; 
}

if(intInput % intSumOfItsDigits == 0){
System.out.println(intInput + " is a Harshad number");
}
else
System.out.println(intInput + " is not a Harshad number");
}
}
