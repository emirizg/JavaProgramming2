package day37_Inheritance.day43_Abstraction.animalTask;

public class Eagle extends Animal{

    public Eagle(String name, String breed, int age, char gender) {
        super(name, breed, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eagle food.");
    }
}
