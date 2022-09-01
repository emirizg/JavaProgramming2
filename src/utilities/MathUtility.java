package utilities;

public class MathUtility {
    
    //Create a method that can return the sum of two integers
    public static int sumOfTwoNumbers(int num1, int num2){
        return num1+num2;
    }

    //Create a method that can return the sum of two decimal numbers
    public static double sumOfTwoNumbers(double num1, double num2){
        return num1+num2;
    }

    //Create a method that can return the subtraction of two integers
    public static int subtractionOfTwoNumbers(int num1, int num2){
        return num1-num2;
    }

    //Create a method that can return the subtraction of two decimals
    public static double subtractionOfTwoNumbers(double num1, double num2){
        return num1-num2;
    }

    // Create a method that can return the multiplication of two integers
    public static int multiplicationOfTwoNumber(int num1, int num2){
        return num1*num2;
    }

    // Create a method that can return the multiplication of two decimals
    public static double multiplicationOfTwoNumber(double num1, double num2){
        return num1*num2;
    }

    //Create a method that passes two double parameters and return the division result
    public static double divisionTwoDouble(double num1, double num2){
        return num1/num2;
    }

    //Create a method that can check if an integer is even number
    public static boolean isEven(int num){
        boolean isEven=false;

        if (num%2==0){
            isEven=true;
        }

        return isEven;
    }

    //Create a method that can check if an integer is odd number
    public static boolean isOdd(int num){
        boolean isOdd=false;

        if (num%2!=0){
            isOdd=true;
        }

        return isOdd;
    }

    //Create a method that can return the maximum number between two integers
    public static int maxNum(int num1, int num2){
        int max=num1;

        if (num2>num1){
            max=num2;
        }

        return max;
    }

    //Create a method that can return the maximum number between two decimal numbers
    public static double maxNum(double num1, double num2){
        double max=num1;

        if (num2>num1){
            max=num2;
        }

        return max;
    }

    //Create a method that can return the minimum number between two integers
    public static int minNum(int num1, int num2){
        int min=num1;

        if (num2<num1){
            min=num2;
        }

        return min;
    }

    //Create a method that can return the minimum number between two decimal numbers
    public static double minNum(double num1, double num2){
        double min=num1;

        if (num2<num1){
            min=num2;
        }

        return min;
    }

    //Create a method that can return the square of an integer --->  Ex: square(2) ==> 4
    public static int square(int num){
        return num*num;
    }

    //Create a method that can return the square of a double
    public static double square(double num){
        return num*num;
    }

    //Create a method that can return the cube of an integer
    public static int cube(int num){
        return num*num*num;
    }

    //Create a method that can return the cube of a double
    public static double cube(double num){
        return num*num*num;
    }


}