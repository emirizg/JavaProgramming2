package day24_CustomMethod_Return.tasks;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60};
        int index = 2;

        int[] arr1=removeElement(array,index);

        System.out.println(Arrays.toString(arr1));

    }

    public static int[] removeElement(int[] arr2,int num){

        int[] arr3=new int[arr2.length-1];

        int j=0;
        for (int i = 0; i < arr2.length; i++) {

            if (i==num){

                continue;
            }

            arr3[j]=arr2[i];
            j++;

        }

        return arr3;

    }

}
/*
    10. create a method named removeElement that passes one integer array and one integer,
    the method removes the integer index from the integer array and returns the new array
			Ex:
				int[] array = {10, 20, 30, 40, 50, 60};
				int index = 2;

				removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */