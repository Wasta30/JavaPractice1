package day19_LoopPRactices;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter length of rectangle");
            double length = input.nextDouble();

            System.out.println("Enter height of the rectangle");
            double width = input.nextDouble();

            if (length <= 0) {
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }

            if (width <= 0) {
                System.err.println("Invalid Entry for the width of the rectangle");
                System.exit(0);
            }

            double area = length * width;

            System.out.println("Area of rectangle : " + area);

            double perimeter = (2 * length) + (2 * width);
            System.out.println("Perimeter of the rectangle: " + perimeter);


            System.out.println("Would you like to calculate another Rectangle");
            String a = input.next();

            while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
                System.err.println("Invalid entry , Please re-enter");
                a = input.next();

            }

            if(a.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                break;
            }


        }
input.close();
    }
}
/*


3. Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry



 */