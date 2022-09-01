package day33_Statics.dogTask;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Lucy","Husky","Small",'F',4,"White");

        System.out.println(dog1);

        dog1.play();

        System.out.println(dog1.numberOfWings);
        System.out.println(dog1.numberOfEyes);
        System.out.println(dog1.numberOfLegs);

    }

}
