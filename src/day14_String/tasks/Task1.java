package day14_String.tasks;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter two words: ");
        String first=input.nextLine();
        String second=input.nextLine();

        System.out.println(first.substring(1)+second.substring(1));

        input.close();

    }

}
/*
1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */