package day23_CustomMethods_Void.tasks;

public class OddNumbers {

    public static void main(String[] args) {

        oddNum();

    }

    public static void oddNum(){

        for (int i = 1; i <= 100; i+=2) {
            System.out.print(i+" ");
        }

    }

}
/*
1. create a method that can print odd numbers between 1~100 in a same line separated by space
 */