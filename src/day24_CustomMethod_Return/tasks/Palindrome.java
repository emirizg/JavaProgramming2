package day24_CustomMethod_Return.tasks;

public class Palindrome {

    public static void main(String[] args) {

        String str = "Level";

        boolean s=isPalindrome(str);

        System.out.println(s);

    }

    public static boolean isPalindrome(String str){

        String reversed="";

        for (int i = str.length()-1; i >= 0 ; i--) {

            char ch=str.charAt(i);

            reversed+=ch;

        }

        boolean isPalindrome=str.equalsIgnoreCase(reversed);

        return isPalindrome;
    }


}
/*
4. By using the reverse method above to create another method named isPalindrome
that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true
 */