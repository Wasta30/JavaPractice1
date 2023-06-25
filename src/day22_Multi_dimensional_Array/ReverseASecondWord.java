package day22_Multi_dimensional_Array;

import java.util.Arrays;

public class ReverseASecondWord {


    public static void main(String[] args) {// Practice needed

        String sentence = "I love Wasta";

        String[] word = sentence.split(" ");// remember to give space
// [I, Love, Java]
        String revserved = "";
// i need to reverse the second word , the index number of array is 1 , so i will put 1 in loop
        // and then i need the number to be reversed so i will apply length-1
        // after that i will add this number into the string reversed
        // we have to apply charAt method to get each charcter
        for (int i = word[1].length()-1; i >=0 ; i--) {
                      revserved  += word[1].charAt(i);
        }
            // and add the charcter in another variable which is reserved

        System.out.println(revserved);

// if u want to replace love with evol in string u need to replace the orignal with reverse

       word[1]=revserved;// the original second word love replaced it with second word

        System.out.println(Arrays.toString(word));
// now how can i convert it into string [I, evol, Wasta]
        // now i need for each loop get each of the element one by one and then print it


        for (String eachwords : word) {
            System.out.print(eachwords+" ");// I evol Wasta (result)
        }
// if i want to replace 3rd word i need to change index to 2

        }

    }


