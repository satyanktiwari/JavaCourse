package chapter3IfElseCase;
/*
if-else-if
3
 */

import java.util.Scanner;

public class RsHunderedGame {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String message;
//        String message;
        int one = 1;
        int two = 2;
        int five = 5;

        System.out.println("How many coins of 1?");
        int numOfOne = scanner.nextInt();
        System.out.println("how many coins of 2?");
        int numOfTwo = scanner.nextInt();
        System.out.println("How many coins of 5?");
        int numOfFive = scanner.nextInt();
        scanner.close();

        int totalCoins = (numOfOne*one) + (numOfTwo*two) + (numOfFive*five);


        if (totalCoins < 100){
            message = "your were short by Rs."+ (100-totalCoins);
        }

        else if(totalCoins > 100){
            message = "your were short by Rs."+ (totalCoins - 100);
        }
        else{
            message = "You won the game";
        }

        System.out.println(message);


    }
}
