package day11_Switch_Scanner.tasks;

public class NumberToWord {

    public static void main(String[] args) {

        byte n=0; // 0~9
        String numToWord="";
        boolean isValid= n>=0 && n<=9;

        if (isValid){

            switch(n){

                case 0:
                    numToWord="Zero";
                    break;
                case 1:
                    numToWord="One";
                    break;
                case 2:
                    numToWord="Two";
                    break;
                case 3:
                    numToWord="Three";
                    break;
                case 4:
                    numToWord="Four";
                    break;
                case 5:
                    numToWord="Five";
                    break;
                case 6:
                    numToWord="Six";
                    break;
                case 7:
                    numToWord="Seven";
                    break;
                case 8:
                    numToWord="Eight";
                    break;
                default:
                    numToWord="Nine";

            }

        }else {
            numToWord="Invalid Number";
        }

        System.out.println(numToWord);

    }

}
/*
2. NumberToWord (0~9)
 */
