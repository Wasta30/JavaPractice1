package day06_PrimitiveTypeCasting;

public class BirthDay {

    public static void main(String[] args) {


        String name = "Wasta";
        int birthDay = 30;
        String birthMonth = "January";
        int birthYear = 1997;

        System.out.println(name +" "+ "was born on " + birthMonth+"/"+birthDay+"/"+birthYear );


        System.out.println("--------------------");


        // My favorite book is "bookName"

        String bookName = "Atomic Habits";

        // System.out.println("My favorite book is \""+ bookName + "\"");

// if u want to give double quote use \" (2 ways og giving double quote)

        System.out.println("My favorite book is " + "\"" + bookName + "\"");

        // for single quote
       System.out.println("My favorite book is " + "\'" + bookName + "\'");

    }


}
/*
1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the Person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.

 */

// after java version 8 its possible to gave ' without slash we can also use \' for singel quote