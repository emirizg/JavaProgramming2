package day28_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1112,2562,213,832,244,5111));

        int min= list.get(0);

        for (int each : list){
            if (each<min){
                min=each;
            }
        }

        System.out.println(list);
        System.out.println("min = " + min);


    }

}
/*

6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1
 */