package day15_For_Loops;

import java.util.Scanner;

public class MaximumNumbers {

    public static void main(String[] args) {
        //  Q: how to find maximum num between many number
        // we will use the minimum number of int which is -2147483648
        // and compare all the number with this number to find the maximum number
        // this approach is used in futher lesson also
        // so suppose if we enter number form 1 to 5
        // first max = 1, than max =2 than at last max = 5
        Scanner scan = new Scanner(System.in);
        int max = -2147483648; // mimimum integer ,
        // any number user enter is greate than this


        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter a number:");
           int  num = scan.nextInt();
           if(num > max){ // so here we give the condition that if number is greater
               max = num; // than max number , that number will become the maximum number
           }
        }

        System.out.println("max = " + max);
// u can also apply this for any negative number beacuse any negative number is greate than this miminum number
        //



    }


}
/*
write a program that ask the user to enter a number for 5 times.
return the maximum number
 */