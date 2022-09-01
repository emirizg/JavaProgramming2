package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int maxNum=-2147483648; // any user entered number will be greater than -2147483648
        // in order to find maximum number you should always assign the smallest number to variable max

        for (int i =0;i<5;i++){

            System.out.println("Enter an integer: ");
            int num=scan.nextInt();

            if (num>maxNum){ // if the user entered number is greater than current maximum number
                maxNum=num;
            }

        }

        System.out.println(maxNum);
    }

}
