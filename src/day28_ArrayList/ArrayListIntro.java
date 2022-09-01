package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {

    /*
    - Data Structure:
    1.Array --> size is fixed, supports both primitives & non primitives
    2.Collection --> size is dynamic, does not support primitives

    - Array List is part of Collection      data structure
    - internally uses the array
    - ArrayList is faster than other class in Collection
    - import java.util.ArrayList;

                 mandatory                      optional
    - ArrayList <DataType> name = new ArrayList<DataType>();

    - Data Type of the ArrayList cannot be a primitive type
     */

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(); // syntax of creating ArrayList
        ArrayList<String> names = new ArrayList<>();

        System.out.println(numbers);
        System.out.println(names);

    }

}










