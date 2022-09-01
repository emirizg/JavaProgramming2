package week04;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // We will get two numbers of Double from user and We will get a char (+,-,*,/,%)

        double num1, num2, result=0;
        char operator;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two double type numbers : ");

        num1 = scanner.nextDouble(); // command + D ---> copy paste that line
        num2 = scanner.nextDouble();

        // to autoFormat your code in Intellij we use ---> command+option+L

        System.out.println("Enter arithmetic operation you want (+,-,*,/,%) : ");

        operator = scanner.next().charAt(0); // to get char with scanner we are using String manupilation

        System.out.println("Is first number bigger thsn second number ? ");
        boolean answer= scanner.nextBoolean(); // true / false

        switch (operator){

            case '+':
                result=num1+num2;
                break;
            case '-':   // this condition has a Nested condition inside
                if (answer){
                    result=num1-num2;
                }else {
                    result = num2 - num1;
                }
                break;
            case '/':
                if (answer&& num2!=0){
                result=num1/num2;
            }else {
                    if (num1 != 0) {
                        result = num2 / num1;
                    }else {
                        System.err.println("Unwanted Number");
                    }
            }
            break;
            case '*':
                result=num1*num2;
                break;
            case '%':
                /*
                syntax for ternary operator
                variable = condition ? trueValue : falseValue;
                 */
                result= answer?num1%num2 : num2%num1;
                break;
            default:
                System.err.println("Unrecognized Operation");


        }
        System.out.println(result);



    }

}
