package day22_Multi_dimensional_Array;

import java.util.Arrays;

public class IteratingMDA {

    public static void main(String[] args) {


        int[][] arr2D={{1,2,3,},{4,5,6,7,},{8,9,10,11}};


        // print each of the SDA one by one in separate line

        for (int i = 0; i < arr2D.length; i++) {//i : index number of SDA
         //   System.out.println(Arrays.toString(arr2D[i]));
            // if u need element use another variable j
// i : represnt SDA
            for (int j = 0; j < arr2D[i].length; j++) {

                System.out.print(arr2D[i][j]+" ");


            }

            System.out.println();// this will give new line after each array

        }




    }




}
