package chapter3IfElseCase;

import java.util.Scanner;
/*4*/

public class TestResults {

    public static void main(String args[]){

//        Get the test score
        System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

//        Determine the letter grade
        char grade;
        if (score < 60){
            grade = 'F'; // single quotes for char and double quotes for strings
    }
        else if(score <70){
            grade = 'D';
        }
        else if(score <80){
            grade = 'C';
        }
        else if(score <90){
            grade = 'B';
        }
        else{
            grade = 'A';
        }
        System.out.println("Your grade is "+ grade);
    }

}
