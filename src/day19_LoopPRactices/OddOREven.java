package day19_LoopPRactices;

import java.util.Scanner;

public class OddOREven {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }

            System.out.println("Would you like to enter another number? (yes/no)");
            String answer = input.next();

            if(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.err.println("Invalid entry");
                System.exit(0); // if user provide invalid entry it will terminate program
            }

            if(answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using calculator!");
                break;
            }
        }

    }



}
