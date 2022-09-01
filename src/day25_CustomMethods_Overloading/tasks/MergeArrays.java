package day25_CustomMethods_Overloading.tasks;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};

        int[] arr3=mergeTwoArray(arr1,arr2);

        System.out.println(Arrays.toString(arr3));

        System.out.println("------------------------------------");

        double[] arr4={1.6,4.2,3.5,4.9};
        double[] arr5={9.8,7.3,2.2};

        double[] arr6=mergeTwoArray(arr4,arr5);

        System.out.println(Arrays.toString(arr6));

        System.out.println("------------------------------------");

        char[] ch1={'a','b','d'};
        char[] ch2={'p','q'};

        char[] ch3=mergeTwoArray(ch1,ch2);
        System.out.println(Arrays.toString(ch3));

        System.out.println("------------------------------------");

        String[] str1={"Ahmet","Wooden","Spoon","Java","Python"};
        String[] str2={"Osman","Escuela"};

        String[] str3=mergeTwoArray(str1,str2);

        System.out.println(Arrays.toString(str3));


    }

    //1. create a method that can merge two integer arrays.
    public static int[] mergeTwoArray(int[] arr1, int[] arr2){

        int[] newArr=new int[arr1.length+ arr2.length];

        int i=0;
        for (int element : arr1) {
            newArr[i++]=element;
        }
        for (int element : arr2) {
            newArr[i++]=element;
        }

        return newArr;
    }
    
    //2. create a method that can merge two double arrays.
    public static double[] mergeTwoArray(double[] arr1, double[] arr2){

        double[] newArr=new double[arr1.length+ arr2.length];

        int i=0;
        for (double element : arr1) {
            newArr[i++]=element;
        }
        for (double element : arr2) {
            newArr[i++]=element;
        }

        return newArr;
    }
    
    //3. create a method that can merge two char arrays.
    public static char[] mergeTwoArray(char[] arr1, char[] arr2){

        char[] newArr=new char[arr1.length+ arr2.length];

        int i=0;
        for (char element : arr1) {
            newArr[i++]=element;
        }
        for (char element : arr2) {
            newArr[i++]=element;
        }

        return newArr;
    }
    
    //4. create a method that can merge two String arrays.
    public static String[] mergeTwoArray(String[] arr1, String[] arr2){

        String[] newArr=new String[arr1.length+ arr2.length];

        int i=0;
        for (String element : arr1) {
            newArr[i++]=element;
        }
        for (String element : arr2) {
            newArr[i++]=element;
        }

        return newArr;
    }
    
}
/*
Task1:
	1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.

 */