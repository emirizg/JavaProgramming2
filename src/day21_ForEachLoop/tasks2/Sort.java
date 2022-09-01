package day21_ForEachLoop.tasks2;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {

        int[] arr={9,2,6,4,5,3}; // 2,3,4,5,6,9

        int[] reversed=new int[arr.length];

        Arrays.sort(arr); // ascending - descending

        for (int i = arr.length-1, j=0 ; i >= 0; i-- ,j++) {

            reversed[j]=arr[i];

        }

        System.out.println(Arrays.toString(reversed));

    }

}
/*
1. Write a program that sort the array of integer in descending order
 */