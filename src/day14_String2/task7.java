package day14_String2;

import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
        System.out.println("Enter your email");
         String email = input.next();




        if(email.contains("_")){
            String str1 = email.substring(0,email.indexOf('_'));
            String str2 = email.substring(email.indexOf('_')+1,email.indexOf('@'));
            String str3 = email.substring(email.indexOf('@')+1);

            String finalEmail = str2+str1+str3;

            System.out.println("finalEmail = " + finalEmail);
        }else{
            System.out.println(email);
        }

    }

    // indexof is for showing index (number of character)
    // length: showing total char
    //

}
/*
 7. Create a class calledEmailTask1.
       Assume that email address is constructed by Person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com

 */