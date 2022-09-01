package day38_Inheritance.animalTask;

public class Test {

    public static void main(String[] args) {

        Cat cat= new Cat("Max","Van",2,'M',"small","White");
        System.out.println(cat);
        cat.eat();

        Dog dog= new Dog("Max","Sivas",3,'M',"Big"
                ,"Black");
        System.out.println(dog);
        dog.eat();

        Tiger tiger = new Tiger("Tiger","Bengal",4,'M'
                ,"Very Big","Orange");
        System.out.println(dog);
        tiger.eat();

        Eagle eagle=new Eagle("bfja","jvsk",3,'F',"Small","Black");
        System.out.println(eagle);
        eagle.eat();

    }

}
