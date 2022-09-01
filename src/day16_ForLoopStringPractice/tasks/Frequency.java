package day16_ForLoopStringPractice.tasks;

import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str=input.nextLine();

        System.out.println("Enter a char: ");
        char ch=input.next().charAt(0);


        input.close();

        int counter=0;

        for (int i=0;i<=str.length()-1;i++){

            if (str.charAt(i) == ch){
                counter++;
            }

        }

        System.out.println("counter = " + counter);

    }

}
/*
2. Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */