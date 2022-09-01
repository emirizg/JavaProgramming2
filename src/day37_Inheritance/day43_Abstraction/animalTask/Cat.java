package day37_Inheritance.day43_Abstraction.animalTask;

public class Cat extends Animal{

    public Cat(String name, String breed, int age, char gender) {
        super(name, breed, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is cat food.");
    }
}
