package day32_Constructor.day36_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 3, 2, 1, 1, 35));

        // 1st solution
        Integer a = 35;
        list.remove(a);

        // 2nd solution
        list.remove(Integer.valueOf(35));

        //3td solution
        list.removeAll(Arrays.asList(35));

        System.out.println(list);

    }

}
