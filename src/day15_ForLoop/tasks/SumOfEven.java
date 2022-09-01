package day15_ForLoop.tasks;

public class SumOfEven {

    public static void main(String[] args) {

        int sum=0;

        for (int i=0;i<=100;i+=2){
            System.out.print(i+" ");
            sum+=i;
        }

        System.out.println();
        System.out.println("sum = " + sum);

    }

}
/*
1. Write a program that can return the sum of even numbers between 1 to 100
 */