package day14_String2;

import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number");

        String word = input.next();
        String result = "";

        boolean accountStartswith2 = word.startsWith("2") && word.length()==7;
        boolean accountStartswith5 = word.startsWith("5") && word.length()==10;


        if(accountStartswith2){
            result = "Account valid";
        } else if (accountStartswith5) {
            result = "Account valid";

        }else {
            result = "not valid";
        }

        System.out.println(result);

    }




}
/*
6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”

 */