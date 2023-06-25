package day41_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {

    public static void main(String[] args) {

        System.out.println("Test1 started");

        try{
            System.out.println(9/10);
            System.out.println("Try Block");

        }catch (ArithmeticException e){

            System.out.println("Catch block");
            System.out.println("Arithmetic exception occured");
        }


        System.out.println("Test 1 completed");


        System.out.println("-------------------------");


        System.out.println("Test 2 started");


        int [] numbers = {1,2,3,4,5};

        try{

            System.out.println(numbers[200]);
            System.out.println("Try Block");

        }catch (RuntimeException e){


            e.printStackTrace(); //java.lang.ArrayIndexOutOfBoundsException: Index 200 out of bounds for length 5

        }

        System.out.println("Test 2 completed");


        System.out.println("-----------------");

        System.out.println("Test 3 started");

        System.out.println("Hello");


        try{

            Thread.sleep(3000);

        }catch (InterruptedException e){

            e.printStackTrace();

        }


        System.out.println("Cydeo"); // this will print also as we get 0 code


        System.out.println("----------------");

        try{//java.io.FileNotFoundException: File path (The system cannot find the file specified)
            FileInputStream file = new FileInputStream("File path");
        }catch (FileNotFoundException e){

            e.printStackTrace();


        }


    }






}
