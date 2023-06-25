package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfMethod {

    public static void main(String[] args) {


        String str = "bbcccaaaaa";
        //           bca
        //           235
        //Collections.frequency()

        String[] arr = str.split("");// convert string to array as an indivual element

        Map<String, Integer> result = new LinkedHashMap<>(); // {b=2, c=3, a=5}

        for (String each : arr) { // each: characters of string, add it into a map by key
            int frequency = Collections.frequency( Arrays.asList(arr), each);// this returns how many times each occur as an integer , u can say its a value
   // this freq method is how many times each charcter is occur which is coming from an arr which was previosuly a string but we convert it into collection
            // telling howmany time each character occurs in string
      result.put(each,frequency);
        }

        System.out.println(result);

    }

}

/*
2. Write a program that can return the frequency of characters
        Not: MUST use map
        Ex: str = "bbcccaaaaa"
        output:
            {b=2, c=3, a=5}
 */

// remember to practice




