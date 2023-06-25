package day19_LoopPRactices;

import java.util.Scanner;

public class Question4_Frequency {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.next();
        String result = "";


        for (int i = 0; i <= word.length()-1 ; i++) {
            char ch = word.charAt(i);
            int count = 0;

            for (int j = 0; j <= word.length()-1 ; j++) {
                char eachCharacter =  word.charAt(j);
                if(ch==eachCharacter){
                    count++;
                }
            }
       if(count ==1){
           System.out.println("index of first unique character:"+word.indexOf(ch));
       break;
       }
        }





    }



}
/*
4. Write a program that can return the index number of the first unique character.
 */