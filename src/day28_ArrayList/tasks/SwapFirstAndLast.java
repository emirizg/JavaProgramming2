package day28_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapFirstAndLast {

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));

        int first=list.get(0);
        int last=list.get(list.size()-1);

        list.set(0,last);
        list.set(list.size()-1, first);

        System.out.println(list);

    }

}
/*
2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];
 */