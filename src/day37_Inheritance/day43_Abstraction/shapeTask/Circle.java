package day37_Inheritance.day43_Abstraction.shapeTask;

public class Circle extends Shape{

    private double radius;

    public static double pi = 3.14;

    public Circle(String name, double radius) {
        super(name);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }
}
/*
Circle:
					area(): r * r * pi
					perimeter(): 2 * r * pi
 */