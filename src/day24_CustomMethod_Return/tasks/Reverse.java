package day24_CustomMethod_Return.tasks;

public class Reverse {

    public static void main(String[] args) {

        String str="Java";

        String r=reverse(str);

        System.out.println(r);
    }

    public static String reverse(String str){

        String reversed="";

        for (int i = str.length()-1; i >= 0 ; i--) {

            char ch=str.charAt(i);

            reversed+=ch;

        }

        return reversed;
    }

}
/*
3. create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ


 */