package day13_StringClass.tasks;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter 3 words: ");
        String str1=input.nextLine();
        String str2=input.nextLine();
        String str3=input.nextLine();

        int str1Length=str1.length();
        int str2Length=str2.length();
        int str3Length=str3.length();

        if (str1Length==str2Length && str1Length==str3Length){
            System.out.println("All words are same length");
        } else if (str1Length != str2Length && str1Length != str3Length && str2Length != str3Length) {
            System.out.println("All different length");
        }else {
            System.out.println("Not same nor Different lengths");
        }

        input.close();
    }

}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */