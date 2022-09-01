package day21_ForEachLoop.tasks2;

public class Palindrome_2 {

    public static void main(String[] args) {

        String[] arr={"anna", "level", "Java"};

        // level length ==> 5
        // 01234

        int counter=0;

        for (String word: arr){

            String reversedWord="";

            for (int i = word.length()-1; i >=0 ; i--) {
                reversedWord+=word.charAt(i);
            }

            boolean isPalindrome=word.equalsIgnoreCase(reversedWord);

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