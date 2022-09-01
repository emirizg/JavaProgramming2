package day13_StringClass.tasks;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str=input.nextLine();

        boolean isEmpty=str.isEmpty();
        int length=str.length();

        if (isEmpty){
            System.out.println("String is empty");
        } else if (length > 3) {
            char a=str.charAt(length-1);
            char b=str.charAt(length-2);
            char c=str.charAt(length-3);
            System.out.println(""+c+b+a);
        }else {
            System.out.println(str);
        }

        input.close();
    }

}
/*
5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */