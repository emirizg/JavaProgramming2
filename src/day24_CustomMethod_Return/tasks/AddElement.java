package day24_CustomMethod_Return.tasks;

import java.util.Arrays;

public class AddElement {

    public static void main(String[] args) {

        int[] arr ={1,2,3};
        int num = 4;

        int[] arr2=addElement(arr, num);

        System.out.println(Arrays.toString(arr2));

    }

    public static int[] addElement(int[] arr, int newElement){

        int lastIndex=arr.length;

        int[] array=new int[arr.length+1];

        int i=0;
        for (int element : arr) {

            array[i]=element;
            i++;

        }

        array[lastIndex]=newElement;

        return array;

    }

}
/*
 6. create a method named addElement that takes one integer array and one integer,
 the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}

 */
