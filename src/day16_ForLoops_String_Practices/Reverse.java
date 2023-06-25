package day16_ForLoops_String_Practices;

import java.util.Scanner;

public class Reverse {


    public static void main(String[] args) {

        // reverse this word
     /*   Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String str1 = input.nextLine();
        String result = ""; // wasta tariq , reverse this
        result += str1.charAt(str1.length()-1);a //
        result += str1.charAt(str1.length()-2);t
        result += str1.charAt(str1.length()-3);s
        result += str1.charAt(str1.length()-4);a
        result += str1.charAt(str1.length()-5);w
        result += str1.charAt(str1.length()-6);" " // for space
        result += str1.charAt(str1.length()-7);q
        result += str1.charAt(str1.length()-8);i
        result += str1.charAt(str1.length()-9);r
        result += str1.charAt(str1.length()-10);a
        result += str1.charAt(str1.length()-11);t
        System.out.println(result); // atsaw
    */
        // Method when not using loop, but we have to repeat it
        // use this approach when reversing

//
        // now wasta tariq
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String str1 = input.nextLine();
        String result = "";
        for (int i = str1.length()-1; i >= 0; i--) {
            result += str1.charAt(i); // i indicating index number
        }// this is reversing for all types of data
        // this is applicable to all words
        // from last index (length()-1) to 0 and in order to stored into a variable we need to add it, thats why i use += which is adding each character to result

        // so i am getting character from last index to 0 and index represented by i

        // also a interview question

        System.out.println(result);

input.close();


    }
}
