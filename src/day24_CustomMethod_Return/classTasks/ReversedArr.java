package day24_CustomMethod_Return.classTasks;

import java.util.Arrays;

public class ReversedArr {

    public static void main(String[] args) {

        int[] b=reversedArr(new int[]{1,2,3,99,4,973,5,324});

        System.out.println(Arrays.toString(b));

    }

    public static int[] reversedArr(int[] arr){

        int[] rev=new int[arr.length];

        for (int i = 0,j= arr.length-1; i < arr.length; i++,j--) {

            rev[i]=arr[j];

        }

        return rev;
    }

}
/*
4. create a method that return the reversed array
					{1,2,3,4,5} === > {5,4,3,2,1}
 */