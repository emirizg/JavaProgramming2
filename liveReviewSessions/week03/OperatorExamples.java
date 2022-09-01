package week03;

public class OperatorExamples {

    public static void main(String[] args) {

        // Assignment Operator

        int x= 10;
        x+=2; // x = x+2 : 12
        System.out.println("x = " + x);

        x-=2;
        System.out.println("x = " + x); // 10

        x*=2;
        System.out.println("x = " + x); // 20

        x/=2;
        System.out.println("x = " + x);//10

        x%=2;
        System.out.println("x = " + x); //0

        // Relational Operators gives us true/false statement

        int num1 = 10;
        int num2 = 5;
        boolean b= num1>num2; // true

        System.out.println("First number is greatee than second number "+b);




    }

}
