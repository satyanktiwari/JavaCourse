package chapter6Objects;

import java.util.Scanner;

/***
 * main() is always a static method
 *  Static has no state
 *  Static is used when we dont want to create a new instannce of that class
 *  but yet u want to access data inside of it
 *we can have mehtods within a class which are non-static, but when we use it inside main we will get error like
 *      non-static method getroom() cannot be referenced from a static context
 * to access non-static methods within a static method we have to instantiate the class
 * in this case HomeCalculatorRedo class needs to be instantiated
 *  HomeCalculatorRedo calculator = new HomeCalculatorRedo()
 *      Every class has an default constructor implicitly defined (i.e. created by java by default)
 *      and hence we are able to use it above
 * Classes from different packages have to be imported e.g Scanner has to be imported
 * and not Rectangle
 *
 * Methods can return only 1 value but in case of Objects like Rectangle (in the getRoom method) we don't have to worry about it as we will
 * return only 1 value i.e an Object but the object contains lots of different data
 *
 * return has to be the last statement in the method
 *
 * This example is different in a way from previous homeAreaCalculator
 * that here we will take user input on screen by using getRoom() to calculate
 * instead of using the defined constructors
 */

public class HomeCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HomeCalculatorRedo calculator = new HomeCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathRoom = calculator.getRoom();
        double area = calculator.calculateTotalArea(kitchen,bathRoom);
        System.out.println("Total area is: "+ area);
        calculator.scanner.close();

    }

    public Rectangle getRoom(){
        System.out.println("Enter the length: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();

//  Here we are using the 2nd constructor in the class Rectangle.
//        and used a short cut for creating a object
        return new Rectangle(length, width);

    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();

    }
}
