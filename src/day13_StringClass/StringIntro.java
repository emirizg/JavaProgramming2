package day13_StringClass;

import java.lang.String;
import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {


        /*
         any class from other package you must import it in order to use otherwise you can never use it
         if you use any package from java.lang it can imported implicitly you don't need to do by yourself
         compiler can do it for you
         it is designed for char sequences for java, the combination of multiple characters
         JAVA HEAP ---> is a memory allocation, heap is for all the objects
          heap ---> is for the objects
         stack ---> is for the variables
         if it is String literal is stored in string pool and the string pool it does not take duplicates

         from every single class you can create object by using the "new" keyword
         */

        String name1 = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";

        System.out.println(name1==name2); // true
        System.out.println(name2==name3); // true
        System.out.println(name3==name4); // true

        System.out.println("---------------------");

        /*
        - They are stored in different locations
        - They are not same objects
         */
        String str1=new String("Wooden Spoon");
        String str2=new String("Wooden Spoon");
        String str3=new String("Wooden Spoon");
        String str4=new String("Wooden Spoon");

        System.out.println(str1==str2); // false
        System.out.println(str2==str3); // false
        System.out.println(str3==str4); // false

        System.out.println("---------------------");

        /*
        - every single objects they go the java heap
        - but if that object is a literal they go the string pool
        - if the string object is already exist in the pool it is not going to create another one,
          it will still use the same object
        - if it is object use equals method for objects
        - stack and heap are memory allocations
        - heap is for all the objects
        - stack is for all the local variables
         */

        String s1="Java";
        String s2=new String("Java");

        System.out.println( s1.equals(s2) ); // true

        String s3="Java";
        String s4=new String("java");

        System.out.println(s3.equals(s4)); // false




    }

}













