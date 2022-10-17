package day53_FunctionalInterface.tasks;

import week16.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFunctionPractice {

    public static void main(String[] args) {

        //1.1 Create a function that can return the maximum number
        //from a list of Integer

        //R apply(List<T> list);

        ListFunction<Integer, Integer> test = (list) -> {

            int maxNumber = list.get(0);

            for (Integer eachNum : list) {

                if (eachNum>maxNumber){
                    maxNumber=eachNum;
                }

            }

            return maxNumber;
        };

        List<Integer> integerList = new ArrayList<>(Arrays.asList(32,231,30,2215,621,72,822,92,10));
        System.out.println(test.apply(integerList));

        System.out.println("--------------------------------------------------------");

        //1.2 Create a function that can return the minimum number
        //from a list of Integer

        ListFunction<Integer, Integer> minNum = (list) -> {

            int minNumber = list.get(0);

            for (Integer eachNum : list) {

                if (eachNum<minNumber){
                    minNumber = eachNum;
                }

            }


            return minNumber;

        };

        System.out.println(minNum.apply(integerList));

        System.out.println("--------------------------------------------------------");

        //1.3 Create a function that can return the longest String
        //from a List of String

        ListFunction<String ,String> longestString = (list) -> {

            int max=list.get(0).length();
            String longestWord = "";

            for (String eachWord : list) {

                if (eachWord.length() > max){
                    max = eachWord.length();
                    longestWord = eachWord;
                }

            }

            return longestWord;

        };

        List<String> stringList = new ArrayList<>(Arrays.asList("Ahmet", "Cuneyt", "abc","Emekliss"));
        System.out.println(longestString.apply(stringList));

        System.out.println("--------------------------------------------------------");

        //1.4 Create a function that can return the shortest String
        //from a List of String

        ListFunction<String, String> shortestString = (list) -> {

            String shortest = "";
            int sh = list.get(0).length();

            for (String eachWord : list) {

                if (eachWord.length()<=sh){
                    sh=eachWord.length();
                    shortest = eachWord;
                }

            }


            return shortest;

        };

        System.out.println(shortestString.apply(stringList));


        System.out.println("--------------------------------------------------------");

        //1.5 Create a function that can convert List of integer to int array

        ListFunction<Integer, int[]> convertListToIntArray = (list) -> {

            int[] intArr = new int[list.size()];

            int i = 0;

            for (Integer eachNum : list) {
                intArr[i++] = eachNum;
            }

            return intArr;
        };

        int[] arraysss = convertListToIntArray.apply(integerList);

        System.out.println(Arrays.toString(arraysss));

        System.out.println("--------------------------------------------------------");

        //1.6 Create a function that can convert List of double to
        //double array

        ListFunction<Double, double[]> convertListToDoubleArray = (p) -> {

            double[] doubleArray = new double[p.size()];

            int i = 0;

            for (Double eachDouble : p) {
                doubleArray[i++] = eachDouble;
            }

            return doubleArray;
        };

        List<Double> doubleList = new ArrayList<>(Arrays.asList(2.1, 2.2,22.1,75.4,6.3));

        double[] doubleArray = convertListToDoubleArray.apply(doubleList);

        System.out.println(Arrays.toString(doubleArray));

    }


}

/*
1.1 Create a function that can return the maximum number
from a list of Integer
1.2 Create a function that can return the minimum number
from a list of Integer
1.3 Create a function that can return the longest String
from a List of String
1.4 Create a function that can return the shortest String
from a List of String
1.5 Create a function that can convert List of integer to
int array
1.6 Create a function that can convert List of double to
double array
 */