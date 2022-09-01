package day17_While_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        // char does not have equalsIgnoreCase

        String str="AAABBBC";
        char ch='A';

        int frequency=0; // +1+1

        for (int i=0;i<str.length();i++){ // i: indexs of str
            char eachChar= str.charAt(i); // each character of str

            if (ch == eachChar){ // if given char is matching with the eachchar, then ch is appeared in the string
                frequency++;
            }

        }

        System.out.println(frequency);
    }

}
/*
	1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */