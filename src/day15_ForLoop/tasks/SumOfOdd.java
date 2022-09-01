package day15_ForLoop.tasks;

public class SumOfOdd {

    public static void main(String[] args) {

        int sum=0;

        for (int i=1;i<=100;i+=2){
            System.out.print(i+" ");
            sum+=i;
        }

        System.out.println();
        System.out.println("sum = " + sum);

    }

}
// 2. Write a program that can return the sum of odd numbers between 1 to 100