package day09_IfStatements.tasks;

public class MaxNum {

    public static void main(String[] args) {

        int num1=44
                , num2= 95;

        boolean num1IsMax=num1>num2;
        boolean num2IsMax=num2>num1;

        if (num1IsMax){
            System.out.println(num1+" is the maximum number");
        }else {
            System.out.println(num2+" is the maximum number");
        }

    }

}
// 		1. Maximum number between two different numbers