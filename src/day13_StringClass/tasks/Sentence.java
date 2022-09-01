package day13_StringClass.tasks;

import java.util.Scanner;

public class Sentence {

    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence=scan.nextLine();

        char first=sentence.charAt(0);
        char last=sentence.charAt(sentence.length()-1);

        System.out.println(first+" "+last);


    }

}
/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */