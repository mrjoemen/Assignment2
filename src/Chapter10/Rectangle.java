package Chapter10;

public class Rectangle {

    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height * 2) + (this.width * 2);
    }
}
