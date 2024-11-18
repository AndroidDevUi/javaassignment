package Assigment1.MethodOverloading;


/**
 * Write a java program to demonstrate method overloading by
 * creating an instance of the Calculator class abd using each
 * of these methods : add , multiply  (floating point number ).
 */
public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Double sumTwoNumber = calculator.add(11,2.5);
        Double sumThreeNumber  = calculator.add(5,2.6,8.3);

        System.out.printf("Sum of two number %.2f\n", sumTwoNumber);
        System.out.printf("Sum of three number %.2f\n", sumThreeNumber);


        Double multiTwoNumber = calculator.multiply(11,2.5);
        Double multiThreeNumber  = calculator.multiply(5,2.6,8.3);

        System.out.printf("Multiply of two number %.2f\n", multiTwoNumber);
        System.out.printf("Multiply of three number %.2f\n", multiThreeNumber);


    }

}
