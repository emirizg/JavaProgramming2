package day14_String.tasks;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word=scan.next();

        char x=word.charAt(0);

        if (x=='x'){
            System.out.println(word.substring(1));
        }

        scan.close();
    }

}
/*
3. Ask user to enter a word. If the word starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */