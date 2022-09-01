package day20_Arrays.classNotesTasks;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int[] numbers=new int[100];

        for (int i = 0,j=100; i < numbers.length; i++,j--) {

            numbers[i]=j;

        }

        System.out.println(Arrays.toString(numbers));

    }

}
// 2. create an array that has the numbers 100 to 1