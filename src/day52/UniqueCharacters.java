package day52;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {


        String str = "aabcccdeeeef";

        // string can not be ddireclty converted to collection converted to array

        // u need to find freq of each charcter so use loop
        String [] arr = str.split("");// this arr contains elment and each element is each charxter of string
        // now aslist method to convert it to colelction



        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr),each);
                    if(frequency==1){// if freq is 1 add it into the map

                        result.put(each,1); // result.put(each,frequency);
// becase unnder this cond freq is 1
                    }
        }

        System.out.println(result);

    }




}
/*
armup tasks:
	1. Write a program that can find the unique characters from a String

			Ex:
					str = "aabcccdeeeef";

			output:
					{b=1, d=1, f=1}
 */