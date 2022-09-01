package day47_Polymorphism;

import day43_Abstraction.employeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shapeTask.Circle;
import day45_Abstraction.shapeTask.Cube;
import day45_Abstraction.shapeTask.Shape;
import day45_Abstraction.shapeTask.Square;

public class RefernceTypeCastings {


    public static void main(String[] args) {

        //Shape shape = (Shape) new Circle(4); //upcasting
        // sub-type to the parent type

        Shape shape2 = new Circle(5);

        //WebDriver driver = (ChromeDriver) new ChromeDriver();

        //  Dog dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        //  Dog dog3 = dog2;

        // ------------------------------------------------------------------------------------------
        //DOWN_CASTING

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        //1st way for Down-casting
        Dog dog = (Dog) animal; //down-casting
        //dog.bark();

        System.out.println(animal.getName());
        System.out.println(dog.getName());

        //2nd way for Down-casting
        ((Dog) animal).bark();

        Shape shape1 = new Square(5);

        System.out.println(((Square) shape1).getSide());

        System.out.println("-----------------------------------------------");

        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "Blue");

        //  Cat cat = (Cat) animal2;
        //  cat.meow();

        ((Cat) animal2).meow();

        // ((Dog) animal2).bark();

        System.out.println("-----------------------------------------------");

        Employee employee = new Tester("Ali", 30, 'M', 42, "SDET", 145000.00);

        ((Tester) employee).bugReport();

        //((Tester) employee).unitTest();

        //((Developer) employee).unitTest();

        //if you try to apply reference type casting to the class do not have is relationship that's the time
        // you will be getting ClassCastException
        //Driver driver = (Driver) employee; //line 1
        Person person = (Person) employee; //line 2
        //Teacher teacher = (Teacher) employee; //line 3

        System.out.println("-----------------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();

        //Object type and casting type needs to have IS A relationship
        //((Cube) s1).volume();




    }


}









