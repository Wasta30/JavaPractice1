package day13_String;

import java.util.Scanner;

public class task1 {


    public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();

     String firstlastchar =  " "+ sentence.charAt(0) +sentence.charAt(sentence.length()-1);

        System.out.println(firstlastchar);
scan.close();


    }

}
/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */