package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};

        numbers = addElement(numbers,7);
        System.out.println(Arrays.toString(numbers));


        double[] arr2 = {1.5,2.5,3.5,4.5};
        arr2 = addElement(arr2,5.5); // {1.5,2.5,3.5,4.5,5.5}
        System.out.println(Arrays.toString(arr2));


        String[] names={"Ahmet","Oleksandr","Sinem","Cihad"}; //"Layan"

        names = addElement(names,"Layan");
        System.out.println(Arrays.toString(names));

        char[] chars={'A','B','C','D'};
        chars = addElement(chars,'E');
        System.out.println(Arrays.toString(chars));

    }

    //1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int[] addElement(int[] array,int element){

        int[] result=new int[array.length+1];

        int i=0;
        for (int each : array) {
            result[i++]=each;
        }

        result[i]=element;

        return result;
    }

    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] array,double element){

        double[] result=new double[array.length+1];

        int i=0;
        for (double each : array) {
            result[i++]=each;
        }

        result[i]=element; // element need to be assigned to the last index

        return result;
    }

    //3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] array,String element){

        String[] result=new String[array.length+1];

        int i=0;
        for (String each : array) {
            result[i++]=each;
        }

        result[i]=element; // element need to be assigned to the last index

        return result;
    }

    public static char[] addElement(char[] array, char element){

        char[] result=new char[array.length+1];

        int i=0;
        for (char each : array) {
            result[i++]=each;
        }

        result[i]=element; // element need to be assigned to the last index

        return result;
    }



}
