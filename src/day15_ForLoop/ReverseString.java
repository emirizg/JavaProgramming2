package day15_ForLoop;

public class ReverseString {

    public static void main(String[] args) {

        String str="Java";

        for (int i=str.length()-1;i>=0;i--){

            System.out.print(str.charAt(i));

        }


    }

}
/*
1. Write a program that can reverse any given string

			String str = "Java"; ==> avaJ
		 //			      0123


 */