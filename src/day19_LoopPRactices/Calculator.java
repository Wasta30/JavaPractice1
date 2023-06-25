package day19_LoopPRactices;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");
        int num1 = scan.nextInt();

        System.out.println("Enter math operator");
        char operator = scan.next().charAt(0); // for ex it return me string "+" or "-" and i will call it by using index 0
                // if i am using char which method i shoukd use which returns me single char ?
        // ther is no specific method which returns the single char but i can use next method and use charAt
        // as next method returns u string and now u can use charAt method and it will givee u first character
// if user provide invaliid operator can i terminate the program
        if(!(operator == '+'|| operator == '-')){// if operator is not valid
            System.err.println("Invalid math operator: "+operator);
            System.exit(0);

        }
        System.out.println("Enter second number");
        int num2 = scan.nextInt();

        if(operator== '-'){
            System.out.println(num1-num2);
        }else{
            System.out.println(num1+num2);
        }







    }


}
