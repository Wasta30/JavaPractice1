package day12_Scanner;

import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        System.out.println("Enter product name");
       String productname = scan.nextLine();

        System.out.println("Enter price");
       double price = scan.nextDouble();

        System.out.println("Enter the quantity");
     int quantity =   scan.nextInt();


        System.out.println("Enter first name");
      String firstName=  scan.next();


        System.out.println(firstName + " your order for " +quantity+" " +productname+ "  has been placed. "+ "your total is "+price);

scan.close();

    }




}
/*
6. PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.

 */