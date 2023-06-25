package day19_LoopPRactices;

import day04_Variable.SalaryCalculator;

import java.util.Scanner;

public class Question1_Frequency {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.next();
        // word = "abbccdd"
        String result = "";
// outer loop hold one charcater and inner loops check every character
        for (int j = 0; j <= word.length() - 1; j++) { // j = 0
            char ch = word.charAt(j);
            int count = 0;

            for (int i = 0; i <= word.length() - 1; i++) {
                char eachCharacter = word.charAt(i);

            if(ch==eachCharacter){
                count++;
            }
            }
        if(count==2){
            result +=ch;
            break;
        }
        }
        System.out.println(result);
input.close();
    }


}
/*
1. Write a program that can return the first duplicated character from a string //
 */