package day23_CustomMethods_Void;

public class sample1 {

    public static void main(String[] args) {

        System.out.println(reverseString("Emir"));

    }

    public static String reverseString(String reversed){

        String str="";

        for (int i = reversed.length()-1; i >= 0  ; i--) {

            str+=reversed.charAt(i);

        }

        return str;

    }

}
