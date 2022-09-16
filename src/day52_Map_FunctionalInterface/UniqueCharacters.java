package day52_Map_FunctionalInterface;

import java.util.*;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        String[] arr = str.split("");

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : arr) {

            int frequency = Collections.frequency(Arrays.asList(arr), each);
            if (frequency == 1){
                map.put(each, frequency);
            }

        }

        System.out.println(map);

    }

}
/*
1. Write a program that can find the unique characters from a String
			Ex:
					str = "aabcccdeeeef";
			output:
					{b=1, d=1, f=1}
 */