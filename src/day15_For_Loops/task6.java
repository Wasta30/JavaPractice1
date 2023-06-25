package day15_For_Loops;

import java.util.Scanner;

public class task6 {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String str= input.next();
        int sum = 0;
        String result = "";

        for (char i = 0; i <= str.length() - 1; i++) {
           if(str.charAt(i)>'0'&& str.charAt(i)<='9'){

               sum = sum + str.charAt(i)-48;

            }


        }

    }
    }




/*
 6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...
 */