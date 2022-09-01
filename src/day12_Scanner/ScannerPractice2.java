package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

     /*   System.out.println("Enter true or false: ");
        boolean result=scan.nextBoolean();
        System.out.println(result);

      */

        System.out.println("Enter your name: ");
        String name=scan.next(); // the functionality of this method is it only reads the inputs till the space
        // this .next() method you will use it when if you are expecting one word input from the user,
        // it can not read more than one word, if there is a space

        System.out.println("Name = "+name);

        scan.close();


    }

}
