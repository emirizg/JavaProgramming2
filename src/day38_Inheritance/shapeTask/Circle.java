package day38_Inheritance.shapeTask;

public class Circle extends Shape{

    private double radius;
    public static double pi = 3.14;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <=0){
            System.err.println("Invalid radius "+radius);
            System.exit(1);
        }
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

    @Override
    public String toString() {
        return "Cirlce{" +
                "name=" + getName() +
                ", radius=" + radius +
                ", pi=" + pi +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
/*
Circle
	r
	pi

	toString(): name, r, pi, area, perimeter
 */