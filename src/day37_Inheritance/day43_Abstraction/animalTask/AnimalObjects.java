package day37_Inheritance.day43_Abstraction.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Tiger tiger = new Tiger("Baghera","Bengal",10,'M');
        Eagle eagle = new Eagle("Eagle","Black",3,'F');
        Dog dog = new Dog("Dog","Husky",4,'F');

        System.out.println(tiger);
        System.out.println(eagle);
        System.out.println(dog);

        tiger.eat();
        eagle.eat();
        dog.eat();
    }

}
