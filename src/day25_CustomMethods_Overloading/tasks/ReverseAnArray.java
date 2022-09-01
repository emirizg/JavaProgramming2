package day25_CustomMethods_Overloading.tasks;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        int[] arr2=reverse(arr);
        System.out.println(Arrays.toString(arr2));

        System.out.println("------------------------------------");

        double[] db1={11.2,2.2,3.4,4.3,5};
        double[] db2=reverse(db1);
        System.out.println(Arrays.toString(db2));

        System.out.println("------------------------------------");

        char[] ch1={'A','B','C','D'};
        char[] ch2=reverse(ch1);
        System.out.println(Arrays.toString(ch2));

        System.out.println("------------------------------------");

        String[] str1={"Ahmet","Nisa","Cihan","Buse","Mesut"};
        String[] str2=reverse(str1);
        System.out.println(Arrays.toString(str2));

    }

    //1. Create a method that can reverse an integer array
    public static int[] reverse(int[] arr){
        int[] reversed=new int[arr.length];

        for (int i = arr.length-1,j=0; i >= 0; i--,j++) {

            reversed[j]=arr[i];

        }

        return reversed;
    }
    
    //2. Create a method that can reverse a double array
    public static double[] reverse(double[] arr){
        double[] reversed=new double[arr.length];

        for (int i = arr.length-1,j=0; i >= 0; i--,j++) {

            reversed[j]=arr[i];

        }

        return reversed;
    }


    //3. Create a method that can reverse a char array
    public static char[] reverse(char[] arr){
        char[] reversed=new char[arr.length];

        for (int i = arr.length-1,j=0; i >= 0; i--,j++) {

            reversed[j]=arr[i];

        }

        return reversed;
    }


    //4. Create a method that can reverse a String array
    public static String[] reverse(String[] arr){
        String[] reversed=new String[arr.length];

        for (int i = arr.length-1,j=0; i >= 0; i--,j++) {

            reversed[j]=arr[i];

        }

        return reversed;
    }


}
/*
Task 4:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
 */