package day28_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(9,10,8,1,2,2,3,4,4,5,6,7,7));

        System.out.println(list);

        for (int each : list){

            if (list.indexOf(each) != list.lastIndexOf(each)){
                System.out.println(each);
                break;
            }

        }

    }

}
/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */