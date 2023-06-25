package day19_LoopPRactices;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question3_frequency {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.next();
        String result = "";

        for (int i = 0; i <= word.length()-1 ; i++) {
           char ch = word.charAt(i);
            int count =0;
            for (int j = 0; j <= word.length()-1; j++) {
              char eachcharacter=  word.charAt(j);

                if(word.charAt(i)==word.charAt(j)){
                    count++;
                }

            }
      if(count==2 && !result.contains(ch+"")){
          result +=ch;

      }

        }

        System.out.println(result);

    }



}
/*
3. Write a program that can display all the characters that appeared twice in the string

 */