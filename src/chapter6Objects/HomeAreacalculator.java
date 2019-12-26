package chapter6Objects;


/**********
*
* Write a class that creates instances of the Rectangle class to find the
* total area of two rooms in a house
 *
 * Data type of an object is a class in this case Rectangle is the data type of the Objects
 * room1 and room2
*
* */
public class HomeAreacalculator {
    public static void main(String[] args) {
        /****************
        * Rectangle 1
        ****************/
//    Create an instance of the Rectangle using defualt constructor
        Rectangle room1 = new Rectangle();
                /****
                *       Rectangle  = datatype
                *       room1 = object
                *       new = use to create an instance of an object
                *       Rectangle() = the constructor that we want to use, in this case the default one
                */
        room1.setLength(10);
        room1.setWidth(10);
        double areaOfRoom1 = room1.calculateArea();

        /****************
         * Rectangle 1
         ****************/
        Rectangle room2 = new Rectangle(10,10);
        double areaOfRoom2 = room2.calculateArea();
        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of house is: " + String.format("%.2f",totalArea));

    }
}
