package day19_LoopPRactices;

public class UniqueCharacters {


    public static void main(String[] args) {
// we can find unique character by using freq

        String str = "aabccdeef";
        String result = "";
// how to get every single character from beg to end by apply loop

// outerloop holds one charcter one charcter and inner loop checks all charcte rone by one
        for (int j = 0; j < str.length(); ++j) {
            // this outerloop is picking the ccharacter and inner loop compare it with each charcter of string

            char ch = str.charAt(j); // i need the every charcter not just 'a'
            //  char ch = 'a';// i need to to compare this charater with
            // every single character of string and then  i need a variable to count freq of this charctaer

            int count = 0; // represent freq of ch for example 'a'
            // i created this loop because i need to compare the charcter (a,b,c or whaterver) with each character of string
            for (int i = 0; i < str.length(); i++) {
                char eachCharacter = str.charAt(i);// this is the loop whivh find freq of every single character
                // compare the specific charcter with every charcter of string and if it is same increase coount by 1
                if (ch == eachCharacter) {// inner loop finding freq
                    count++; // inner loops cehck all character
                }
            }
// after it find freq we need to see if it is unique or not
            // how do i know which charcter is unique ?
            // i need to add unique charcter in string varaiable "result"
            if (count == 1) { // if freq of charcter is 1 then the charcter is unique
                result += ch;
                // another way of doing it if count is not 1 skip it
                //if(count !=1)
                // continue
                // also we can find duplicate character if freqq is greater than 1
            }

        }

        System.out.println(result);
    }

}
/*
2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

 */