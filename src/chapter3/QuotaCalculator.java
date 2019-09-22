package chapter3;

import java.util.Scanner;

/*
If else
 */
public class QuotaCalculator {

    public static void main (String args[]){
//        Initialize values
        int quota = 10;
//        GET unknown
        System.out.println("Enter the no. of sales made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

//        Make a decision
        if(sales > quota){
            System.out.println("Congrat's you have met the target");
        }
//      Curly braces not required if there is only one statement and can be removed in the above if
        else{
            int salesShort = quota - sales;
            System.out.println("You did not make quota. you were "+ salesShort);
        }
    }
}
