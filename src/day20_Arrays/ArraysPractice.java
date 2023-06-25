package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        // store the element : 10,20,50,70 (here i know 4 elements and i know the value also)


        int[] numbers = {10, 20, 50, 70}; // size :4

        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------------");

        // create a variable that can contain 5 scores

        // use first way of intizaling

        int[] score = new int[5];  // setting the size of array
        score[1] = 85;
        score[score.length - 1] = 95; // for the last index , means 4th elemnt is 95
        score[3] = 55;
        score[2] = 65;
        score[0] = 75;

        System.out.println(Arrays.toString(score));// [75,85,65,55,95]


        System.out.println("------------------------");


        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};  //0 ~ 11 (length -1)


/*
        System.out.println( months[0] ); // Jan
        System.out.println( months[1] );// "Feb
        System.out.println( months[2] );
        System.out.println( months[3] );
        System.out.println( months[4] );
        System.out.println( months[5] );
        System.out.println( months[6] );
        System.out.println( months[7] );
        System.out.println( months[8] );
        System.out.println( months[9] );
        System.out.println( months[10] );
        System.out.println( months[11] );

        */

        for (int i = 0; i <= months.length-1 ; i++) {
            System.out.println(months[i]); // months from index 0 to index 11
        }


        System.out.println("-----------------------------");

        // print months from last to first


        for (int i = months.length-1; i >=0 ; i--) { // i : index number starting from last index, its going backwards
            System.out.println(months[i]);

        }





    }


}
