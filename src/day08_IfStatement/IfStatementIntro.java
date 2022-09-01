package day08_IfStatement;

public class IfStatementIntro {

    public static void main(String[] args) {

        int number= 301;

        /*
        System.out.println("Odd Number"); // 1-3-5-7-9
        System.out.println("Even Number"); // 0-2-4-6-8
         */

        boolean evenNumber= number%2==0;
        boolean oddNumber= number%2!=0;
        //boolean oddNumber = !evenNumber; // not even number

        if (evenNumber){ // even number
            System.out.println(number + " is Even Number.");
        }

        if (!evenNumber){ // not even number
            System.out.println(number + " is Odd Number.");
        }

        System.out.println("------------------------------------");

        int n= 200;

        // positive
        if (n > 0){ //if the n is greater than zero, then it's positive
            System.out.println(n+ " is positive");
        }
        // negative
        if (n < 0){ //if the n is less than zero, then it's negative
            System.out.println(n+" is negative");
        }
        // zero
        if (n == 0){ // if the n is equal to zero, then it's zero
            System.out.println(n+ " is zero");
        }

    }

}
