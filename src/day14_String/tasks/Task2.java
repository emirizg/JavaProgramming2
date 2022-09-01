package day14_String.tasks;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word=scan.nextLine();

        String str=""+word.charAt(word.length()-2)+word.charAt(word.length()-1);

        if (str.equals("ly")) {
            System.out.println("really???");
        }else {
            System.out.println("Never mind");
        }

        scan.close();


    }

}
/*
    2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"

 */