package day21;

import java.util.Arrays;

public class MergeTwoArray {

    public static void main(String[] args) {


        int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,6};


        int[] arr3 = new int[arr1.length+arr2.length];// make sure the third array contain enough capcity to get elment of both array

        // i need indexes so make a variable
        int i =0; // this i reprsent the indexes starting from 0

       for(int each:arr1){
           arr3[i++] +=each;
           // the i will increase by one each time
       }
// and where the i is left off we need to store second(arr2) variable in third array

       for(int each : arr2){
           arr3[i++] +=each;
       }


        System.out.println(Arrays.toString(arr3));

       // if i have 3 ar\y to combine i need 3 loop , because i need to use one indepent loop for each array


        System.out.println("--------------------");

        String []g1 ={"Wasta","Jiya"};
        String [] g2 = {"Taha","Ebbad"};

        String [] siblings =new String [g1.length+g2.length];

        int j = 0;
        for(String each:g1){
            siblings[j++]=each;// need to increase this index number if i dont do i++
            // each time only one name is assigned to i , and in order to fix it
            // i need to increase it every single time
        }



for (String each:g2){
    siblings[j++]=each;
}


        System.out.println(Arrays.toString(siblings));


    }








}
/*
Task
  1. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}



 */