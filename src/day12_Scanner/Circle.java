package day12_Scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius of the circle");
// input use kro ya scan koi issuenae
        double radius = scan.nextDouble();

        double area = radius *radius * 3.14;
       double perimeter = radius * 2 * 3.14;


        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


scan.close();


    }


}
/*
ask:
    1. Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius

 */