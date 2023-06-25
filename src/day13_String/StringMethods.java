package day13_String;

public class StringMethods {


    public static void main(String[] args) {

        String word = "Cydeo";  // i want the third character of this string 
        // first index always 0 what if i use index number which is out of range i get indexoutofboxexception
        // if i have 5 character the maximum index is 4
        char thirdChar = word.charAt(2); // u have to give one number less if u need third character give 2

        System.out.println("thirdChar = " + thirdChar);

        //    char tenthChar =word.charAt(9); // so i will get indexoutofboxexception

        // length method gives totla numner of character ,return type is int


        System.out.println("---------------------");

        // length method gives totla numner of character ,return type is int

        String s1 = "Batch 10 is the best batch. Java Programming langauge";
        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);
        // in order to know how many charcater i have instead of counting just call length method
        // even the sspaces are included in characters anything in double quote are counted \

// return me the last charcater from the srting
        // lastindex number is total number oof charcter subtract one, so once we calculate total number of character subtract one

        //  char lastChar = s1.charAt(totalChars-1);
        // or another way is just call the lenggth and subtract 1 from it

        char lastChar = s1.charAt(s1.length() - 1); // formula to find last indexnumber
        System.out.println("lastChar = " + lastChar);

// in order to find last index number find total number of character which starts from 1 , so in order to find last index u need to subtract one from total number of character

        System.out.println("----------------------");
        // toLowerCase and toUpperCase
        // convert the string to lower case or upper case
        // but we said string is not changeable so do u thibk when we call it it will modify string
        // no it can not modify current string it can create a new one


        String str = "wooden spoon"; // all in lowercase now
        str = str.toUpperCase(); // "WOODEN SPOON" , its creates a new string
        // now if i call variable str do i get wooden spoon in lower or upper case ?
        // it still gives me wooden spoon in lower case cuz one variable contain only one data
// so what if i want to see this variable in uppercase to phir line str ko assign krna paregaa
        System.out.println(str);


        String s = "JAVA";
        s = s.toLowerCase(); // so always assign it back when giving it
        System.out.println(s);

// Today is a great day to learn java programming langauge
        String sentence = "Today is a great day to learn java programming langauge";
sentence = sentence.toUpperCase();// this creates a new variable

        System.out.println(sentence);



    }


}
