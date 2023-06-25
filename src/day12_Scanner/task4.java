package day12_Scanner;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter miles ");
        double miles = scan.nextDouble();
        // 1 mile = 1609meters
        // to convert meter to km hm 1000 se divide krengay so
        // 1 mile = 1.69km

        double kilometers = miles * 1.69;

        System.out.println(miles + " miles equal to " + kilometers+ "km");

scan.close();





    }



}
/*
4. Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers


 */