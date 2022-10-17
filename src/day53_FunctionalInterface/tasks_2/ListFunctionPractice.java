package day53_FunctionalInterface.tasks_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFunctionPractice {

    public static void main(String[] args) {

        //R apply(List<T> list);

        //1.1 Create a function that can return the maximum number
        //from a list of Integer

        ListFunction<Integer, Integer> findMaxNumber = (listOfInteger) -> {

            int max = listOfInteger.get(0);

            for (Integer eachNum : listOfInteger) {

                if (eachNum > max) {
                    max = eachNum;
                }

            }

            return max;
        };

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1111,222,3231,44,55,6));
        System.out.println(findMaxNumber.apply(integerList));

        System.out.println("------------------------------------------------");

        //1.2 Create a function that can return the minimum number
        //from a list of Integer

        ListFunction<Integer , Integer> findMinNumber = (listOfInteger) -> {

            int min = listOfInteger.get(0);

            for (Integer eachNum : listOfInteger) {

                if (eachNum< min){
                    min = eachNum;
                }

            }
            return min;
        };

        System.out.println( findMinNumber.apply(integerList) );

        System.out.println("------------------------------------------------");

        //1.3 Create a function that can return the longest String
        //from a List of String



    }

}
/*
Use ListFunction functional interface to:
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