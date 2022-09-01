package day24_CustomMethod_Return.classTasks;

public class MaxNum {

    public static void main(String[] args) {

        int a=maxNumArr(new int[]{1,3,43,299,5,26,3});

        System.out.println(a);

    }

    public static int maxNumArr(int[] arr){

        int max=arr[0];

        for (int i : arr) {

            if (i>max){
                max=i;
            }

        }

        return max;
    }
}
/*
2. create a method that can return the maximum number from an array of integers
 */