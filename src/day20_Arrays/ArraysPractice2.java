package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {


        /// how many letters we have in english alphabet : 26
        char[] lettters = new char[26]; // size is 26 here
        // i have to assign characters A, B .... at different index

       /* lettters[0]='A';
        lettters[1]= 'B';
        // two things are changing , index number and character , so need two variable
        // one for index and one for character
        */// instead of this use loops

// i need one variale to assing for char and one ffor index (i,j)
        // i and j both are char (j is index number) i is charcater
        for (char i = 'A',j=0; i<='Z' && j<=lettters.length-1 ; i++,j++) {
            lettters[j]=i;// array[index num =j]= i (which represnt the character)
        }
        System.out.println(Arrays.toString(lettters));

        // another way of doing the abpve question
      char[] letters2 =  new char[26];
        char ch = 'A'; // data type is char
        for (int i = 0; i < letters2.length ; i++) {
            letters2[i]=ch++;
        }

        System.out.println(Arrays.toString(letters2));

        System.out.println("----------------------");

       // Z~A

        char[] letters3 = new char[26];

char ch1 ='Z';
        for (char i = 'Z', j= 0; i>='A' && j<=letters3.length-1; i++,j--) {
            letters3[j]=i;
        }

        System.out.println(Arrays.toString(letters3));

// ask , not corect answer





    }
}
