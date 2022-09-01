package day17_While_DoWhile;

public class WhileLoopIntro {

    /*
    - You can not give initialization in while loop
    - while loop it only takes the condition in ()
    - we need to give outside the loop initialization, we can not give it within while the loop
    - While loop, it can do anything for loop does
    - If we know how many times to repeat FOR LOOP is the best solution,
        initialization&condition can be given within the for loop
    - If the number of repeating is unknown then WHILE LOOP is the best to use

     */

    public static void main(String[] args) {

        if (true){
            System.out.println("Wooden Spoon"); // 1 time
        }

        System.out.println("----------------------------------------------");

        while (true){ // repeated if statement
            System.out.println("Wooden Spoon"); // time
        }


    }

}
