package Assignment3.calculateAreaUsingInterface;


/** 11.
 * Write a java program to implement the Shape interface in two classes :
 * 'Circle' and 'Rectangle'. Each class should  provide its owm implementation of
 * the calculateArea and CalculatePerimeter methods .
 * create a interfaces of both classes and demonstrate the use of
 * interface methods
 */
public class Main {
    public static void main(String[] args) {

                Shape circle = new Circle(5);
                Shape rectangle = new Rectangle(4, 7);

                //  Circle area and perimeter
                System.out.println("Circle Area: " + circle.calculateArea());
                System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

                //  Rectangle area and perimeter
                System.out.println("Rectangle Area: " + rectangle.calculateArea());
                System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
            }

}
