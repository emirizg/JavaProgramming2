package day13_StringClass.tasks;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str=input.nextLine();

        int length=str.length();



        if (length>5){
            System.out.println("Too long!");
        } else if (length < 5) {
            System.out.println("Too short");
        }else {
            char a1=str.charAt(0);
            char a2=str.charAt(1);
            char a3=str.charAt(2);
            char a4=str.charAt(3);
            char a5=str.charAt(4);
            System.out.println(""+a5+a4+a3+a2+a1);
        }

        input.close();
    }

}
/*
1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
 */