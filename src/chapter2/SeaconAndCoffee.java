package chapter2;

import java.util.Scanner;

public class SeaconAndCoffee {
//    1. What Season it is
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the season that you are in:");
        String season = scanner.next();

//        2. Enter a number
        System.out.println("Enter a whole number");
        int wholeNumber = scanner.nextInt();

//        3. enter and adjective
        System.out.println("Enter an adjective");
        String adjective = scanner.next();

        scanner.close();

//       4. Print the sentence
        System.out.println("On a "+ adjective+" "+season+
                " day, I drink a minimum of "+wholeNumber+
                "cups of coffee");

    }
}

