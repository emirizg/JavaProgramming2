package day37_Inheritance.day43_Abstraction.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Rectangle",5,10);
        Circle circle = new Circle("Circle",4);
        Square square = new Square("Square",8);

        System.out.println(rectangle);
        System.out.println(circle);
        System.out.println(square);

    }

}
