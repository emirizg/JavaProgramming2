package week15;

import java.util.Scanner;

public class ExecutionExample {

    public static void main(String[] args) {

        System.out.println("Hello, enter an positive integer number");

        int x = 5;

        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();

        try {

            System.out.println(x / y); // there is a possibility that you might get ArithmeticException, InputMissMatchException
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        // below lines of code are very important for my test case, even if I get exception I don't wnt execution to stop

        System.out.println("how are you?");

        System.out.println("Some more lines of code");

    }

}
