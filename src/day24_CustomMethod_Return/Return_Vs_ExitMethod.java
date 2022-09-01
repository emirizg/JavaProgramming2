package day24_CustomMethod_Return;

public class Return_Vs_ExitMethod {

    public static void main(String[] args) {

        nameOfMonth(50);

        System.out.println("Hello world");

    }

    public static void nameOfMonth(int number){

        if (number<1 || number>12){
            System.err.println("Invalid");
          //  return; // exits nameOfMonth() method, remaining code fragments of the method never gets executed
            System.exit(0);
        }

        String name= (number== 1)?"January" : (number==2)?"February" : (number==3)?"March": (number==4)?"April"
                : (number==5)?"May": (number==6)?"June": (number==7)?"July": (number==8)?"August"
                : (number==9)?"September": (number==10)?"October": (number==11)?"November" : "December";



        System.out.println("Month name = " + name);
    }


}
