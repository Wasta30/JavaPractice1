package day15_For_Loops;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        System.out.println("Enter the word");
        String word = new Scanner(System.in).next();
        String str = word.replace("x","a").replace("X","a");
// using replace method back to back because they both return me string so its important what the method will return
        System.out.println(str);








    }




}
/*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea

 */