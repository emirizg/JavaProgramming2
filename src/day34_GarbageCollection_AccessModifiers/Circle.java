package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi ;
    public static String name ;

    public static ArrayList<Integer> numbers;

    //public static Sheet sheet;
    /*
    - if it any static variable it takes more than one step to set it you can never use assign operator
    - You can always use the static block to set any static variables
    - Static accepts statics
    - Main method is static, and main method it only runs within the class, it can not run
    - Outside the class you can never execute automatically main method in the other class,
                to set static variables you should not use main method
    - The block that can executed outside the class by itself is the static block
    - the static method it can automatically can be executed by itself whenever class loaded
    - You don't need to call static blocks, it runs automatically
    - so to set static variables we use static block
    - in java   Constructor: to set all the instances
                Static block: to set all the statics

    - Constructor vs Static Block
        * Constructor it always depends on the object, without the object it can never be executed
     */


    public Circle(double radius) {
        this.radius = radius;
        //pi=3.14;
    }


    static {
        //radius=5;
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);


    }



    /*
    public static void main(String[] args) {

        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);

    }

     */


}
