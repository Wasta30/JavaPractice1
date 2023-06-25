package day21;

import java.util.Arrays;

public class ReverseArray {


    public static void main(String[] args) {// imp interview question
// u can apply it on string array and also on char array

        int[] numbers = {10, 20, 30, 40, 50};
//                       0,1,2,3,4
        // reverse this array, and in order to do it i need last inndex

        // final result {50,40,30,20,10}
        // create varaible to store final result
        // as we know the size of array is 5 so at the end we need to be sure to make another array
        // which has the capacity to store 5 elemets of array
        // so the variable  int [] reversed must have size which is equal to int [] numbers
        int[] reversed = new int[numbers.length];
        // by doing this the length of both is same

        //
        //  reversed[0]= numbers[numbers.length-1];
        // the last element of array will store it at index 0 of reversed array
        //          j           i
     /* reversed[0]=numbers[4];
        reversed[1]=numbers[3];
        reversed[2]=numbers[2];
        reversed[3]=numbers[1];
        reversed[4]=numbers[0];
*/
        // so the index in reversed is increasing and in numbebrs is decreasing


        // use loop

        for (int i = numbers.length - 1,j=0; i >= 0; i--,j++) {
            reversed[j]=numbers[i];
        }



        System.out.println(Arrays.toString(reversed));


    }


}
