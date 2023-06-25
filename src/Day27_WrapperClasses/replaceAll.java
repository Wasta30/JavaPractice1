package Day27_WrapperClasses;

import java.util.Arrays;

public class replaceAll {

    public static void main(String[] args) {

        int[] arr =  {10,10,20,30,30,40,50,30};
// oldd value is 30 , and it replace all 30 by 300

        arr = replaceAll(arr,30,300);
        System.out.println(Arrays.toString(arr));

    }


    // i need to check all the element to check if its matching and if its matching with given element i have to remove it with new element
    // replace all the matching old values of the array with the new value
    public static int[] replaceAll (int[] array, int oldValue, int newValue){

        // whenver the lement of array is mathcing with oldvalue i need to assign new value here

        for (int i = 0; i < array.length ; i++) {

            if(array[i]==oldValue){
                array[i]=newValue;
            }

        }

        return array;
    }



    // replace all the matching old values of the array with the new value
    public static double[] replaceAll (double[] array, double oldValue, double newValue){

        // whenver the lement of array is mathcing with oldvalue i need to assign new value here

        for (int i = 0; i < array.length ; i++) {

            if(array[i]==oldValue){
                array[i]=newValue;
            }

        }

        return array;
    }

    // replace all the matching old values of the array with the new value
    public static char[] replaceAll (char[] array, char oldValue, char newValue){

        // whenver the lement of array is mathcing with oldvalue i need to assign new value here

        for (int i = 0; i < array.length ; i++) {

            if(array[i]==oldValue){
                array[i]=newValue;
            }

        }

        return array;
    }



    // replace all the matching old values of the array with the new value
    public static String[] replaceAll (String[] array, String oldValue, String newValue){

        // whenver the lement of array is mathcing with oldvalue i need to assign new value here

        for (int i = 0; i < array.length ; i++) {

            if(array[i].equals(oldValue)){
                array[i]=newValue;
            }

        }

        return array;
    }





}
/*
2. RecplaceAll Task:
		2.1 Create a method named replaceAll that passes three parameters: integer array, integer oldElement, integer newElement. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
			Ex:
				arr = {10, 10, 20, 30, 40, 30, 30, 30};

				replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


		2.2 Create the same functions for double arrays, char arrays, and String arrays

 */