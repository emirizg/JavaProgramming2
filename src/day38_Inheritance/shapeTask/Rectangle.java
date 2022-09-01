package day38_Inheritance.shapeTask;

public class Rectangle extends Shape{

    private double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            System.err.println("Invalid length "+length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            System.err.println("Invalid width "+width);
            System.exit(1);
        }
        this.width = width;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return (width+length) * 2;
    }

    public String toString() {
        return "Rectangle{" +
                "name=" + getName() +
                ", length=" + length +
                ", width=" + width +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
/*
Rectangle
	l
	w

	toString(): name, l, w, area, perimeter
 */