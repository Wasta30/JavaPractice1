package day15_For_Loops;


import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {
  //      Scanner scan =  new Scanner(System.in); so dont do this
// if i just need scanner one time i do not need scanner variable in that case i can just call object of scanner
        System.out.println("Enter the word");
        String word = new Scanner(System.in).next();//   xcodex
        // only use itt when getting one input
     // give cond using char.at
if(word.charAt(0)=='x'){
    word = word.replaceFirst("x","a");

    System.out.println(word);
}


    }



}
/*
1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

 */