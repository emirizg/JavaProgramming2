package week16;

/*
 class A{

     static class B{

     }

}

 */

class C{

    public C(){
        System.out.println("#1 Super class constructor #1");
    }

    public C(int a){
        this();
        System.out.println("#2 Super class constructor #2");
    }

}

public class test extends C{


    public test(){
        super(5);
        System.out.println("Child class constructor");
    }

    public static void main(String[] args) {

        test s = new test();

    }

}
