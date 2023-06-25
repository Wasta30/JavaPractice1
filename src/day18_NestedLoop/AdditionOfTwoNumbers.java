package day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class AdditionOfTwoNumbers {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Enter your first number");
            int num1 = input.nextInt();

            System.out.println("Enter your second number");
            int num2 = input.nextInt();

            System.out.println("Addition:" + (num1 + num2));

            System.out.println("Would you like to continue");
            String a = input.next().toLowerCase();

            //put () there before and after num1+num2 to get the additon because otherwise it will concate
            while(! (a.equals("yes") || a.equals("no")) ){
                System.err.println("Invalid entry, Please re-enter");
                 a = input.next().toLowerCase();
            }// so we create another while loop inside one, only execute when we give other than yes or no

            if(a.equals("no")){
                break;// the only time outer loop stops is when we give no
            }// break statement exit outerloop

        }


    }


}
