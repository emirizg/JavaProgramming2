package day09_IfStatements.tasks;

public class NameOfMonth {

    public static void main(String[] args) {

        byte month=12;
        String monthName;

        if (month==1){
            monthName="January";
        }else if(month==2){
            monthName="Febuary";
        }else if(month==3){
            monthName="March";
        } else if (month == 4) {
            monthName="April";
        } else if (month == 5) {
            monthName="May";
        }else if (month==6){
            monthName="June";
        } else if (month == 7) {
            monthName="July";
        } else if (month == 8) {
            monthName="August";
        } else if (month == 9) {
            monthName="September";
        } else if (month == 10) {
            monthName="October";
        } else if (month == 11) {
            monthName="November";
        }else {
            monthName="December";
        }
        System.out.println("It's "+monthName+"!!!");

    }

}
/*
	2. name of the month (use one print statement)

 */