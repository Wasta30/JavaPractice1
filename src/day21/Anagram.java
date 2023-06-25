package day21;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {




        String str1 = "acdb";
        String str2 = "dbca";

        // check if str1 and str2 build out of same character (if anagram so trye not so false)


        // create arrraay

        // in string clads u dont havr sort method but i can crrat array from string by calling Tocharaary
// so we convert string to CharArry then sort them
        char [] ch1 =str1.toCharArray();
        char []ch2 = str2.toCharArray();

   //     System.out.println(Arrays.toString(ch1));
     //   System.out.println(Arrays.toString(ch2));
        System.out.println();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));



        boolean isAnagram = Arrays.equals(ch1,ch2);
        System.out.println(isAnagram);

    }





}
