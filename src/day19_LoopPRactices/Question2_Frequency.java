package day19_LoopPRactices;

import java.util.Scanner;

public class Question2_Frequency {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = input.next();


        for (int j = 0; j <= str.length()-1 ; j++) {
            char onecharcter = str.charAt(j);
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                char eachcharacter = str.charAt(i);
                if (onecharcter == eachcharacter) {
                    count++;
                }

            }
            if (count == 2) {
                System.out.println("first duplicated:" + onecharcter + " ");
                System.out.println("Index number:" + str.indexOf(onecharcter));
                break;
            }


        }

input.close();
    }


}
/*
2. Write a program that cna return the index number of the first duplicated character from a string

 */