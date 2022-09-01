package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        // I don't have remove function in array, I need to convert to ArrayList
        String[] countries={"Japan","Korea","United States","Turkey","United Kingdom","Canada"};

        //converting array to ArrayList:
        ArrayList<String> list=new ArrayList<>(Arrays.asList(countries));

        list.removeIf( p -> p.length() >= 10);

        //converting ArrayList to array:
        countries = list.toArray(new String[0]); // any number you put here it is going to be replaced by arrayList.size

        System.out.println(Arrays.toString(countries));


    }

}
/*
1. create an Array of string called countries

2. write a program that can remove all the country names that have length of 10 or greater
 */