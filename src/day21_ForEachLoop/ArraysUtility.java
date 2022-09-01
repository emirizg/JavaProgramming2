package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        System.out.println("--------------------ARRAYS UTILITY CLASS-----------------------------");
        System.out.println("--------------------toString()-----------------------------");
        // toString() --> converts the array object to string, returns string

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0]); // it is an element

        /*
        String str="Java";
        System.out.println(str);
        System.out.println(str.toString());
         */

        System.out.println("--------------------sort()-----------------------------");

        // sort() --> sorts the array in ascending order(smallest to largest)(0~9)(A~Z)
        // descending order(largest to smallest)(reverse .sort())

        int[] scores = {95, 100, 55, 65, 85, 78};

        Arrays.sort(scores); // {55,65....100};

        System.out.println(Arrays.toString(scores));

        System.out.println("Min score: " + scores[0]);
        System.out.println("Max score: " + scores[scores.length - 1]);

        String[] names = {"Gunay", "Zuhal", "Ahmet", "Maria", "Sinem", "Anna"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        String[] words = {"Anna", "ANNA"};

        Arrays.sort(words);

        System.out.println(Arrays.toString(words));

        System.out.println("---------------------equals(array1,array2)----------------------------");

        // equals(array1,array2) --> checks if two arrays equal, returns boolean(they need to have same length)

        int[] arr1 = {1, 3, 2};
        int[] arr2 = {1, 2, 3};

        boolean r1 = Arrays.equals(arr1, arr2);

        System.out.println(r1);

        Arrays.sort(arr1); // 1,2,3
        Arrays.sort(arr2); // 1,2,3

        boolean r2=Arrays.equals(arr1,arr2);

        System.out.println(r2);

        System.out.println("--------------------anagram-----------------------------");

        char[] ch1={'a','c','b'};
        char[] ch2={'b','a','c'};

        //check if they are anagram

        Arrays.sort(ch1); // a,b,c
        Arrays.sort(ch2); // a,b,c

        boolean anagram=Arrays.equals(ch1,ch2);

        System.out.println("anagram: "+anagram);



    }

}
