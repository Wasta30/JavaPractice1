package day14_String2;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");

        String str1 = input.next();
        System.out.println("Enter second word");
        String str2 = input.next();

if(str1.substring(str1.length()-1).equalsIgnoreCase(str2.substring(0,1))){
    System.out.println(str1+str2.substring(1));

        }else{
    System.out.println(str1+str2);
        }

input.close();

    }

// lastindex ofstr = firstindexofstr2
}
/*

    4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */