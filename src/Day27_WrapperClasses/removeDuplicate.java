package Day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class removeDuplicate {

    // create new array and add element under the cond if not prresent in new array


    public static void main(String[] args) {

        int [] arr = {1,2,2,3,4,4,5,5,5,6,6,7,7,78,};

        arr= removeDuplicate(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("------------------------------");

        String [] words = {"Java","Java","Java","Python","C#"};

        words =removeDuplicate(words);

        System.out.println(Arrays.toString(words));
        System.out.println("------------------------------");




    }


// removes the duplicate from the given array , and returns the new array
    public static int[] removeDuplicate (int[] array){
        int[] result = {};

       for(int each:array)// for each loop gets each element from array and check if these elementd are in new array whicch is result
 if(!ArraysUtility.contains(result,each)){// as long as the result(which is the new array i declared) not contain these elements
   result= ArraysUtility.addElement(result,each);// add it to the result (which is the new array)
}

return  result;
     }




    // removes the duplicate from the given array , and returns the new array
    public static double[] removeDuplicate (double[] array){
        double[] result = {};

        for(double each:array)// for each loop gets each element from array and check if these elementd are in new array whicch is result
            if(!ArraysUtility.contains(result,each)){// as long as the result(which is the new array i declared) not contain these elements
                result= ArraysUtility.addElement(result,each);// add it to the result (which is the new array)
            }

        return  result;
    }





    // removes the duplicate from the given array , and returns the new array
    public static char[] removeDuplicate (char[] array){
        char[] result = {};

        for(char each:array)// for each loop gets each element from array and check if these elementd are in new array whicch is result
            if(!ArraysUtility.contains(result,each)){// as long as the result(which is the new array i declared) not contain these elements
                result= ArraysUtility.addElement(result,each);// add it to the result (which is the new array)
            }

        return  result;
    }



    // removes the duplicate from the given array , and returns the new array
    public static String[] removeDuplicate (String[] array){
        String[] result = {};

        for(String each:array)// for each loop gets each element from array and check if these elementd are in new array whicch is result
            if(!ArraysUtility.contains(result,each)){// as long as the result(which is the new array i declared) not contain these elements
                result= ArraysUtility.addElement(result,each);// add it to the result (which is the new array)
            }

        return  result;
    }





}
