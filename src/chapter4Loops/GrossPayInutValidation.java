package chapter4Loops;
/*
This is an example of the while loop
 */

import java.util.Scanner;

public class GrossPayInutValidation {
    public static void main(String args[]){
//  initialize know variables
        int rate = 15;
        int maxHours = 40;

//        Get input for unknow variables
        System.out.println("How many hours did you work in the week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

//        Validate input
        while (hoursWorked > maxHours || hoursWorked < 1) {
            System.out.println("Invalid entry, Your hours must be between 1 and 40. enter again");
//            the variable below is call the seintenel
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: "+ gross);
    }
}
