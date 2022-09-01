package day17_While_DoWhile.tasks;

public class Divide {

    public static void main(String[] args) {

        int a=215;
        int b=7;

        int count=0;

        while(a>=b){
            a-=b;
            count++;
        }

        System.out.println(count+" with the remainder "+a);

    }

}
/*
1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.

  int a=20;
  int b=7;

  int count=0;

  while(a>=b){
      a-=b  // a=13
      a-=b  // a=6
      count++;
  }

  System.out.println(count+" with the remainder "+a);

 */