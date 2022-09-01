package day24_CustomMethod_Return.classTasks;

public class MinNum {

    public static void main(String[] args) {
        int b=minNumArr(new int[]{2332,303,754,34,22,295,2572});

        System.out.println(b);
    }

    public static int minNumArr(int[] arr){

        int min=arr[0];

        for (int i : arr) {

            if (i<min){
                min=i;
            }

        }

        return min;
    }

}
/*
3. create a method that can return the minimum number from an array of integers
 */