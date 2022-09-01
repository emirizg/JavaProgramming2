package week05;

public class StringReview01 {

    // main method makes our code runable
    public static void main(String[] args) {

        String str1="Java"; // literall way of creating String

        String str2="Java";

        /*
        Java compiler checks the String pool, and if there is already a string in the pool, Java does not create a new one
        str1: reference to our String object
        str2: reference to our String object
         */

        System.out.println(str1==str2); // checks if the objects are same --> true

        String str3= new String("Java"); // java does not check String pool, it just creates tottaly a new String

        System.out.println(str1==str3); // false

        // when you just want to check if the contents are same: .equals() method

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true

        /*
        ArrayList, Collections, OOP topics
         */


        String str4="JaVa";
        System.out.println(str1.equalsIgnoreCase(str4)); // Case insensitive




    }

}
