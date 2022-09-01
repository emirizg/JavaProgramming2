package week15;

public class ErrorExample {

    //somehow you created a bad code that generates infinite loop
    //we usually do not handle the errors, we just don't do it

    /*
    - Runtime Errors are due to bad coding
    - Compile time errors: Your code does not even compile
     */


    public static void main(String[] args) {

        try {
            deathlyMethod();
        }catch (StackOverflowError error){
            System.out.println(error.getCause());
            System.out.println(error.getMessage());
        }

        System.out.println("Codes after error executed or not?");

    }

    static int counter  = 0;

    public static void deathlyMethod(){
        System.out.println(counter++);
        deathlyMethod();
    }

}
