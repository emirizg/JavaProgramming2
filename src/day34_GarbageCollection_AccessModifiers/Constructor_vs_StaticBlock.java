package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {


    /*
    - Constructor vs Static Block
        * Constructor it always depends on the object, without the object it can never be executed
        * Static variables it means all the object they have same/common value,
                so in order to initialize them one time will be enough
        * Do not use the main method to set statics,
            because main method it's not going to run by itself outside the classes
        * But static block it can be run, do not use other than static block anything to set statics
     */

    static {
        System.out.println("Static Block");
    }

    public Constructor_vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new Constructor_vs_StaticBlock(); //1
        new Constructor_vs_StaticBlock(); //2
        new Constructor_vs_StaticBlock(); //3
        new Constructor_vs_StaticBlock(); //4
        new Constructor_vs_StaticBlock(); //5
        System.out.println("Main method");
    }

}
