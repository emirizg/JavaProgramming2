package week02;

public class PrimitiveExamples {

    public static void main(String[] args){

        /* Variables : Primitivie Types:  Numbers || Characters || Boolean
        Numbers: Integers---> byte < short < int < long
                 Decimals(floating points)   ---->  float < double
        Characters: char data type
                    its not primitive however String : collection of chars
        Boolean: true / false (1000100111)
         */

        // DataType
        /*
        DataType variableName = Value ; --> 1.Declare and 2.Initialize at the same line

        DataType variableName; --> 1.Declare
        variableName= Value;   --> 2.Initialize

        DataType variableName1, variableName2;
         */

        byte num1; // Declare a variable
        num1 = 123; // Initiliaze, assign a value

        num1= 121; // re-assign a different value

        short num2= 12398; // Declare and Initiliaze

        int distance=1_000_000_000;
        System.out.println("distance = " + distance);

        long distanceMore=3_000_000_000L; // passing the limit so I have to put L
        long distanceShorter=1_000_000_000; // inside the limit

        float rate=1000.5F;
        double dNumber=123.4;


        System.out.println("-----After Castings-----");
        // i will assign num1 (byte) to num2 (short) --> from smaller dataType to bigger dataType
        num2 =num1; // there is implicit casting: done by compiler
        System.out.println("num2 = " + num2);

        // I will assign distance variable value to num2 variable ---> from bigger dataType to a smaller datatype
        num2=(short)distance; // explicit casting ---> done by developer/tester

        System.out.println("num2 = " + num2);

        char ch='a';
        System.out.println("ch = " + ch);

        int x=5+ch; // 97 = 'a'  ascii table
        System.out.println("x = " + x);

        String str =""+'J'+'a'+'v'+'a'; // empty ""; makes all the chars coming after to turn into Strings
        System.out.println("str = " + str); // Java
        /*
        Note: Important rule of Java --> java runs from left to right : String+char= String
        "C" ---> String
        'C' ---> char
         */

        int y='J'+'a'+'v'+'a';
        System.out.println("y = " + y);  // 386

        boolean b1=true;  // you can assign conditions to these variables
        boolean b2=false;
        System.out.println("b2 = " + b2);
        /*
        x=5;
        y=2;
        x > y --> true result
         */

        /*
        Naming Rules --- Examples for valid (V) and Invalid (I) Examples:
        _average : V --> we can use _ and $ underScore at the begining of variableName
        EU9 : V --- we can use numbers if they are not first characters
        ABC : V
        println : V not a reserved word
        for : I reserved word for Java
        "hello" : I starts with "
        sum_of_data : V
        first-name : I we can not use - dash
        42isTheSolution : I --- can not

        variable name: starts with lowercase, and if you have more word, then we use camelcase
        sumOfData (naming convention)
         */

    }

}
