package Assignment_1.Question_6;

public class Circle extends Shape {
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the calculateArea method for Circle
    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        displayArea(area);
    }
}
