package week15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {

    public static void main(String[] args) {

        System.out.println("Hello, enter an positive integer number");

        int x = 5;

        Scanner scanner = new Scanner(System.in);


        try {
            int y = scanner.nextInt();
            System.out.println(x / y); // there is a possibility that you might get ArithmeticException, InputMissMatchException
        }catch (ArithmeticException e){
            e.printStackTrace();
        } catch (InputMismatchException i){
            i.printStackTrace();
        }
        // below lines of code are very important for my test case, even if I get exception I don't wnt execution to stop

        System.out.println("how are you?");

        System.out.println("Some more lines of code");

    }

}
