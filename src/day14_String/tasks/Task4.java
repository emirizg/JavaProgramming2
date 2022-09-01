package day14_String.tasks;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a word: ");
        String first=scan.next();
        String second=scan.next();

        char a=first.charAt(first.length()-1);
        char b=second.charAt(0);

        boolean isEqual= a == b;

        if (isEqual){
            System.out.println(first+second.substring(1));
        }

        scan.close();
    }

}
/*
4. Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last word is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */