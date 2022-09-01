package day35_Encapsulation.squareTask;

public class SquareObjects {

    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square);

        square.setSide(10);
        System.out.println(square.getSide());

        System.out.println(square);

    }


}
