package day34_GarbageCollection_AccessModifiers;

public class Intro {
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

    /*
    static Blocks:
        - It's a very special one
        - before JAVA 8 you can use it to run the class
        - after JAVA 8 you need a main method to run
        - it's first to get executed
        - it only runs one time
        - in order to make class runnable i need a main method
        - in java first to get executed is static block

     */

    /*
    - if it any static variable it takes more than one step to set it you can never use assign operator
    - You can always use the static block to set any static variables
    - Static accepts statics
    - Main method is static, and main method it only runs within the class, it can not run
    - Outside the class you can never execute automatically main method in the other class,
                to set static variables you should not use main method
    - The block that can executed outside the class by itself is the static block
    - the static method it can automatically can be executed by itself whenever class loaded
    - You don't need to call static blocks, it runs automatically
    - so to set static variables we use static block
    - in java   Constructor: to set all the instances
                Static block: to set all the statics

     */

    /*
    - Constructor vs Static Block
        * Constructor it always depends on the object, without the object it can never be executed
        * Static variables it means all the object they have same/common value,
                so in order to initialize them one time will be enough
        * Do not use the main method to set statics,
            because main method it's not going to run by itself outside the classes
        * But static block it can be run, do not use other than static block anything to set statics
     */

    /*
    regular import:
    - it imports everything
        - syntax: --->  import package.className;
        - syntax: --->  import package.*;   --> all the classes
    - regular import it's going to import from the class
    - if the classes are in the same package you dont need to import, it's done implicitly
    -

    static import:
    - it imports just the static members
        - syntax: ---> import static packageName.className.staticMember; --> it just imports one static member of class
        - syntax: ---> import static packageName.className.*; --> imports all static members of a class

    - there is no shortcut to import

     */

    /*
    - Garbage Collection means --> Collection of unreferenced objects == garbage objects
    - It is only for non-primitives
    1. using 'null' keyword
        String str = "Java";
        str = null;

    2. crating new object
        String str = "Python";
        str = "Java";
    - Garbage Collector: responsible for collecting the unreferenced objects from java heap and destroys it
        finalize().
    - null keyword it can only be assigned to non-primitives
    - null is default value for every non-primitive data type
    - the fastest way to make an object eligible for garbage collection
     */

    /*
    Access Modifiers:
                            default, public, private, protected
    - They define the accessibility
    - Class can have public or default access modifiers
    - Variables, Constructors and methods can have all of them

    Private:
        - Only reachable within same class
    Default:
        - you don't have a keyword
        - They can be visible and reachable within class and package
        - Only reachable within same package

    Protected:
        - They can be visible and reachable within class and package and Subclass

    Public:
        - They can be visible and reachable always


     */

}
