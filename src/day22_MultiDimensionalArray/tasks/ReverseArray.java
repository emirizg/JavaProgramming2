package day22_MultiDimensionalArray.tasks;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        //                0         1
        int[][] arr1={ {1,2,3} , {4,5,6} };

        int[][] reversedArr=new int[arr1.length][];

        
        for (int i = 0,z=arr1.length - 1; i < arr1.length; i++,z--) {

            int[] temporrary=new int[arr1[i].length];

            for (int j = 0,k= temporrary.length-1; j < arr1[i].length; j++,k--) {

                temporrary[k] = arr1[i][j];

            }
            reversedArr[z] = temporrary;
        }

        System.out.println(Arrays.deepToString(reversedArr));
    }

}
/*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};

			reversedArr[j][]=arr1[i];


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */