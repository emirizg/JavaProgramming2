package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        System.out.println("--------------remove---------------------");

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);
        /*
        int num = 1;
        list.remove(num);
         */

        Integer num=2000;
        //list.remove(num);
        boolean r = list.remove(num);

        System.out.println(list);
        System.out.println(r);

        System.out.println("--------------size---------------------");

        System.out.println(list.size());

        list.clear(); // it removes all the element from arrayList

        System.out.println(list.size());
        System.out.println(list);

        System.out.println("----------indexOf------lastIndexOf-------------------");

        ArrayList<Character> characters=new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');
        int b = characters.lastIndexOf('A');

        System.out.println(a);
        System.out.println(b);

        System.out.println("---------------contains--------------------");

        boolean r2 = characters.contains('A');
        boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("---------------equals--------------------");

        ArrayList<Integer> list1=new ArrayList<>();

        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2=new ArrayList<>();

        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);
        // it will return true if all both arrayList has same elements and same order, otherwise returns false
        System.out.println(list1.equals(list2));

        System.out.println("---------------isEmpty--------------------");

        list1.clear();
        boolean r4= list1.isEmpty(); // false

        System.out.println("r4 = " + r4);

        System.out.println("---------------addAll--------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        // Bulk Operation: CollectionType
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(numbers);


    }

}









