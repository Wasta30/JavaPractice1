package day19_LoopPRactices;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter side of the square");
            double side = input.nextDouble();

            if (side <= 0) {
                System.out.println("Invalid Entry for the side of the square");
                System.exit(0);
            }

            double area = side * side;
            System.out.println("area of the sqaure " + area);


            double perimeter = (side + side) * 2;
            System.out.println("Perimeter of the square " + perimeter);


            System.out.println("Would you like to calculate another Square?");
            String a = input.next();

            while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
                System.err.println("Invalid entery, Please re-enter");
                a = input.next();
            }


            if (a.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Square Calculator APP");
           break;
            }

        }

input.close();
    }


}
/*

	2. Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */