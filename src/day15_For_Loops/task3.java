package day15_For_Loops;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {

            sum += i;// sum = sum+i;
        }
        System.out.println(sum);
input.close();
    }


}
/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */