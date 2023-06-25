package day19_LoopPRactices;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Enter radius of circle");
            double radius = input.nextDouble();

            if (radius <= 0) {
                System.out.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }
            double diamater = radius * 2;
            System.out.println("Diameter of the circle " + diamater);

            double area = radius * radius * 3.14;
            System.out.println("The area of the circle " + area);


            double perimeter = radius * 2 * 3.14;
            System.out.println("perimeter of the circle is " + perimeter);


            System.out.println("Would you like to calculate another circle?");
            String a = input.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("Invalid entry would you like to continue");
                a = input.next();
            }

            if (a.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }
input.close();
        }


    }


}
/*
1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

 */