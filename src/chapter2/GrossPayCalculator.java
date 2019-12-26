package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main (String arg[]){
//      1. Get the no. of hours
        System.out.println("enter the no. of hours of work");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

//       2. Get the hourly rate
        System.out.println("Enter the hourly rate");
        double rate = scanner.nextDouble();
        scanner.close();

//        3. Multiply hours and pay rate
        double grossPay = hours * rate;

//        4. display result
        System.out.println(grossPay + " is the employees Gross pay");


    }
}
