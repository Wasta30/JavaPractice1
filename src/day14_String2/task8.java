package day14_String2;

import java.util.Scanner;

public class task8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter email address");
        String email = input.nextLine();


if(email.contains("_")){
    int undersccore = email.indexOf("_");
    int dot =email.indexOf(".");
    int at =email.indexOf("@");

    String firstname = email.substring(0,undersccore);
    firstname =firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();

    String lastName = email.substring(undersccore+1,at);
    lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

    String domain = email.substring(at+1,dot);

    System.out.println("firstname = " + firstname);
    System.out.println("lastName = " + lastName);
    System.out.println("domain = " + domain);
}



input.close();


    }


}
/*
  8. Create a class called EmailTask2.
       Assume that email address is constructed by Person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */