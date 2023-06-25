package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        scan.nextLine();
        // due to this i am able to type full name , 
        // if u are using this method after using any other method clear the scanner first
        System.out.println("Enter yout full name");
        String fullname = scan.nextLine();

        System.out.println("enter your gpa");
        double gpa = scan.nextDouble();

        scan.nextLine();
        System.out.println("Enter your School name ");
      String schoolName = scan.nextLine();
      
      
        System.out.println("age = " + age);
        System.out.println("fullname = " + fullname);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);


    }


}
/*
1: ask the user to enter age (nextInt)
2: ask the user to enter full name (nextLine)
 */