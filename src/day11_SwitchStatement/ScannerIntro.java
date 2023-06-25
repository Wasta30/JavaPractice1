package day11_SwitchStatement;

  // this is how we import source that are outside this package

import java.util.Scanner;

public class ScannerIntro {// scanner is in util pckg and util is in java pckg

    public static void main(String[] args) {

        //Scanner :it is presented in util package and util package is in another package called java
        //so u have to import it in order to use it in the package
        // import it by using import statement
        // why we have to import it ?? one of the adv of scanner is allow us tyo get user input
        // give input statement between package and class name

        // u haveto declare scanner variable
     //   Scanner input = new Scanner(System.in);

                // this is how we create scanner object now the program is linked to ur keyboard
// whatever we type it can get into scanner memory
// shortcut type scanner here and autoomaticlly it will come in package


       // we have to use method of scanner mostly used Nextint

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");

    int num1 =    input.nextInt();
       // System.out.println(num1);
        //
// in console it will wait for u to provide an input
        // how can i ask sacnner to enter a decinal ?

        System.out.println("Enter a decimal");

       double num2 =  input.nextDouble(); // method thats reads input for double
        // assign it to double variable
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: "+ (num1*num2));
input.close();  // this is the way to close scanner because it will run in background
        // the performece of code will be slow down, can not use sacnner anymore


/*
        System.out.println("Enter an integer: ");
        int num3 = input.nextInt();

        System.out.println(num3);
        */

    }
}
