package day12_Scanner;

import java.util.Scanner;

public class task3 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cents");
       int cents = scan.nextInt();

       int dollar = (cents / 100) ;


int remainder = (cents % 100);

        System.out.println(cents + " cents equal to :" + dollar +" dollars  and " + remainder + " cents ");



scan.close();
    }



}
/*
3. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

 */