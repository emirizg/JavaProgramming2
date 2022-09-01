package day22_MultiDimensionalArray.tasks;

import java.util.Arrays;

public class ReversedArray_2 {

    public static void main(String[] args) {

        System.out.println("---------------String----------------------");
        // String REVERSING

        String word="Ankara is the best of the world.";

        String reversedWord="";

        for (int i = word.length()-1; i >= 0; i--) {

            reversedWord+=word.charAt(i);

        }

        System.out.println(reversedWord);

        System.out.println("---------------1D----------------------");
        // 1D ARRAY REVERSING

        int[] arr1={1,2,3,4,5};

        int[] reversedArray1=new int[arr1.length];

        for (int i = arr1.length-1 , j=0; i >= 0; i--, j++) {

            reversedArray1[j]=arr1[i];
            //   01234       =  43210

        }

        System.out.println(Arrays.toString(reversedArray1));

        System.out.println("---------------2D----------------------");
        // 2D ARRAY REVERSING

        //                 0        1
        int[][] arr2 = { {1,2,3}, {4,5,6}}; //length -->2
        //                1 2 3    4 5 6

        int[][] reversedArray2= new int[arr2.length][];

        for (int i = arr2.length-1,j=0; i >=0 ; i--,j++) {

            int[] newArr=new int[arr2[j].length];

            for (int k = newArr.length-1,z=0; k >=0 ; k--,z++) {

                //{1,2,3}=
                newArr[k]=arr2[j][z];

            }

            reversedArray2[i]=newArr;

        }

        System.out.println(Arrays.deepToString(reversedArray2));
    }

}
/*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};

 */