package day14_String2;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 =scan.next();

        System.out.println("enter the next word");
        String word2 = scan.next();
        System.out.println("Enter word 3");
        String word3 = scan.next();

        word1 = word1.substring(1);
        word2 = word2.substring(1);

       word3=  word3.substring(0,word3.length()-1);
       // length()-1 = lastchar= indexnumber
        
        // total = length()

        System.out.println("word1 = " + word1);
        System.out.println("word2 = " + word2);

        System.out.println("word3 = " + word3);
scan.close();


    }
}
/*
  1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */