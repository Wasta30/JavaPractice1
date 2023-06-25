package day17_WhileAndDoLoops;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
// Add 2 numbers

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = scan.nextInt();

        System.out.println("Enter second number");
        int num2 = scan.nextInt();


        // enter maths opeator +,- , supppose -.+ are only valid opeator now and if use enter
        // any other math operator tell it to put operator until he/she give valid operator
// if the user enter anything except -,+ ask user to reneter , for this give condition



        System.out.println("Enter a math operator");

        char ch = scan.next().charAt(0);
// the cond will be false if the operator i provided is valid , so it wont ask to enter valid operator
        while (!(ch == '+' || ch == '-')){ // we  dont know ho many times user enter invalid operator so
            System.err.println("Invalid Operator ,Please re-enter");
            ch= scan.next().charAt(0);

        }

        // if user gave any other opeartor except +,-


        System.out.println((ch == '+')? num1+num2: num1-num2);
scan.close();

    }




}
// if the number of repetaing unknown use while loop ,
// executes till the cond becomes faalse
// only times its executed when the operator is valid
// how many times it ask to enter valid operator depends on how many times u asked to enter valid operator

