package day23_CustomMethods_Void.tasks;

public class Calculator {

    public static void main(String[] args) {

        mathOperation(20,5,'/');

    }

    public static void mathOperation(int num1,int num2, char mathOperator){

        // + - * /

        int result=0;

        if (mathOperator=='+'){
            result=num1+num2;
            System.out.println("result = " + result);
        } else if (mathOperator == '-') {
            result=num1-num2;
            System.out.println("result = " + result);
        } else if (mathOperator == '*') {
            result=num1*num2;
            System.out.println("result = " + result);
        } else if (mathOperator == '/') {
            result=num1/num2;
            System.out.println("result = " + result);
        }else {
            System.out.println("Invalid");
        }

    }

}
/*
	15. create a method named calculator that passes three arguments (num1, num2, mathOperator),
	prints the calculation result

 */
