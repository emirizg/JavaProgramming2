package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old

        byte age = 38;

        // weight: 160 pounds

        // byte weight = 160;  160 is out byte's range
        // byte num = -129;   -129 is out byte's range

        short weight=160; // 160 is within the range of short

        //salary= 100000$
        // short salary=100000; // 100000 is out of short' range
        int salary=100_000;      // int is the preferred data type for integer numbers

        long asset = 3_333_333_333L;


        // tax: 0.26
        float tax=0.26F;

        double PI= 3.14;


        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2=35;
        System.out.println("ch2 = " + ch2);

        char ch3=35000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';

        char grade = 'F';

        char yesNo = 'Y';

        //char ch5 = 'AB';

        boolean isemployeed = true;
        boolean isMarried = false;

        boolean result = 100>300;

        System.out.println("isemployeed = " + isemployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String employeeName = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";

        //String employeeName="John";

        System.out.println("employeeName = " + employeeName);
        System.out.println("city = " + city);

        String first_employeeName$ = "Muhar";
        int num1=100;
        int num2=200;

        // int private=300;

        double salaryAfterTax=2.5;
       // int salaryAfterTax=5274.0994;

    }

}

/*
Primitive Data Types:

		numerical primitives:
					double > float > long > int > short > byte
primitives:
	int: for integers
	double: for decimals
	char: for single characters, ''
	boolean: true/false
	String: sequence of characters (String of text), ""

variable naming rules:
		1. MUST be unique
		2. camelCase
		3. Can Not start with digits
		4. starts with lower case letters
		5. Can Not be Java Reserved words
		6. Can Not have special characters other than _ and $
		7. readable, understandable
 */
