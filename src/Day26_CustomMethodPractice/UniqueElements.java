package Day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {


    public static void main(String[] args) {

        int [] array1= {1,1,3,4,5,5,6,6,};
     int[] unique=   uniqueElement(array1);

        System.out.println(Arrays.toString(unique));

        System.out.println("-----------------------");

        double [] array = {1.1,2.3,3.4,4.1,4.5,5.0,6.6,6.6,7.5,7.5,};


        double [] unique2= uniqueElement(array);

        System.out.println(Arrays.toString(unique2));


    }





    // everytime i find unique element i will apply add method
    // need to return as an  array , just give empty array for the moment
    // once i figure out unique element i will add element in result

    // returns the unique element of the array as a new array
    public static int[] uniqueElement(int[] array){
        int [] result = {};// the size of this arrray  is zero

        for (int each : array) {
            // this loop give me freq of each element in the array
            // if freq =1 so its unique 
            if(ArraysUtility.frequencyOfElement(array,each)==1){
             result=   ArraysUtility.addElement(result,each); // i  add element in result under the cpnd when element freq is 1
            }
        }
        
       return  result;  
    }




//// returns the unique element of the array as a new array(double)
    public static double[] uniqueElement(double[] array){
        double [] result = {};// the size of this arrray  is zero

        for (double each : array) {
            // this loop give me freq of each element in the array
            // if freq =1 so its unique
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result=   ArraysUtility.addElement(result,each); // i  add element in result under the cpnd when element freq is 1
            }
        }

        return  result;
    }



// for char// // returns the unique element of the array as a new array
    public static char[] uniqueElement(char[] array){
        char [] result = {};// the size of this arrray  is zero

        for (char each : array) {
            // this loop give me freq of each element in the array
            // if freq =1 so its unique
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result=   ArraysUtility.addElement(result,each); // i  add element in result under the cpnd when element freq is 1
            }
        }

        return  result;
    }


    
    
    //for String (Unique)
    public static String[] uniqueElement(String[] array){
        String [] result = {};// the size of this arrray  is zero

        for (String each : array) {
            // this loop give me freq of each element in the array
            // if freq =1 so its unique
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result=   ArraysUtility.addElement(result,each); // i  add element in result under the cpnd when element freq is 1
            }
        }

        return  result;
    }


}
