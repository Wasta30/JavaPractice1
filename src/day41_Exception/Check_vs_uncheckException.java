package day41_Exception;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Check_vs_uncheckException {

    public static void main(String[] args) {


        // Uncheck exception
     int a = 10;
     int b = 0;
       // System.out.println(a/b); //Exception in thread "main" java.lang.ArithmeticException: / by zero
     //   System.out.println("Wooden Spoon");


    char[] characters = {'A','B','C'};
    //                   0    1   2

      //  System.out.println(characters[99]);// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 99 out of bounds for length 3


        Student student  = null;

      //  System.out.println(student.getName()); //Exception in thread "main" java.lang.NullPointerException


        final String str = "Wooden Spoon";
      // str = null; // can not asssign value to final variable ***

        System.out.println(str.toUpperCase());

String str2 = ""; //
//str2 = null;
        System.out.println(str2.isEmpty());


        // checked exception

        System.out.println("Hello");
       // Thread.sleep(3000); // checked //java: unreported exception java.lang.InterruptedException; must be caught or declared to be thrown

        System.out.println("Cydeo");


      //  FileInputStream file = new FileInputStream("path of the file"); //java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown

        System.out.println("Java".charAt(1000)); //unchecked //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 1000







    }





}
