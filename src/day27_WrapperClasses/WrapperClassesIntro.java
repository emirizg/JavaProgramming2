package day27_WrapperClasses;

public class WrapperClassesIntro {

    /*
    - Class can have methods, primitives cannot
    - Wrapper class it also provides us very useful methods that we can use
    - if you have primitive char,double or int you cannot call the methods,
          because primitives they do not have methods
    - methods needs to be create in the classes
    - Wrapper classes --> they do have methods

    - parse method --> is used for converting the String to primitives (to other data types)
     */

    public static void main(String[] args) {

        int num1=200;

        // Long n1=num1;
        Integer n1=num1; //autoboxing    Integer: it can take any int value

        int num2=n1; //unboxing           it is implicitly done

        System.out.println("--------------------------------------------------------");

        Integer integerValue = 100;
        long longValue=integerValue;

        Byte b1=25;

        byte a1=b1;
        short a2=b1;
        int a3=b1;
        long a4=b1;

        System.out.println("--------------------------------------------------------");

        int num3=200;
       // Long l2=num3;
       // Double d1=num3;
        Integer num4=num3; // autoboxing

        System.out.println("--------------------------------------------------------");

        Integer z= 900;
        Integer y = z;

        System.out.println("--------------------------------------------------------");

        /*
        - Array it can support both of them
        - For other data structure I cannot use primitives only with Array
         */

        int[] numbers1={1,2,3,4,5};
        Integer[] numbers2={1,2,3,4,5};


    }

}












