package chapter4Loops;
/*
Do while loop do-while loop
 */

import java.util.Scanner;

public class AddNumbers {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        boolean again = false;
        do{
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("Sum of 2 number is: "+ sum);
            System.out.println("Do you want to start over? enter true or false");
//            Seintinel for the while
            again = scanner.nextBoolean();
        }while(again);
        scanner.close();
    }
}
