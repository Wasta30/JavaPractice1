package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

     //   System.out.println("Enter true or false");

      // boolean result = scan.nextBoolean();  // this can not rad anything other than  ture or false
        //only use it if u wnat the user to print true or false

// next method : used for getting the string the diff is it can not read everything it reads till space
        // use when u want to like one word

        System.out.println("Enter your name");

        String name = scan.next();
        System.out.println("name = " + name); // print wasta only
        // what if i want to print i like wasta it will not print it it only reads till the space and there is space betwwen i and wasta
// the functionlity is it only reads till the space
// use it when expecting one word input

        scan.close();









    }



}
