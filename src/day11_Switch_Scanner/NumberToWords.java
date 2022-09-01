package day11_Switch_Scanner;

public class NumberToWords {

    public static void main(String[] args) {

        byte n=0;

        boolean isValid= n>= 0 && n<=9 ;

        String word= (isValid)?(n==0)? "Zero" : (n==1)?"One":(n==2)?"Two":(n==3)?"Three":(n==4)?"Four":(n==5)?"Five":(n==6)?"Six"
                :(n==7)?"Seven":(n==8)?"Eight":"Nine":"Invalid score";

        System.out.println(word);

    }

}
/*

	2. Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary
 */
