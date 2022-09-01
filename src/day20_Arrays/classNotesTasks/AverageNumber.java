package day20_Arrays.classNotesTasks;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int num=input.nextInt();

        int[] scores=new int[num];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter a score:");
            int s=input.nextInt();

            scores[i]=s;
        }

        double sum=0;

        for (int i = 0; i < scores.length; i++) {

            sum+=scores[i];

        }

        double average=sum/num;

        System.out.println("average = " + average);

    }

}
/*
4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
 */