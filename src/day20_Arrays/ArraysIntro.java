package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // create a variable that's capable enough to contain 5 names
        // 'null' key is the default value of all non-primitives
        // every single data type in java they have a default value
        // byte,short,int,long -> 0
        // float,double -> 0.0
        // boolean -> false
        // minimum index number in java is : 0

        String[] myGroup = new String[5]; // 0 ~ 4

        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";
       // myGroup[5]="Muhtar";

      //  System.out.println( myGroup ); // hashcode --> [Ljava.lang.String;@3f0ee7cb
        System.out.println(Arrays.toString(myGroup)); // ["Gunay","Neira","Suat","Hulya","Mikael"]

        System.out.println("--------------------------------------------------");

        // if you know how many elements and what elements

        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //                0          1          2          3         4         5         6

        System.out.println(Arrays.toString(days));

        int number=5;

        if (number < 1 || number >7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println( days[number-1] );

        System.out.println("--------------------------------------------------");

        String[] months={"January","Feburary","March","April","May","June","July","August","September","October","November","December"};

        System.out.println(Arrays.toString(months));

        number=3;

        if (number < 1 || number >7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println( days[number-1] );

    }

}
