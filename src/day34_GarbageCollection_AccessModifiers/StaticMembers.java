package day34_GarbageCollection_AccessModifiers;

// outer class
public class StaticMembers {
int a;
    //inner class
    static class class1 {

    }

    /*
    - pre-condition to be a static class there has to be a nested class
    - class can contain classes
    - there is no way that an outer class can be static
    - static it has to belong to a class
    - only if there is a nested class and if the inner class contains the static keyword, otherwise no
    - When to use? --> you'll not use, it's good to know
    - classes they do not have a memory
    - only the inner class can be static

    - When should I use static VARIABLE?
        + If there is a common value for all the objects
    - When should I use static METHOD?
        + If the method is instance you have to create an object, if the method is static it's not necessary
    - When should I use static BLOCK?
        + When we need to initialize the static variables
        + it's not a must
        + gets executed as son as the class is loaded
        + runs first before everything, only runs one time
        + if the static variables need several steps to be initialized


     */

    public static int num = 100;

    public static void method() {

    }

    static {

    }

}

//outer class
class A {

    //inner class
    static class B {

        public static void method1() {

        }

    }

}

class C {

    public static void main(String[] args) {
        A.B.method1();
    }
}



          // ------------------------------------------------------ \\

class X{

}

class Y{


}

class Z{
    static class Q{

    }
}











