package chapter7Arrays;

// taking user input to define the length of the array

import java.util.Scanner;

public class Grades {
    private static int grades[];
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of Grades you want to Enter: ");
        grades = new int[input.nextInt()];
        getGrades();
        System.out.println("Sum of all grades is: "+ calculateSum());
        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest Grade is: "+ getHighest());
        System.out.println("Lowest grade is: "+ getLowest());

        input.close();
    }

    public static void getGrades(){
        for (int i=0; i<grades.length;i++){
            System.out.println("Enter the grade #"+ (i+1));
            grades[i]= input.nextInt();
        }

    }

    public static int calculateSum(){
        int sum =0;
        for (int value: grades){
            sum = sum + value;
        }
        return sum;
    }

    public static double calculateAverage(){
        return calculateSum()/grades.length;
    }

    public static int getHighest(){
        int highest = grades[0];
        for(int grade :grades){
            if (grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowest(){
        int lowest = grades[0];
        for(int grade: grades){
            if(grade<lowest){
                lowest=grade;
            }
        }
        return lowest;
    }

}
