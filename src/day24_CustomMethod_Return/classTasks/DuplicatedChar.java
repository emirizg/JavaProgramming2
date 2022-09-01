package day24_CustomMethod_Return.classTasks;

public class DuplicatedChar {

    public static void main(String[] args) {

        System.out.println(removeRuplicated("aaabbcccc"));

    }

    public static String removeRuplicated(String str){

        String result="";

        for (int i = 0; i < str.length(); i++) {

            char each=str.charAt(i);

            if ( !(result.contains(""+each)) ){

                result+=each;

            }

        }

        return result;
    }

}

/*
1. create a method that can remove duplciated characters from a string and returns the new value
					"aaabbcccc" ===> "abc"
 */