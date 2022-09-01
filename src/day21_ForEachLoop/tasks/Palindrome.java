package day21_ForEachLoop.tasks;

public class Palindrome {

    public static void main(String[] args) {

        String[] palindrome={"anna", "level", "Java"};

        int counter=0;


        for (String word: palindrome){

            String reversed="";

            for (int i = word.length()-1; i >= 0; i--) {
                reversed+=word.charAt(i);
            }

            boolean isPalindrome=word.equalsIgnoreCase(reversed);

            if (isPalindrome){
                counter++;
            }

        }

        System.out.println(counter);
    }

}
/*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */