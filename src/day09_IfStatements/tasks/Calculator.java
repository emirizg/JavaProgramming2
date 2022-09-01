package day09_IfStatements.tasks;

public class Calculator {

    public static void main(String[] args) {

        double n1=10,n2=20,x;
        char mathOperator='-';

        boolean addition = mathOperator=='+';
        boolean subtraction = mathOperator=='-';
        boolean multiplication = mathOperator=='*';
        boolean division = mathOperator =='/';

        if (addition){
            x=n1+n2;
        } else if (subtraction) {
            x=n1-n2;
        } else if (multiplication) {
            x=n1*n2;
        }else {
            x=n1/n2;
        }
        System.out.println("n1 = "+n1+", n2 = "+n2+", mathOperator = '"+mathOperator+"'");
        System.out.println(x);

    }

}
/*
2. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator,
write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30
 */
