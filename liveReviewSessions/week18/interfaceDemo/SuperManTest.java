package week18.interfaceDemo;

public class SuperManTest {

    public static void main(String[] args) {

        //object reference type and object type are same
        Father superManOne = new Father();
        superManOne.work("SDET");
        System.out.println("Makes " + superManOne.getPaid() + "$");

        // polymorphism ---> Dynamic, Run time
        // Object reference type is InterFace/Parent Class = Object type is from child classes

        Parent superManTwo = new Father();

        superManTwo.playWithKid();
        ((Father) superManTwo).work("QA Engineer"); //Reference Type decides what can be accessible

        Worker superManThree = new Father();

        superManThree.work("Developer");
        ((Father) superManThree).playWithKid();

        superManTwo = new Mother(); // Now our object reference can point to another object from the family
        superManTwo.playWithKid();

        //Object type decides to use most specific one.

        Parent father = new SuperFather();

        father.playWithKid();


    }

}
