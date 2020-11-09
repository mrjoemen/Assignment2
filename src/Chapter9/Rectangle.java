package Chapter9;

public class Rectangle { //question 1

    double width;
    double height;

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
