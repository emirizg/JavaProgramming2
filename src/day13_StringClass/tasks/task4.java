package day13_StringClass.tasks;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter first name: ");
        String str1=input.nextLine();

        System.out.println("Enter last name: ");
        String str2=input.nextLine();

        char first=str1.charAt(0);
        char last=str2.charAt(0);

        System.out.println(first+"."+last);

        input.close();

    }

}
/*
. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */