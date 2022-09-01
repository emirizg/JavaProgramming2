package day24_CustomMethod_Return.tasks;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40};

        int[] arr2 = reverse(arr1);

        System.out.println(Arrays.toString(arr2));

    }

    public static int[] reverse(int[] array1){

        int[] array2=new int[array1.length];

        for (int i = array1.length-1,j=0; i >=0 ; i--,j++) {

            array2[j]=array1[i];

        }

        return array2;
    }

}
/*
8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}
 */
