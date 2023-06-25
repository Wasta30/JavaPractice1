package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Enter your age");
            int age = input.nextInt();


            while(!(age>=1 && age<=120)){
                System.err.println("Invalid entry, please re enter your age");
               age = input.nextInt();
            }

            System.out.println("Would you like to continue");
            String a = input.next().toLowerCase();

            while(!(a.equals("yes")|| a.equals("no"))){
                System.err.println("Invalid entry, Please re enter , would you like to continue ");
           a=input.next().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }

        }
input.close();

    }


}
