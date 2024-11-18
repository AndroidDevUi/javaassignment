package Assignment3.deawableInterFace_12;


public class Rectangle implements Drawable, Resizable {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length: " + length + " and width: " + width);
    }

    @Override
    public void resize(double percentage) {
        length += (length * percentage / 100);
        width += (width * percentage / 100);
        System.out.println("Resized rectangle to new dimensions - length: " + length + " and width: " + width);
    }
}

