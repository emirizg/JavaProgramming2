package day21_ForEachLoop.tasks;

public class EvenOddNumbers {

    public static void main(String[] args) {

        int[] arr1={5,5,9,4,4,2,3};

        int evenCount=0;
        int oddCount=0;

        for (int i : arr1) {

            if (i%2==0){
                evenCount++;
            }else {
                oddCount++;
            }

        }

        System.out.println("evenCount = " + evenCount);
        System.out.println("oddCount = " + oddCount);
    }

}
/*
2. Write a program that can count the even(cift) and odd(tek) number from an array of integers

			Note: MUST use for each loop
 */