import day40_FinalKeyword.Animal;
import day40_FinalKeyword.Dog;

public class ssss {

    public static void main(String[] args) {

        byte a = 1;

        int b = a; //implicitly

        //-------------------------------------------

        int c = 10;
        byte d = (byte) c; //explicitly

        //-------------------------------------------

        double t = 33.2;

        long l = (long)t;

        //System.out.println(l);

        //-------------------------------------------

        Animal animal1 = new Dog("Max","aa",'F',"wnj","2",2);

        //-------------------------------------------

        Dog dog1 = new Dog("Max","aa",'F',"wnj","2",2);
        Animal animal2 = dog1;

        //-------------------------------------------

        Animal animal3 = new Dog("Max","aa",'F',"wnj","2",2);
       // animal3.bark();

        Dog dog2 = (Dog) animal3;
        dog2.eat();
        dog2.bark();


    }

}





