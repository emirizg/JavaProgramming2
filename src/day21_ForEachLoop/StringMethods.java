package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        // toCharArray() --> returns a Char array
        // "abc".toCharArray(); ---> {'a','b','c'}

        String str="Java";
        char[] chars=str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for(char each:str.toCharArray()){
            System.out.println(each);
        }

        System.out.println("-----------------------------------------");

        // split(value) --> returns String array
        // "I love java programming language".split(" ") ---> {"I","love","java","programming","language"}
        // "ABC".split("") ---> {"A","B","C"}

        String sentence = "Wooden Spoon";

        String[] words=sentence.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("-----------------------------------------");

        String email="WoodenSpoon@cydeo.com";

        String[] arr=email.split("@");

        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------------------");

        String s="Today is nice day. Today is Monday. Today we learn Java";

        String[] sentences=s.split("\\.");

        System.out.println(Arrays.toString(sentences));




    }

}
