package day24_CustomMethod_Return.tasks;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int[] result=merge(arr1, arr2);

        System.out.println(Arrays.toString(result));


    }

    public static int[] merge(int[] arr3,int[] arr4){

        int[] newArray=new int[arr3.length+ arr4.length];

        int i=0;

        for (int ele:arr3){
            newArray[i]=ele;
            i++;
        }

        for (int ele:arr4){
            newArray[i]=ele;
            i++;
        }

        return newArray;
    }

}
/*

	7. Create a method named merge that passes two integer array parameters,
	the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}
 */