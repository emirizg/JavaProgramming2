package day16_ForLoopStringPractice.tasks;

import java.util.Scanner;

public class PosNeg_2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int posCounter=0,
                negCounter=0,
                zeroCounter=0;

        for (int i=0;i<5;i++){
            System.out.println("Enter a num:");
            int num=scan.nextInt();

            if (num>0){
                posCounter++;
            } else if (num == 0) {
                zeroCounter++;
            }else {
                negCounter++;
            }
        }

        System.out.println(posCounter+" positive and "+negCounter+" negative and "+zeroCounter+" zero");
    }

}
/*
1. Write a program that asks user to enter number for 5 times,
and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */