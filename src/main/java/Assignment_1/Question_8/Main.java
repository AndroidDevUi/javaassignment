package Assignment_1.Question_8;


/**
 * Write a java program to create instance of both 'Car' and 'Motorcycle'
 * classes , invoke the 'startEngine' for each , and observe the
 * different behaviors
 */
public class Main {
    public static void main(String[] args) {
        Engine car = new Car();
        car.startEngine();

        Engine motorcycle = new Motorcycle();
        motorcycle.startEngine();
    }
}
