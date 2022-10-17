package day53_FunctionalInterface.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFunctionPractice {

    public static void main(String[] args) {

        //2.1 Create a function that can return the maximum number
        //from an array of Integers

        ArrayFunction<Integer, Integer> maxNumber = arr -> {

            int max = arr[0];

            for (Integer eachNum : arr) {

                if (eachNum > max) {
                    max = eachNum;
                }

            }

            return max;
        };

        Integer[] intArray = {122, 363, 532, 42, 7, 33, 4224, 978};
        System.out.println(maxNumber.apply(intArray));

        System.out.println("-----------------------------------------------------------------------------");

        //1.2 Create a function that can return the minimum number
        //from an array of Integers

        ArrayFunction<Integer, Integer> minNumber = arr -> {

            int min = arr[0];

            for (Integer eachNum : arr) {
                if (eachNum < min) {
                    min = eachNum;
                }
            }

            return min;
        };

        System.out.println(minNumber.apply(intArray));

        System.out.println("-----------------------------------------------------------------------------");

        //1.3 Create a function that can return the longest String
        //from an array of String

        String[] stringArray = {"Ahmet", "Cuneyt", "abc", "Emekliss"};

        ArrayFunction<String, String> longestString = words -> {

            String longest = "";
            int max = words[0].length();

            for (String eachWord : words) {

                if (eachWord.length() > max){
                    max = eachWord.length();
                    longest = eachWord;
                }

            }

            return longest;
        };

        System.out.println(longestString.apply(stringArray));

        System.out.println("-----------------------------------------------------------------------------");

        //1.4 Create a function that can return the shortest String
        //from an array of String

        ArrayFunction<String , String > shortestString = words -> {

            int min = words[0].length();
            String shortest = "";

            for (String eachWord : words){

                if (eachWord.length() < min){
                    min = eachWord.length();
                    shortest = eachWord;
                }

            }

            return shortest;
        };

        System.out.println(shortestString.apply(stringArray));
    }


}
/*
2.1 Create a function that can return the maximum number
from an array of Integers
1.2 Create a function that can return the minimum number
from an array of Integers
1.3 Create a function that can return the longest String
from an array of String
1.4 Create a function that can return the shortest String
from an array of String
 */