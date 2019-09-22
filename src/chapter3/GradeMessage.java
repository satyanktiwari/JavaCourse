package chapter3;
/*
Switch statement we check for the equality condition unlike if-else if where
we can use comparisions like <, >
 */

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]){
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade) {
            case "A":
                message = "Excellent job";
                break;
            case "B":
                    message="great job";
                    break;
            case "C":
                message= "Good job";
                break;
            case "D":
                message = "you need to work";
                break;
            case "F":
                message = "uh oh!";
                        break;
            default:
                message = "ERROR!!! Invalid gade entered";
                break;

        }
        System.out.println(message);
    }
}
