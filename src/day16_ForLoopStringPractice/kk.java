package day16_ForLoopStringPractice;

public class kk {

    public static void main(String[] args) {

        String str="aabbaa1cc";

        String result="";

        char ch='f';

        str.indexOf('b'); //2
        str.indexOf("b"); //2
        str.indexOf(result); //0
        str.indexOf(ch); //-1
        str.indexOf("aa"); //0

/*
        str.contains(ch); // Required type: CharSequence
        str.contains(""+ch); // Required type: CharSequence
        str.contains(result); // Required type: CharSequence
        str.contains('a'); // Required type: CharSequence
        str.contains("a"); // Required type: CharSequence
 */
         



    }

}
