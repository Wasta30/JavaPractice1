package day13_String;

import java.util.Scanner;

public class Initials {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);
// how to get the intial of this Person means first leetter of first name concated by first letter of last name

     //   String initial = ""+f+l; // this is not string this is char just add empty string
        String initial = f+"."+l;
        // in order to apply concatenation there must be string on the left or on the right


        System.out.println("initial = " + initial);
scan.close();


    }


}
