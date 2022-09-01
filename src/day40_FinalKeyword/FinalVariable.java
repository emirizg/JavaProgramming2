package day40_FinalKeyword;

public class FinalVariable {

    final String birtday;
    final static String name;

    static {
        name = "Batch 25";
    }

    public FinalVariable(String birtday) {
        this.birtday = birtday;
    }

    public static void main(String[] args) {

        final double pi = 3.14;

        //pi=4.14;   final variable can ot be reassigned
        //pi=5.4;

        final String name;
        name = "Java";
        //  name = "Wooden Spoon";

        System.out.println(name);

        System.out.println("----------------------------");

        FinalVariable obj = new FinalVariable("may/01");
        // obj.birtday = "June/2"; // final variables  can not be reassigned
        System.out.println(obj.birtday);

        System.out.println("----------------------------");

        //FinalVariable.name = "Phyton";

        System.out.println(FinalVariable.name);


    }

}
