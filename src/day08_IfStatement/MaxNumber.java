package day08_IfStatement;

public class MaxNumber {

    public static void main(String[] args) {

        int a=908;
        int b=247;

        boolean isAGreatter= a>b;
        boolean isBGreatter= b>a;
        boolean isEqual= a==b;

       // 1st solution method
        if (isAGreatter){
            System.out.println(a+" is maximum number");
        }
        if (isBGreatter){
            System.out.println(b+" is maximum number");
        }
        if (isEqual){
            System.out.println(a+" and "+b+" are equal");
        }

        // 2nd solution method
        if (a>b){
            System.out.println(a+" is maximum number");
        }
        if (b>a){
            System.out.println(b+" is maximum number");
        }
        if (a==b){
            System.out.println(a+" and "+b+" are equal");
        }

    }

}
/*
3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number
 */