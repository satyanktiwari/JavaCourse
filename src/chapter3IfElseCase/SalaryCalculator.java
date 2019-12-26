package chapter3IfElseCase;

/*
if statements and else
5
 */
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String arg[]){
//        what we know
        int salary = 1000;
        int bonus = 250;
        int quota =10;
//        what we don't know
        System.out.println("What is the weeks sale for the employee?");
        Scanner scanner = new Scanner(System.in);
        int sale = scanner.nextInt();
        scanner.close();
//        if statement
        if (sale >quota){
        salary = salary + bonus;

    }
//        else {
//        salary = salary;
//        }
//        print weekly salary
        System.out.println("Payout for this week should be: " + salary);
    }
}
