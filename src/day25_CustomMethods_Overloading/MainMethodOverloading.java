package day25_CustomMethods_Overloading;

public class MainMethodOverloading {

    /*
    - any method in java you can overload
    - JVM executes the building main method
    - Overloading ---> it makes you to memorize less method names
     */

    public static void main(String[] args) {
        System.out.println("String");
    }

    public static void main(int[] args) {
        System.out.println("int");
    }

    public static void main(double[] args) {
        System.out.println("double");
    }

    public static void main(char[] args) {
        System.out.println("char");
    }

}
