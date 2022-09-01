package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        //unchecked exceptions: during **runtime**

        // java.lang done by implicitly

        /*
        - to create an object you need to create an object, null means does not exist
        - null --> nothing
        - in order to use instances you need to create an object
        - if you use final keyword it will not be eligible for garbage collection
        - exception class is the parent of both checked and unchecked

         */


        int a = 10;
        int b = 0;


        /*
        System.out.println( a / b );

        System.out.println("Wooden Spoon");

         */

        char[] characters = {'A','B','C'};

        //System.out.println(characters[99]); --> ArrayIndexOutOfBoundsException

        Student student = null;

        //System.out.println( student.getName() ); --> NullPointerException
        //student.study(); --> NullPointerException

        String str = "Wooden Spoon"; // it is collected by garbage collector
        str = null;

        //System.out.println( str.toUpperCase() ); --> NullPointerException

        String str2 = "    "; // is blank

        System.out.println(str2.isBlank());

        //checked Exception:

        System.out.println("Hello");

        //Thread.sleep(3000); --> InterruptedException

        System.out.println("Cydeo");

        //FileInputStream file = new FileInputStream("path of the file"); // --> FileNotFoundExceptio

        System.out.println("java".charAt(1000)); //unchecked



    }

}
