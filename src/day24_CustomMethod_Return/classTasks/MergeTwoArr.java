package day24_CustomMethod_Return.classTasks;

import java.util.Arrays;

public class MergeTwoArr {

    public static void main(String[] args) {

        int[] b=mergeTwo(new int[]{1,2,3},new int[]{4,5});

        System.out.println(Arrays.toString(b));

    }

    public static int[] mergeTwo(int[] arr1,int[] arr2){

        int[] merged=new int[arr1.length + arr2.length];

        int j=0;

        for (int i : arr1) {
            merged[j]=i;
            j++;
        }

        for (int i : arr2) {
            merged[j]=i;
            j++;
        }

        return merged;

    }

}
/*
5. create a method that can merge two arrays and returnj the new array
				arr1 = {1,2,3}
				arr2 = {4,5}

				{1,2,3,4,5}

 */