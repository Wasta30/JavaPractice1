package day14_String2;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Print the word");
        String word1 = input.next();
        String result = "";
        
        if(word1.endsWith("ly")){
          result = "Really";  
        }else{
            result="never mind";
        }
        System.out.println("result = " + result);

        input.close();

    }


}
/*

    2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */