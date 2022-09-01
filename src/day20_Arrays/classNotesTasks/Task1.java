package day20_Arrays.classNotesTasks;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        int[] numbers=new int[100];

        for (int i = 0,j=1; i < numbers.length; i++,j++) {

            numbers[i]=j;

        }

        System.out.println(Arrays.toString(numbers));
    }

}
// 1. create an array that has the numbers 1 to 100