package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        /*
        - Every time when you call the add method it's increase the size by one
        - And you can call it as many as time you want, it will increase all the time
         */

        System.out.println("----------------add-----------------------");

        ArrayList<Integer> numbers = new ArrayList<>(); // new keyword to create object of the arrayList

        numbers.add(10); //0
        numbers.add(20); //1

        numbers.add(30); //3
        numbers.add(40); //4
        numbers.add(50); //6
        numbers.add(60); //7

        numbers.add(2,25); //2
        numbers.add(5,45); //5

        System.out.println(numbers); //[10, 20, 25, 30, 40, 45, 50, 60]

        System.out.println("--------------size-------------------------");

        // size() --> it will return you total number of the element in the ArrayList
        System.out.println( numbers.size() );

        int lastIndex = numbers.size() - 1;
        System.out.println("lastIndex = " + lastIndex);

        //Integer num = numbers.get(3);
        int num = numbers.get(3); // unboxing
        System.out.println("num = " + num);

        System.out.println("---------------get------------------------");

        for (int i=0; i < numbers.size() ;i++){
            int n=numbers.get(i);
            System.out.println(n);
            //System.out.println( numbers.get(i) ); //2nd solution
        }

        System.out.println("------------set---------------------------");

        ArrayList<String> list=new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2,"JavaScript"); // replace & it does not change the size
        list.set(3,"C++");

        System.out.println(list);

    }

}










