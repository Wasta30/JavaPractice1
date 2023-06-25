package Day27_WrapperClasses;

import java.util.Arrays;

public class replace {


    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5};

        arr= replace(arr,2,30);

        System.out.println(Arrays.toString(arr));


        String [] arr2 = {"Java","Python","C++","Wasta"};

      arr2=  replace(arr2,1,"Taha");

        System.out.println(Arrays.toString(arr2));






    }


//                      {1,2,3,4,5}
public static int[] replace (int [] array, int index, int newElement){
    if(index<0 || index>array.length-1){// cond for index , if less than 0  or greater than last index its invalid
        System.err.println("Invalid Index: "+ index);
        System.exit(0);
    }

    array[index]=newElement; // at this index assign new element

    return array;

}


// for replacment of elmenet in double array
    public static double[] replace (double [] array, int index, double newElement){
        if(index<0 || index>array.length-1){// cond for index , if less than 0  or greater than last index its invalid
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        array[index]=newElement; // at this index assign new element

        return array;

    }

// for replacmenrt of element in char array

    public static char[] replace (char [] array, int index, char newElement){
        if(index<0 || index>array.length-1){// cond for index , if less than 0  or greater than last index its invalid
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        array[index]=newElement; // at this index assign new element

        return array;

    }

// for replacement in String array
    public static String [] replace (String  [] array, int index, String newElement){
        if(index<0 || index>array.length-1){// cond for index , if less than 0  or greater than last index its invalid
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        array[index]=newElement; // at this index assign new element

        return array;

    }






}
/*
1. Replace Task:
		1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
				Ex:
					arr = {1,2,3,4,5};

					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


		1.2 Create the same functions for double arrays, char arrays, and String arrays


 */