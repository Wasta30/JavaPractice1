package day42;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
// used to throw exception
    public static void main(String[] args) {

        System.out.println("Enter your age");
        int age = new Scanner(System.in).nextInt();


        if(age<0){
            throw new InputMismatchException("Age can not be negative"+ age);
        }

        if(age>21){
            System.out.println("You are eligible");
        }else {
            throw new RuntimeException("you must be atleast 21 years old");
        }


    }


}
