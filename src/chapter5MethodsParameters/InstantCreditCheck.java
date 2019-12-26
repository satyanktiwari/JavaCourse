package chapter5MethodsParameters;

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salaryArgument = getSalary();
        int creditScoreArgument = getCreditScore();
        scanner.close();
        boolean qualified = isUserQualified(creditScoreArgument, salaryArgument);

       notifyUser(qualified);
    }

    public static double getSalary(){
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScoreParameter, double salaryParameter){
        if (creditScoreParameter >=requiredCreditScore && salaryParameter >= requiredSalary){
            return true;
        }
        else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if (isQualified){
            System.out.println("Congrats!!!!!!");
        }
        else{
            System.out.println("Hard luck...............");
        }
    }
}
