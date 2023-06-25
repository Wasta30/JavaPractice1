package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int [] numbers = new int[10]; // array that contain 10 elements /numbers


        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Enter a number");
        numbers [i]= input.nextInt(); // assign it to element of array
            // each user enter input will be assigned to the indexes of the array numbers
        }

        // we need to find min and max both numbers


        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){// if numb is greaterr than current max num
                max= numbers[i];

                if (numbers[i]<min){
                    min =numbers[i];
                }



            }



        }
        // use array method to see whivch num u are providing
        System.out.println(Arrays.toString(numbers));

// u are printing numbers not array so dont use tostring method
        System.out.println("max = " + max);
        System.out.println("min = " + min);

input.close();
    }




}
/*
3. Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number


 */