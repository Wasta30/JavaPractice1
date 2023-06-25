package day21;

import java.util.Arrays;

public class StringMEthod {


    public static void main(String[] args) {

        String str = "Java";
        // if u want the acces of every single chzracter is to apply toCharArray for this u need to create a string
char [] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

 for(char each: chars){
     System.out.println(each);
 }


        System.out.println("----------------------");



 // split(value): returns string array
        // use for spliting string and retuns string array

        String sentence = "Wooden Spoon";
        // to get string array apply split method

        // and if u want char array apply toCharArray method
        // when we apply toChar arry it convert string into charArray


        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));


        System.out.println("------------------------");

        String email = "wastatar30@gamil.com";
        // get me domain and user name
        // split email by @ character
        // create array that has first substring

        String [] arr = email.split("@");

        System.out.println(Arrays.toString(arr));

        System.out.println("------------------");

        String s =  "Today is a nice day. Wasta is nice. Ameen is a kind boy";

        String [] sentence1 = s.split("\\. ");  // if u want to split by dot(.) then give \\ otherwise last word will removed

        System.out.println(Arrays.toString(sentence1));


        // comma in array separate indexes (remember)
    }





}
