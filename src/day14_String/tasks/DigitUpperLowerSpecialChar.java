package day14_String.tasks;

import java.util.Scanner;

public class DigitUpperLowerSpecialChar {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a word: ");
        String str=scan.nextLine();

        char a=str.charAt(0);

        boolean isDigit= a<=57 && a>=48;
        boolean isUpper= a<=90 && a>=65;
        boolean isLower= a<=122 && a>=97;

        if (isDigit){
            System.out.println("first character is digit");
        } else if (isUpper) {
            System.out.println("first character is uppercase letter");
        } else if (isLower) {
            System.out.println("first character is lowercase letter");
        }else {
            System.out.println("first character is special character");
        }

        scan.close();
    }

}
/*
5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table

*/
