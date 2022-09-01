package week06;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str="javaverygoodandsoon";

        String result=""; // not duplicate strings

        // iterate through the string for each Char element

        for (int i=0; i<str.length();i++){
            if (!(result.contains(""+str.charAt(i)))){
                result+=str.charAt(i);
            }
        }

        System.out.println(result);
    }

}
