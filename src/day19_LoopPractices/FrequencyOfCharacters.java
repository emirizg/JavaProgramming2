package day19_LoopPractices;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str="aabcccd";
        String result="";

        for (int j = 0; j < str.length(); j++) { // responsibility of this loop is to get each char of str
            char ch=str.charAt(j);
            int count =0;

            for (int i = 0; i < str.length(); i++) { // to find the frequency of each character
                char each=str.charAt(i); // each characters of str

                if (ch == each){
                    count++;
                }
            }

            if (result.contains(""+ch)){ // contains() --> method is only accepts strings
                continue;
            }

            result+=ch;
            result+=count;

        }

        System.out.println(result);



    }

}
/*
1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */