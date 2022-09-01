package day25_CustomMethods_Overloading.tasks;

import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {

        int[] arr1={1,3,5,66,88,9,29};
        int maxNum1=maxNum(arr1);
        System.out.println("maxNum1 = " + maxNum1);

        System.out.println("----------------------------");

        double[] arr2={13.4,34.4,5.2,6.6,8.8,9.22,29.2};
        double maxNum2=maxNum(arr2);
        System.out.println("maxNum2 = " + maxNum2);

        System.out.println("----------------------------");

        long[] arr3={1243,324234,5,642346,86368,9,2935};
        long maxNum3=maxNum(arr3);
        System.out.println("maxNum3 = " + maxNum3);

        System.out.println("----------------------------");

        short[] arr4={1,3,52,6,8,9,9};
        short maxNum4=maxNum(arr4);
        System.out.println("maxNum4 = " + maxNum4);

        System.out.println("----------------------------");

        float[] arr5={1.4f,3.55f,5.5f,6.6f,8.8f,9,29};
        float maxNum5=maxNum(arr5);
        System.out.println("maxNum5 = " + maxNum5);

        System.out.println("----------------------------");

        byte[] arr6={1,3,5,6,8,9,4};
        byte maxNum6=maxNum(arr6);
        System.out.println("maxNum6 = " + maxNum6);

    }

    //1. create a method that can return the max number from an integer array
    public static int maxNum(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    
    //2. create a method that can return the max number from double array
    public static double maxNum(double[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }


    //3. create a method that can return the max number from long array
    public static long maxNum(long[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }


    //4. create a method that can return the max number from short array
    public static short maxNum(short[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }


    //5. create a method that can return the max number from float array
    public static float maxNum(float[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }


    //6. create a method that can return the max number from byte array
    public static byte maxNum(byte[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }


}
/*
Task 2:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array
 */