package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str="Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("-----------------------------------");

        String s1="Cydeo School";

        String reverse=StringUtility.reverse(s1);

        System.out.println(reverse);

        System.out.println("-----------------------------------");

        String word="java";

        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println(palindrome);

        System.out.println("-----------------------------------");
        //how many palindrome you have in the array
        String[] names={"Anna","Java","Python","Racecar","Mom","Cydeo"};

        int count=0;

        for (String each: names){
            if (StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);

        System.out.println("-----------------------------------");

        String s2="aaaaaaabbbbbbbbccccc";

        String nonDup = StringUtility.removeDuplicates(s2);

        System.out.println(nonDup);




    }



}
