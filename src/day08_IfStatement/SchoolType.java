package day08_IfStatement;

public class SchoolType {

    public static void main(String[] args){

        byte num=8; //1 ~ 18

        boolean isElementary= num >=1 &&  num <=5;
        boolean isMiddle= num <=8 &&  !isElementary;
        boolean isHigh= num <=12 && !isElementary && !isMiddle;
        boolean isCollege= num >=13 &&  num <=16;
        boolean isGrad= num >=17 &&  num <=18;

        if (isElementary){
            System.out.println("Elementary School");
        }
        if (isMiddle){
            System.out.println("Middle School");
        }
        if (isHigh){
            System.out.println("High School");
        }
        if (isCollege){
            System.out.println("College");
        }
        if (isGrad){
            System.out.println("Grad School");
        }

    }

}
/*
2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
 */