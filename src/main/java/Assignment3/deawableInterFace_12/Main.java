package Assignment3.deawableInterFace_12;

/** 12
 * Implement these interface in two classes : Rectangle and Circle .
 * The Rectangle class should implement both interfaces , while the Circle
 * class should implement only the Drawable interface .
 * Write a java program to create instance of both Rectangle and circle ,
 * call the draw and resize methods, and demonstration  multiple
 * interface implementation
 */
public class Main {
    public static void main(String[] args) {

        Drawable rectangle = new Rectangle(10, 5);
        rectangle.draw();  // Call the draw method



        Drawable circle = new Circle(7);
        circle.draw();  // Call the draw method for the circle

    }
}
