package chapter4Loops;
/*
For loop
 */

import java.util.Scanner;

public class Cashier {
    public static void main(String args[]){
//        Get number of items to scan
        System.out.println("Enter the number of items to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        double total = 0;

//        Create loop to iterate through all of the items and accumalate costs
        for (int i=0; i< quantity; i++){
            System.out.println("Enter the cost of the item: ");
            double price = scanner.nextDouble();
            total = total + price;
        }
        scanner.close();
        System.out.println("Total is: "+ total);
    }
}
