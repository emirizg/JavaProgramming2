package day23_CustomMethods_Void.tasks;

import java.util.Arrays;

public class CheckAnagram {

    public static void main(String[] args) {
        anagram("silent", "listen");
    }

    public static void anagram(String str1,String str2){

        char[] chStr1=str1.toCharArray();
        char[] chStr2=str2.toCharArray();

        Arrays.sort(chStr1);
        Arrays.sort(chStr2);

        boolean isAnagram=Arrays.equals(chStr1,chStr2);

        if (isAnagram){
            System.out.println(str1+" and "+str2+" are anagram");
        }else {
            System.out.println(str1+" and "+str2+" are NOT anagram");
        }

    }

}
/*
17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
 */