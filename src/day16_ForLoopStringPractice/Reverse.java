package day16_ForLoopStringPractice;

public class Reverse {

    public static void main(String[] args) {

        String str="Wooden Spoon"; // reverse means getting each of them starting from the last, from end to beginning

        String result=""; // contain the reserved version of str

        for (int i=str.length()-1; i>=0; i--){ //i: index numbers of str(starting last index to index 0)

            result+=str.charAt(i); // adding each character to result

        }


        System.out.println(result);

    }

}
/*

	1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */