package day38_Inheritance.animalTask;

public class Tiger extends Animal{


    public Tiger(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    @Override
    public void eat(){
        System.out.println(getName()+" is eating deer");
    }

}
/*
3. Tiger
					eat(): eats deer
 */