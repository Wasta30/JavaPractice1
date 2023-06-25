package day17_WhileAndDoLoops;

import java.util.Scanner;

public class EligibleForVote {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();  //valid age: between 1 to 120


        while (!(age >= 1 && age <= 120)) { // while the age is invalid
            System.err.println("Invalid age , please re-enter");
            System.out.println("Enter your age");
            age = input.nextInt();

        }


// to hmne ye cond true banae hai jab ye false hogi to execution rukhajegi


        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.out.println("Invalid entry, Please re-enter");
            System.out.println("Are you a US citizen? yes/no");
            answer = input.next();


        }

        if (age >= 18 && answer.equalsIgnoreCase("yes")) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("you are not eligible to vote ");
        }


short s = 13-19/3*10;
        s += -10;
        System.out.println(s);
    }


}
