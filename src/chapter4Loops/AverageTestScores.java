package chapter4Loops;
/*
Nested loops
Find the avaerage of each students test scores
 */

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String args[]){
//        Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;
        Scanner scanner = new Scanner(System.in);
//        process all students
        for (int i=0; i<numberOfStudents; i++){
                double total = 0;
            System.out.println("Student #"+ (i+1) + "********");
            for (int j=0; j<numberOfTests; j++){
                System.out.println("Enter the score for Test #"+(j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total/numberOfTests;
            System.out.println("Total average of student #"+ (i+1)+ "is " + average+ "\n");
        }
        scanner.close();
    }
}
