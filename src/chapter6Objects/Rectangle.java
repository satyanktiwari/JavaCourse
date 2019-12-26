package chapter6Objects;

/*
* https://testautomationu.applitools.com/java-programming-course/chapter6a.html
* objects consists of fields and methods
* private cannot be accessed outside the class
* protected can be accessed by any class within the same package
*   This is the same as without any access modifier
* Encapsulation - variables are private and methods are public
* getters and setters are used for variables
* this means this class
*
* Any number of constructors can be provided inside a class
* constructor has the same name as the class
* constructor is used to initialize the object
* default construtor does not have any parameters
* */
public class Rectangle {
//    global variables are called as fields
    private double width;
    private double length;

//    default constructor
    public Rectangle(){
        length = 0;
        width = 0;
    }

// constructor with parameters when user knows the input
    public Rectangle(double length, double width){
        setLength(length); // can also be written as this.length = length;
        setWidth(width);
    }

// getters and setters
    double getLength(){
        return length;
    }

    double setLength(double length){
        this.length = length;
        return length;
    }


    double getWidth(){
        return width;
    }

    double setWidth(double width){
        this.width = width;
        return width;
    }

//    Calculations
    double calculatePerimeter(){
        return(2*length)+ (2*width);
    }

    double calculateArea(){
        return length * width;
    }

}
