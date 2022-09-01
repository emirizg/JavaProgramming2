package day20_Arrays.tasks;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};

        int[] reversedArray=new int[arr.length];

        for (int i = arr.length-1,j=0; i >= 0; i--,j++) {

            reversedArray[j]=arr[i];

        }

        System.out.println(Arrays.toString(reversedArray));
    }

}
/*
5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */