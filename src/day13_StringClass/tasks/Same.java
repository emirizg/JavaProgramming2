package day13_StringClass.tasks;

import java.util.Scanner;

public class Same {

    public static void main(String[] args) {

       // Scanner input=new Scanner(System.in);
        String str="level";
        //          01234

        // 1st solution
        String first=str.substring(0,1); //0
        String last=str.substring(str.length()-1);

        if (first.equals(last)){
            System.out.println("same");
        }else {
            System.out.println("not same");
        }
        System.out.println("----------2nd----------------");
        //2nd solution
        char first2=str.charAt(0);
        char last2=str.charAt(str.length()-1);

        if (first2 == last2){
            System.out.println("same");
        }else {
            System.out.println("not same");
        }





    }

}
/*
3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */