package day39_Recap.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Max","Husky",'M',12,"Large","White");
        dog.eat();
        System.out.println(dog);

        Cat cat = new Cat("Boncuks","Van",'F',2,"Small","Yellow");
        cat.meow();
        System.out.println(cat);
        cat.setName("Kara");
        System.out.println(cat);


    }

}
