package day13_StringClass.tasks;

import java.util.Scanner;

public class Longest {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter two string: ");
        String str1=scan.nextLine();
        String str2=scan.nextLine();

        int str1Length=str1.length();
        int str2Length=str2.length();

        if (str1Length>str2Length){
            System.out.println(str1);
        }else {
            System.out.println(str2);
        }

    }

}
/*
2. write a program that asks user to enter two strings, and print out the longest string

 */