package day09_IfStatements.tasks;

public class NumberToWord {

    public static void main(String[] args) {

        byte number=9;
        String numToWord;

        if (number==1){
            numToWord="One";
        }else if (number==2){
            numToWord="Two";
        }else if (number==3){
            numToWord="Three";
        }else if (number==4){
            numToWord="Four";
        }else if (number==5){
            numToWord="Five";
        }else if (number==6){
            numToWord="Six";
        }else if (number==7){
            numToWord="Seven";
        }else if (number==8){
            numToWord="Eight";
        }else {
            numToWord="Nine";
        }

        System.out.println(numToWord);

    }

}
/*
1. Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

 */