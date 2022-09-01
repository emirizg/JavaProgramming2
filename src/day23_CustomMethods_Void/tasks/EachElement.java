package day23_CustomMethods_Void.tasks;

public class EachElement {
    public static void main(String[] args) {

        printEachElement(new int[]{1,3,4,2,5,6,3});

    }

    public static void printEachElement(int[] arr){

        for (int element:arr){
            System.out.print(element+" ");
        }

    }

}
/*
14. create a method named printEachElement that can print each elements of an integer array
 */