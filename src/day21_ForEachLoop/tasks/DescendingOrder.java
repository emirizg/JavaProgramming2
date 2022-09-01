package day21_ForEachLoop.tasks;

import java.util.Arrays;

public class DescendingOrder {

    public static void main(String[] args) {

        int[] arr1={3,6,1,8,2,9,4,5,0,7};

        Arrays.sort(arr1);

        int[] arr2=new int[arr1.length];

        for (int i = arr1.length-1,j=0; i >= 0; i--,j++) {

            arr2[j]=arr1[i];

        }

        System.out.println(Arrays.toString(arr2));

    }

}
/*
1. Write a program that sort the array of integer in descending order
 */