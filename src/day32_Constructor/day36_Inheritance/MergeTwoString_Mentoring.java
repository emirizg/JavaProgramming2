package day32_Constructor.day36_Inheritance;

import java.util.Scanner;

public class MergeTwoString_Mentoring {

    public static void main(String[] args) {

        String a = merge();

        System.out.println(a);

    }


    public static String merge() {
        Scanner scan = new Scanner(System.in);

        String s1 = scan.next();
        String s2 = scan.next();

        String result = "";

        for (int i = 0; i < s1.length() + s2.length(); i++) {

            if (i < s1.length()) {
                result += s1.charAt(i);
            }

            if (i < s2.length()) {
                result += s2.charAt(i);
            }

        }

        return result;
    }

}
/*
Write code to merge given 2 Strings, one letter at a time, starting with one.
Please note one and two can be of different lengths.

Examples:
s1 ==> "12345"
s2 ==> "abcde"
Result: "1a2b3c4d5e"

s1 ==> "12345"
s2 ==> "abcdefghj"
Result: "1a2b3c4d5efghj"



Solution Phases:
1- First, create 2 String variables and then your code should merge them one letter at a time

You can use ARRAYS or ARRAYLIST
 */