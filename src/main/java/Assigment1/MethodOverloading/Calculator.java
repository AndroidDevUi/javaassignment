package Assigment1.MethodOverloading;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double multiply(double a, double b, double c) {
        return a * b * c;
    }
}
