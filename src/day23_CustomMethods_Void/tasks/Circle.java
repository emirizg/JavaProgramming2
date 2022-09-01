package day23_CustomMethods_Void.tasks;

public class Circle {

    public static void main(String[] args) {

        areaCircle(6);

    }

    public static void areaCircle(int radius){

        double PI=3.14;

        double areaCircle=PI*(radius*radius);

        System.out.println("Area Circle : " + areaCircle);

    }

}
/*
	6. create a method that can calculate the area of a circle
 */