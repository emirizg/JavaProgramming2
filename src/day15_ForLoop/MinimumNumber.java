package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int minNum=2147483647; // any user entered number will be smaller than 2147483648
        // in order to find minimum number you should always assign the greatest number to variable max

        for (int i =10;i<15;i++){

            System.out.println("Enter an integer: ");
            int num=scan.nextInt();

            if (num<minNum){ // if the user entered number is smaller than current minimum number
                minNum=num;
            }

        }

        System.out.println(minNum);

    }

}
