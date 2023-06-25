package utilities;

import java.util.Arrays;

public class StringUtility {
    //1- print each character of the given string
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));// we will get each character of string
        }
    }


    // 2-reverse the given string and retruns the reversed string
    public static String reverse(String str) {// "Java"
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            result += str.charAt(i); // each character added to new string

        }
        return result;// "avaJ"
    }


    //3-checks if given string is palindrome , retruns boolean
    public static boolean isPalindrome(String str) {
        // i have to  reverse it so i can call reverse method
        return reverse(str).equalsIgnoreCase(str);
    }


    // 4-check if string is anagram(2 string build of same cgaracter)
    // need to pass 2 string to chheck anagram
    public static boolean anagram(String str1, String str2) {// "acb" , "bca"
        // i will convert string to array because in string we do not have a sort method
// so in order to convert string into array use toCharArray

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1); // in ascending order before comparing
        Arrays.sort(ch2);

        return  Arrays.equals(ch1,ch2); // this mehod result true por false

        }



        // 5-removes duplicate from a  string

    public static String removesDuplicate (String str){

        // added to new string under cond if not present previously

        String result = "";

        for (int i = 0; i < str.length() ; i++) {

            char each = str.charAt(i); // get each character of string from this method
            // and each character added into reuslt if not contained previosuly

            if(!result.contains(""+each)){
                result +=each;
            }
        }


        return  result;
    }



    }


