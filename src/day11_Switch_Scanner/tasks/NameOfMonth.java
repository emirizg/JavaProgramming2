package day11_Switch_Scanner.tasks;

public class NameOfMonth {

    public static void main(String[] args) {

        byte n=8; // 1~12
        String nameOfMonth="";
        boolean isValid= n>=1 && n<=12;

        if (isValid){

            switch (n){

                case 1:
                    nameOfMonth="January";
                    break;
                case 2:
                    nameOfMonth="Febuary";
                    break;
                case 3:
                    nameOfMonth="May";
                    break;
                case 4:
                    nameOfMonth="April";
                    break;
                case 5:
                    nameOfMonth="May";
                    break;
                case 6:
                    nameOfMonth="June";
                    break;
                case 7:
                    nameOfMonth="July";
                    break;
                case 8:
                    nameOfMonth="August";
                    break;
                case 9:
                    nameOfMonth="September";
                    break;
                case 10:
                    nameOfMonth="October";
                    break;
                case 11:
                    nameOfMonth="November";
                    break;
                default:
                    nameOfMonth="December";

            }

        }else {
            nameOfMonth="Invalid Number";
        }

        System.out.println(nameOfMonth);

    }

}

/*
1. NameOfMonth  (1~12)
 */