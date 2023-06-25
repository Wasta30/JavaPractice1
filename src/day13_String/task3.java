package day13_String;

import java.util.Scanner;

public class task3 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three words");
        Scanner input = new Scanner(System.in);
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();
        String result = "";
        if (word1.length() == word2.length() && word2.length() == word3.length()) {
            result = "All words are same length";

        } else if (word1.length() == word2.length() || word1.length() == word3.length() || word2.length() == word3.length()) {
            result = "Not Same nor Different lengths";
        } else {
            result = "All different length";
        }

        System.out.println("result = " + result);
scan.close();
    }


}



/*
7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */