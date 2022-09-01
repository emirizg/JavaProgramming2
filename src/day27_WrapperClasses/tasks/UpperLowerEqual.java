package day27_WrapperClasses.tasks;

public class UpperLowerEqual {

    public static void main(String[] args) {

        int upperCount=0;
        int lowerCount=0;

        String str="JAVA java";

        for (int i = 0; i < str.length(); i++) {

            char each=str.charAt(i);

            if (Character.isUpperCase(each)){
                upperCount++;
            }

            if (Character.isLowerCase(each)) {
                lowerCount++;
            }

        }

        boolean result= upperCount == lowerCount;

        System.out.println(result);

    }

}
/*
4. Write program that returns true if the total number of upper case characters are equal to total number
 of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */