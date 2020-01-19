package chapter7Arrays;

import java.util.Scanner;

public class ReturnDay {

    public static void main(String[] args) {
        String Week [] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the day:");
        int index = input.nextInt();
        input.close();

        if(index>0&& index<=7) {

            System.out.println("Corresponding day is " + Week[index - 1]);
        }
        else if(index<=0) {
            System.out.println("You are getting naughty");
        }
        else{
            System.out.println("You are getting naughty");
        }
    }

}
