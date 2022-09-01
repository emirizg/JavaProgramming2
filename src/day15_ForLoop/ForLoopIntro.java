package day15_ForLoop;

public class ForLoopIntro {

    public static void main(String[] args) {

        /*
        - if you know exact number of repeating use For Loop
        - i --> initialization
        - initialization and condition are mandatory
        - if don't give the right Iterator you will get a logical error not compile error
        - whatever iterator you give it needs to be capable enough to make condition false
        - giving the right iterator its extremely important
        - initialization is first to run
        - in the for loop we initialize i variable , it's a local variable,
          so we are not able to use it outside the for loop
        - anything within the loop body will be repeated
         */

        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");

        System.out.println("----------------------------");

        for (int i= 1; i<=10; i++){
            System.out.println("Hello world!");
        }

    }

}
