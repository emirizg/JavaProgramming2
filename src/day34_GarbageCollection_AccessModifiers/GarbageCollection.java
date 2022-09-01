package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    /*
    - Garbage Collection means --> Collection of unreferenced objects == garbage objects
    - It is only for non-primitives
    1. using 'null' keyword
        String str = "Java";
        str = null;

    2. crating new object
        String str = "Python";
        str = "Java";
    - Garbage Collector: responsible for collecting the unreferenced objects from java heap and destroys it
        finalize().
    - null keyword it can only be assigned to non-primitives
    - null is default value for every non-primitive data type
    - the fastest way to make an object eligible for garbage collection
     */

    public static void main(String[] args) {

        /*
        String str = null;
        //int a = null;

        System.out.println(str.toUpperCase());
         */

        String str = "Wooden Spoon";//after this line "Wooden Spoon" will be eligible for garbage collection

        str = null;

        System.out.println(str);

        Car car1 = new Car("Toyota");

        car1 = null;

        System.out.println(car1);

        System.out.println("-------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1 = new Dog();
        dog1.name = "Max";

        System.out.println(dog1);

        String language = "Python"; // it is now unreferenced
        language = "Java";

        System.out.println(language);

        System.out.println("----------------------------");

        // 1 room 2 doors ---> same room
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);

        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);

        System.out.println("----------------------------");

        // 1 same room 2 different doors
        Student student1 = new Student("Tahir", 30, 'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("----------------------------");

        // 1 same room 2 different doors
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;
        l2.add("Python");

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);


    }

}











