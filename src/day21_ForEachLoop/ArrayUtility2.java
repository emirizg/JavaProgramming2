package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility2 {

    public static void main(String[] args) {

        System.out.println("---------------------copyOf(array,newLength)----------------------------");

        // copyOf(array,newLength) --> copys the elements of the array, returns new array
        // if you want to copy from beginning till the given index, it is copying starting from first element

        String[] students={"Elif","Sinem","Gunay","Chiad","David","James","Aaron","Daniel"};

        String[] earlyBirds= Arrays.copyOf(students,5);

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        numbers=Arrays.copyOf(numbers,5);

        System.out.println(Arrays.toString(numbers));

        System.out.println("----------------------copyOfRange(array, beginningIndex,endingIndex)---------------------------");

        // copyOfRange(array, beginningIndex,endingIndex) --> copys the elements of the array, starting from beginning index
        // till the ending index (ending index excluded), returns new array

        char[] ch1={'A','B','C','D','E','F','G','H','I'};

        char[] ch2=Arrays.copyOfRange(ch1,2,6+1); //index(like substring,last element(ending index) excluded)

        System.out.println(Arrays.toString(ch2));

        int[] scores={10,20,30,40,50,60,70,80,90,100};

        int[] result=Arrays.copyOfRange(scores,3,7+1);

        System.out.println(Arrays.toString(result));

        int[] result2=Arrays.copyOfRange(scores,5,scores.length);

        System.out.println(Arrays.toString(result2));

    }

}
