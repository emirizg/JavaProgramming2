package day08_IfStatement;

public class NameOfTheDay {

    public static void main(String[] args) {

        int day=5;

        boolean monday= day == 1;
        boolean tuesday= day == 2;
        boolean wednesday= day == 3;
        boolean thursday= day == 4;
        boolean friday= day == 5;
        boolean saturday= day == 6;
        boolean sunday= day == 7;

        if (monday){
            System.out.println("It's Monday!!!");
        }
        if (tuesday){
            System.out.println("It's Tuesday!!!");
        }
        if (wednesday){
            System.out.println("It's Wednesday!!!");
        }
        if (thursday){
            System.out.println("It's Thursday!!!");
        }
        if (friday){
            System.out.println("It's Friday!!!");
        }
        if (saturday){
            System.out.println("It's Saturday!!!");
        }
        if (sunday){
            System.out.println("It's Sunday!!!");
        }

    }

}
