package day04_Variable;

public class Circle {
    public static void main(String[] args) {
// PI, radius, diameter, area, perimeter
        double PI = 3.14;
        double radius = 3.5;
        double diameter = radius * 2;
        double area = radius * radius * PI;
        double perimeter = diameter * PI;


        // not printing PI as it's a constant
        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);




    }


}
/*

	3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI
							or Perimeter = diameter * PI

 */