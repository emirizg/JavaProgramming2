package day09_IfStatements.tasks;

public class MinNum {

    public static void main(String[] args) {

        int num1=392, num2=87;

        boolean num1IsMin= num1 < num2;

        if (num1IsMin){
            System.out.println(num1+" is the minimum number.");
        }else{
            System.out.println(num2+ " is the minimum number");
        }

    }

}
// 		2. Minimum number between two different numbers