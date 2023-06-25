package day15_For_Loops;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        // retrun sum of number between 1 to 100
        // need to have a variable ,assign zero first because
        int sum = 0;
        // 0+1=1+2=3+3.....+100  //5050
        // shortcut of forloop write fori
        // give ur starting for example 1 to 100
        // how to find sum of num ,everytime i get i va;ue add it sum
        // lets says 0+1 =1+2=3
        // which opertpr allows me to sum is addition assignment operator
        for (int i = 1; i < 101; i++) {// i : 1 ,2,3,4,5,6,....100 9+-+
            sum += i;
        }

        System.out.println(sum);


        System.out.println("-------------------------");



        int total =0;
        Scanner scan = new Scanner(System.in);

        // new one scanner variable ,
        // enter number 5 times and return their sum
         // one scanner is enough


        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number");
            total +=  scan.nextInt();
        }

        System.out.println("total = " + total);
scan.close();
    }



}
