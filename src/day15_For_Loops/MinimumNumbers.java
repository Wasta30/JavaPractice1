package day15_For_Loops;

import java.util.Scanner;

public class MinimumNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647; // any number user enter will less than this number

        for (int i = 10; i < 15 ; i++) {
            System.out.println("Enter the number:");
            int num = scan.nextInt();
            if(num < min){
                min = num;
            }
        }

        System.out.println("min = " + min);



    }


}
/*
write a program that ask the user to enter a number for 5 times.
return the minimum number
 */