package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

    public static void main(String[] args) {


        // ask user how many num user wants to enter , cant be 0 or negative
        // than contain array that can contain all the numbers that user enters


        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter");
        int length =input.nextInt();
        if(length<=0){// if length invalid terminate jvm
            System.err.println("Invalid entry");
            System.exit(0);
        }
        // if user say 10 store it and make array
        // so bascially user will tell the length of array
        // also the ;ength shouldnt be negative and 0


        int[] numbers = new int[length]; // we put the length the user enter here in array
        // whatever user provide thats needs to be the lengthn of array

        // need a loop
        // < length means till last index

        for (int i = 0; i <= length-1 ; i++) {// index start from 0 and less than length
            System.out.println("Enter the number");
            numbers[i]=input.nextInt();// each input user provide dueing execution of loop assign it to array
        }// to each index of array we assign user enter number


        System.out.println(Arrays.toString(numbers));

input.close();

    }



}
