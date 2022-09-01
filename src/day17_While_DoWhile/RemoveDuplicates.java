package day17_While_DoWhile;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str="AABBCC";

        String result=""; //"ABC";

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if (result.contains(""+ch)){ // if the result already contains the character
                // break; // exit
                continue; // skip
            }
            result+=ch;

        }

        System.out.println(result);

    }

}
