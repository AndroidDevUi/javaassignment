package Assignment_1.Question_6;


/**
 * Write a java program to Create two derived class ,
 * Circle and Rectangle , which inherit from the
 * Shape class . Each derived class should have specific methods to calculate its
 * area and display the result
 */
public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        System.out.println("For Circle:");
        circle.calculateArea();


        Shape rectangle = new Rectangle(4, 6);
        System.out.println("\nFor Rectangle:");
        rectangle.calculateArea();  // Calculate and display area of the rectangle
    }
}
