package day15_ForLoop.tasks;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str=scan.nextLine();

        String reversed="";

        for (int i=str.length()-1; i>=0; i--){

            reversed+=str.charAt(i);
        }

        boolean isPalindrome=str.equalsIgnoreCase(reversed);

        System.out.println("isPalindrome = " + isPalindrome);



    }

}
/*
8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */