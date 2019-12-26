package chapter5MethodsParameters;

import java.io.PrintStream;
import java.util.Scanner;

public class PhoneBillCalulator {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        double baseCost = getBaseCost();
        double overageMinutes = getOverageMinutes();
        double overCharge = calculateOverage(overageMinutes);
        double tax = caclutateTax(baseCost + overageMinutes);
        scanner.close();
        statement(baseCost, overCharge, tax);
    }

    public static double getBaseCost(){
        System.out.println("Enter the base cost:");
        double baseCost = scanner.nextDouble();
        return baseCost;
    }

    public static double getOverageMinutes(){
        System.out.println("Enter Overage minutes ");
        double overageMinutes = scanner.nextDouble();
        return overageMinutes;
    }

    public static double calculateOverage(double overageMinutes){
        double rate = 0.25;
        double overage = overageMinutes * rate;
        return overage;
    }

    public static double caclutateTax(double subTotal){
        double rate = 0.15;
        double tax  = subTotal * rate;
        return tax;
    }

    public static void statement(double baseCost, double overage, double tax){
        double finalTotal = baseCost + overage + tax;
        System.out.println("Plan: "+ String.format("%.2f",baseCost));
        System.out.println("Overage: "+ String.format("%.2f",overage));
        System.out.println("Tax: " + String.format("%.2f", tax));
        System.out.println("Total: "+ String.format("%.2f",finalTotal));
    }
}
