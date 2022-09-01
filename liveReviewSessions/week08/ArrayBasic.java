package week08;

public class ArrayBasic {

    public static void main(String[] args) {

        int code=200;
        /*
        When you have more than one data
        Data Structures is Java
        Arrays: size is fixed, not re-sizeable, hold same type of Data, primitives and objects
        ArryList, List, Collections, Set, Map,.... --> Object Type
         */

        int[] codes=new int[8]; // my array holds 8 elements, they are all integer type

        codes[0]=200; // first element
        codes[2]=204; // third element
        codes[codes.length-1]=500; // last element

        for (int i = 0; i < codes.length; i++) {

            System.out.println("codes["+i+"] = "+codes[i]);

        }

    }

}
