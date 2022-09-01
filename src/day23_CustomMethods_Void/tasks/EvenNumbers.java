package day23_CustomMethods_Void.tasks;

public class EvenNumbers {

    public static void main(String[] args) {

        evenNum();

    }

    public static void evenNum(){

        for (int i = 0; i <= 100; i+=2) {
            System.out.print(i+" ");
        }

    }

}
/*
2. create a method that can print even numbers between 1~100 in a same line saperated by space
 */