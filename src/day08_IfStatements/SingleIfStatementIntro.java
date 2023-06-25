package day08_IfStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 100;
        // System.out.println("Odd number "); if the above number is odd i want u to print it
        //   System.out.println("Even Number ");or if its even pritn it
// i have to create a conditon
        // single if : for one possible outcome
        // if and else :

// can i create boolean expression being a odd number

        boolean evenNumber = number % 2 == 0; // if remainder equal to 0 means even number
        boolean oddNumber = !evenNumber;


        if (evenNumber) {
            System.out.println(number + " is even number ");


        }


        if (oddNumber) {// not even numbers

            System.out.println(number + " is odd number");
        }
        System.out.println("-----------------------------");


        int n = 200;

        // verify if this number is positive negative or zero

        if (n > 0) {

            System.out.println(n + " is a positive number ");
        }


        if(n < 0){
            System.out.println(n+ "is a negative number");
        }


    if(n==0){
        System.out.println(n+ " is zero");
    }


    }



}
// if the conditon is not true it will never execute only in case of ture it will show result in cconsole