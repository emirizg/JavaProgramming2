package day53_FunctionalInterface.tasks;

import java.util.*;
import java.util.function.Function;

public class Function_FunctionalInterface {

    public static void main(String[] args) {

        // Function<T, R> R
        // apply(T t);

        //4.1 Create a function that can return the sum of digits
        //from a string

        Function<String, Integer> sumOfDigits = str -> {

            char[] charArray = str.toCharArray();

            int sum = 0;

            for (char eachChar : charArray) {

                if (Character.isDigit(eachChar)) {
                    sum += Integer.parseInt(eachChar + "");
                }

            }

            return sum;
        };

        String str = "apple2amazon6facebook4";

        System.out.println(sumOfDigits.apply(str));

        System.out.println("------------------------------------------------");

        //4.2 Create a function that can convert a Set of Integers
        //to List of Integers

        Function<Set<Integer>, List<Integer>> convertSetToList = integerSet -> {
            List<Integer> list = new ArrayList<>(integerSet);
            return list;
        };

        Set<Integer> integerSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> a = convertSetToList.apply(integerSet);
        System.out.println(a);

        System.out.println("------------------------------------------------");

        //4.3 Create a function that can convert a Set of String to
        //List of String

        Function<Set<String>, List<String>> convertSetStringToList = stringSet -> {
            List<String> list = new ArrayList<>(stringSet);
            return list;
        };

        Set<String> stringSet = new HashSet<>(Arrays.asList("Apple", "Amazon", "Facebook", "Microsoft", "Whatsapp", "Instagram"));

        List<String> b = convertSetStringToList.apply(stringSet);
        System.out.println(b);

        System.out.println("------------------------------------------------");

        //4.4 Create a function that can return the reversed
        //version of an int array

        Function<int[], int[]> reversedVersionOfIntArray = intArray -> {

            int[] reversed = new int[intArray.length];

            for (int i = intArray.length - 1, j = 0; i >= 0; i--, j++) {
                reversed[j] = intArray[i];
            }
            return reversed;
        };

        int[] w = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(reversedVersionOfIntArray.apply(w)));

        System.out.println("------------------------------------------------");

        //4.5 Create a function that can return the reversed
        //version of a String array

        Function<String[], String[]> reversedVersionOfStringArray = stringArray -> {

            String[] reversed = new String[stringArray.length];

            for (int i = stringArray.length - 1, j = 0; i >= 0; i--, j++) {
                reversed[j] = stringArray[i];
            }
            return reversed;
        };

        String[] strArray = {"Apple", "Amazon", "Facebook", "Microsoft", "Whatsapp", "Instagram"};
        System.out.println(Arrays.toString(reversedVersionOfStringArray.apply(strArray)));

        System.out.println("------------------------------------------------");

        //4.6 Create a function that can return the sorted
        //(decending) version of an int array
        //Note: you can use the reverse function
        //you created at 4.4

        Function<int[], int[]> sortedIntArray = arr -> {

            //int[] sortedArr = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {

                for (int j = i + 1; j < arr.length; j++) {

                    if (arr[i]>arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }


                }

            }

            return arr;
        };

        int[] abcd = {2,3,1,16,9,3,533,317,5,625,3,132,6,3,23};
        System.out.println(Arrays.toString(sortedIntArray.apply(abcd)));

        System.out.println("------------------------------------------------");

        //4.7 Create a function that can return the sorted
        //(decending) version of a String array
        //Note: you can use the reverse function
        //you created at 4.5

        Function<String[], String[] > reverseStringArray = arr -> {

            for (int i = 0; i < arr.length; i++) {

                for (int j = i + 1; j < arr.length; j++) {

                    if (arr[i].length()>arr[j].length()) {
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }


                }

            }

            return arr;

        };

        String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};

        System.out.println(Arrays.toString(reverseStringArray.apply(countries)));
    }

}
/*
4. Use Function functional interface to:
4.1 Create a function that can return the sum of digits
from a string
4.2 Create a function that can convert a Set of Integers
to List of Integers
4.3 Create a function that can convert a Set of String to
List of String
4.4 Create a function that can return the reversed
version of an int array
4.5 Create a function that can return the reversed
version of a String array
4.6 Create a function that can return the sorted
(decending) version of an int array
Note: you can use the reverse function
you created at 4.4
4.7 Create a function that can return the sorted
(decending) version of a String array
Note: you can use the reverse function
you created at 4.5
 */