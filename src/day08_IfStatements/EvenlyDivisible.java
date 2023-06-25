package day08_IfStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 100;

        boolean divisibleBy2 = number % 2 == 0; // return me whatever left , if no remainder left means 65 evely divisble , need to compare it with zero

        boolean divisibleBy3 = number % 3 == 0;

        boolean divisibleBy4 = number % 5 == 0;


        System.out.println(number + " is divisible by 2 : " + divisibleBy2);
        System.out.println(number  + " is divisible by 3 :" + divisibleBy3);

        System.out.println(number + " is divisbile by 5 :" + divisibleBy4);


        System.out.println("------------------");
        // check if number of year is leap year

        int year = 2000;

        boolean isLeapYear = year % 4 == 0;

        System.out.println(year + " is Leap year :" + isLeapYear);






    }


}

/*
2. Create a class called EvenlyDivisible,and write a program that can check if a number is evenly divisible by 2, 3, 5
    		Ex:
				number = 65;

			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true

 */