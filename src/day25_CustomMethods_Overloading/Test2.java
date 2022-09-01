package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("---------------------------------");

        double[] arr2={1.5, 2.5, 3.5, 4.5};

        ArraysUtility.printEachElement(arr2);

        System.out.println("---------------------------------");

        char[] arr3={'A','B','C','D'};

        ArraysUtility.printEachElement(arr3);

        System.out.println("---------------------------------");

        String[] names={"David","Elvira","Ali","Igor"};

        ArraysUtility.printEachElement(names);

        System.out.println("---------------------------------");

        int[] n1={10,2,33,42,53,6};

        int max1= ArraysUtility.max(n1);

        System.out.println("max1 = " + max1);

        System.out.println("---------------------------------");

        double[] n2={12.5,2.5,3.52,42.5,5.15,6.15};

        double max2= ArraysUtility.max(n2);

        System.out.println("max2 = " + max2);

        System.out.println("---------------------------------");

        int[] n3={10,2,33,42,53,6};

        int min1= ArraysUtility.min(n3);

        System.out.println("min1 = " + min1);

        System.out.println("---------------------------------");

        double[] n4={12.5,2.5,3.52,42.5,5.15,6.15};

        double min2= ArraysUtility.min(n4);

        System.out.println("min2 = " + min2);

        System.out.println("---------------------------------");

        int[] a1={1,2,3,4,5,6,7};

        boolean r1 = ArraysUtility.isContains(a1,10);

        System.out.println("r1 = " + r1);

    }

}
