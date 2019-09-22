package chapter3;

import java.util.Scanner;

/*
Logical operators
 */
public class LogicalOperatorLoanQualifier {
    public static void main (String args[]){
        //        Initialize values
        int requiredSalary = 30000;
        int requiredyearEmployed= 2;


//        GET unknown
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years:");
        double years = scanner.nextDouble();
        scanner.close();

        //        Make a decision

        if(salary>=requiredSalary && years >= requiredyearEmployed ){
                System.out.println("Congrats!you have got a loan");
            }
        else {
            System.out.println("sorry you must earn salary "+ requiredSalary+ " to qualify");
        }

    }
}
