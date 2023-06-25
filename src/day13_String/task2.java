package day13_String;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 letter word");
        String word = input.next();
        String result = "";


        if (word.length() < 3) {
            result = "Short word";
        } else if (word.length() > 3) {
            result = " Long word";
        } else if (word.charAt(word.length() - 2) == 'a') {
            result = "Cool word";
        } else {
            result = "Okay word";

        }
input.close();

        System.out.println("result = " + result);


    }
}
/*
6. write a program that asks the user enter a three letter word. Check if the middle character of the given word is 'a'. In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
 */
