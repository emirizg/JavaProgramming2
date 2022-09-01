package day37_Inheritance.day43_Abstraction;

import java.util.Scanner;

public class Throw_vs_Throws {

    public static void main(String[] args) {

        System.out.println("Enter your score:");
        int score = new Scanner(System.in).nextInt();

        //THROW
        if (score < 0 || score > 100){
            throw new RuntimeException("Invalid exception: "+score);
        }

        if (score>=90){
            System.out.println("A");
        }else if (score >= 80) {
            System.out.println("B");
        }else if (score >= 70) {
            System.out.println("C");
        }else if (score >= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }

        //method1();

    }

    //THROWS
    public static void method1() throws InterruptedException{
        //throws keyword it is only for the Checked exceptions
        //it has to be given always within the method signature
        Thread.sleep(5000);
    }



}
