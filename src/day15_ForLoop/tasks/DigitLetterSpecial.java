package day15_ForLoop.tasks;

public class DigitLetterSpecial {

    public static void main(String[] args) {

        String str="mn@#123Ab!";

        String digits="",
                letters="",
                special="";

        for (int i=0;i<=str.length()-1;i++){

            char ch=str.charAt(i);
            boolean isDigit=ch>=48 && ch<=57;
            boolean isLetter=(ch>=65 && ch<=90) || (ch>=97 && ch<=122);

            if (isDigit){
                digits+=str.charAt(i);
            } else if (isLetter) {
                letters+=str.charAt(i);
            }else {
                special+=str.charAt(i);
            }

        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("special = " + special);

    }

}
/*
5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */