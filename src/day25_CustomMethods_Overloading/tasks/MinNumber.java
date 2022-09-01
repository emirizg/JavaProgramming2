package day25_CustomMethods_Overloading.tasks;

import java.util.Arrays;

public class MinNumber {

    public static void main(String[] args) {

        int[] arr1={188,3980,588,66,88,9,29};
        int minNum1=minNum(arr1);
        System.out.println("minNum1 = " + minNum1);

        System.out.println("----------------------------");

        double[] arr2={13.4,34.4,5.2,6.6,8.8,9.22,29.2};
        double minNum2=minNum(arr2);
        System.out.println("minNum2 = " + minNum2);

        System.out.println("----------------------------");

        long[] arr3={1243,324234,5,642346,86368,9,2935};
        long minNum3=minNum(arr3);
        System.out.println("minNum3 = " + minNum3);

        System.out.println("----------------------------");

        short[] arr4={52,6,8,9,9};
        short minNum4=minNum(arr4);
        System.out.println("minNum4 = " + minNum4);

        System.out.println("----------------------------");

        float[] arr5={1.4f,3.55f,5.5f,6.6f,8.8f,9,29};
        float minNum5=minNum(arr5);
        System.out.println("minNum5 = " + minNum5);

        System.out.println("----------------------------");

        byte[] arr6={3,5,6,8,9,4};
        byte minNum6=minNum(arr6);
        System.out.println("minNum6 = " + minNum6);

    }

    //1. create a method that can return the max number from an integer array
    public static int minNum(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    //2. create a method that can return the max number from double array
    public static double minNum(double[] arr){
        Arrays.sort(arr);
        return arr[0];
    }


    //3. create a method that can return the max number from long array
    public static long minNum(long[] arr){
        Arrays.sort(arr);
        return arr[0];
    }


    //4. create a method that can return the max number from short array
    public static short minNum(short[] arr){
        Arrays.sort(arr);
        return arr[0];
    }


    //5. create a method that can return the max number from float array
    public static float minNum(float[] arr){
        Arrays.sort(arr);
        return arr[0];
    }


    //6. create a method that can return the max number from byte array
    public static byte minNum(byte[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    
}
/*
Task 3:
	1. create a method that can return the min number from an integer array

	2. create a method that can return the min number from double array

	3. create a method that can return the min number from long array

	4. create a method that can return the min number from short array

	5. create a method that can return the min number from float array

	6. create a method that can return the min number from byte array

 */