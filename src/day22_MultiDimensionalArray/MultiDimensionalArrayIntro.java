package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {
        String[] group1={"Jon","Joes","james"};
        String[] group2={"Aaron","Shay","Breann"};
        String[] group3={"Cassandra","Tahir","Aygun"};

        String[][] groups=new String[3][]; // index: 0,1,2
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        System.out.println(Arrays.toString(groups)); // toString --> is for one dimensional arrays only
        System.out.println(Arrays.deepToString(groups));

        System.out.println("-------------------------------------------");
        /*
        {1,2,3}
        {4,5,6,7}
        {8,9,10,11,12}
         */

        int[][] arr2D={ {1,2,3},{4,5,6,7},{8,9,10,11,12} }; // each of them is a single dimensional arrays
        //    index:       0        1            2          // each of single dimensional array they have their own index number

        System.out.println(Arrays.deepToString(arr2D));

        // {4,5,6,7}

        System.out.println(Arrays.toString(arr2D[1]));

        // 11

        System.out.println(arr2D[2][3]); // first you need to get single dimensional array index then element index


    }

}
/*
String[] group1={"Jon","Joes","james"};
String[] group2={"Jon","Joes","james"};
String[] group3={"Jon","Joes","james"};

 */