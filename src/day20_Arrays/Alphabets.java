package day20_Arrays;

import java.util.Arrays;

public class Alphabets {

    public static void main(String[] args) {


        // create variable that contain 26 characters ,

        char[] alphabets = new char[26];// Z~A

        // how to store Z into index 0
        //           i
       /* alphabets[0]='Z'; // what is the num in asci table for Z // number for Z is 90
        alphabets[1]='Y'; // 89
        alphabets[2]='X';// 88
        */
        // index num [i] is increasing and char is decresing

        char ch = 'Z';
        for (int i = 0; i < alphabets.length ; i++,ch--) {
            alphabets[i]=ch;
//

        }


        System.out.println(Arrays.toString(alphabets)); // print whole array
        System.out.println(alphabets[0]);  // print the element of array


        System.out.println("-----------------------");
        // another way of doing above question

        char []  alphabets1 = new char[26];
// if i have char can i assign num and charcater ? yes i can
        // noting giving any cond for j because i< alphabets1.length meand last index
        // so by the time it reach last index it will give u 'A', also index is increasing so (i++) and character is decreasing (so j--)



      // just give cond asd long as i is length of array
            for (char i = 0,j='Z'; i < alphabets1.length; i++, j--) {
            alphabets1[i]=j;
        }


        System.out.println(Arrays.toString(alphabets1));

    }





}
