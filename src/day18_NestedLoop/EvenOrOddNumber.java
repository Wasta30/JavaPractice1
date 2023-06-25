package day18_NestedLoop;

import java.util.Scanner;

public class EvenOrOddNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int number = input.nextInt();
            if (number % 2 == 0) {
                System.out.println(number+" is even number");
            } else {
                System.out.println(number+ " is Odd number");
            }
            System.out.println("Would you like to enter another number");
            String a = input.next().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))) {
                System.out.println("Invalid entry ,Please re-enter, Would you like to enter another number ");
               a=input.next();

            }
            if (a.equals("no")) {
                break;
            }

        }


    }

}
/*
2. Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enteres invalid answer, repeat the previous steps
 */