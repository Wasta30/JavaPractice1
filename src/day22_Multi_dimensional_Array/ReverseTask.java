package day22_Multi_dimensional_Array;

import java.util.Arrays;

public class ReverseTask {


    public static void main(String[] args) {


        String sentence = "Today is a good day";// creat splitarray

        String word []= sentence.split(" ");

       String resevervedSentence = "";

       /* reserved[0]=sentence[sentence.length-1];
        */

        for (int i = word.length - 1; i >= 0; i--) {

         resevervedSentence +=word[i]+" ";// i get the reveerse order (index i) and add it to the string
        }

        System.out.println(resevervedSentence); // its a string direclty pass it in print statement

    }




}
/*
1. Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";

			output:
				Java learn to day good a is Today
 */