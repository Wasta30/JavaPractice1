package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        //   Scanner scan = new Scanner(System.in)             // in order to create onject type new and then constructurer

        //    import java.util.*; it is caalled wild input used in scanner
        //wild import  means import everything
        // do u thibnk is it good to import everything ?
        // to imput all means more memory so just import what u need
        // import java.util.Scanner; this will import just one class
        // only import class what u need
        // int and double are mostly used method
        // close sacnner after using

        // topic today next int, double , boolean , next , line

        //  Scanner scan = new Scanner(System.in);
        // everytime u have to call the onbject call the variable u assign in this case its scan


        //     new Scanner(System.in).nextInt ();        if we did this we have to create it everytime
// so next time we hve to create a new object and eveythime u create a new object its takes memory so just assign a variable

// its better to put a message before inputing method

        //   System.out.println("Enter a number between 1 to 7");
        //   scan.nextInt();  // so we have to input in console
        // byte num = scan.nextInt(); we have to cast it if we need to makebyte into int

        //   byte num = (byte) scan.nextInt(); but now not using it so use int

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        int num = scan.nextInt();


        String result = "";

        if (num >= 1 && num <= 7) {
// here i ma using ternaries also can be done with ulti branch

            result= (num==1)? "Monday" :(num == 2)?"Tuesday"
          :(num == 3)? "Wednesday":(num == 4)? "Thursday":(num == 5)? "Friday":(num  == 6)? "Saturday" : "Sunday";
} else {
            result = "Invalid number";
        }

        System.out.println(result);

        scan.close();
        // u have to create new objcet after closing a scanner

    }


}
