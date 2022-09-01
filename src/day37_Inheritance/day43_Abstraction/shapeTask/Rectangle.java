package day37_Inheritance.day43_Abstraction.shapeTask;

public class Rectangle extends Shape{

    private double width, length;

    public Rectangle(String name, double width, double length) {
        super(name);
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }
}
/*
Rectangle:
					area(): w * l
					perimeter(): 2 * (w+l)
 */