package day15_For_Loops;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int result = 1;

        for (int i = num; i > 0; --i) {
            result = result * i;
input.close();


        }
        System.out.println(result);
    }
    }
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */