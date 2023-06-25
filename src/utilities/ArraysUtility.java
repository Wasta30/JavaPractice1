package utilities;

import java.util.Arrays;

public class ArraysUtility {
    
    //1-Prints each integer of an integer array in separate lines (only display)
    
    public static void printEachElement(int[] array){
        for(int each: array){
            System.out.println(each);
        }
    }

//2- print each decimal  of double array in separate line
    public static void printEachElement(double[] array){
        for(double each: array){
            System.out.println(each);
        }
    }

// 3-print each float number from float array in separate line
    public static void printEachElement(float[] array){
        for(float each: array){
            System.out.println(each);
        }
    }

//4-print each char of char array in separate line
    public static void printEachElement(char[] array){
        for(char each: array){
            System.out.println(each);
        }
    }

// 5-for String array
    public static void printEachElement(String[] array){
        for(String each: array){
            System.out.println(each);
        }
    }
    
    

    // 6- Find max num from integer array

    public static int max(int [] numbers){
      // if i sort the array it has value from small to large and last int is max number

        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //7- fix max num from double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
        
    }

    
    
    
    // 8 - find minimum number from int 
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
        
    }
    
    
    //9- find mim num from double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];

    }
    
    
    // 
    //10 - check if the given integer is contained in the given array, returns boolean
    // contains(int[],int)// or in other words check if element is conatined in an array 
    
    public static boolean contains(int[] array, int elemnt){
                                     // {1,2,3,4}   6 , false 
        boolean result = false; // this will be true whenever the element is matching in an array
        for(int each: array){
            if(each==elemnt){// if the element given is matching with any elemnt of array then cond is true
                result=true;
            }
        }
        return result;
    }
    
    
    
    
    // 11- check if the given double array is conta8ined in the given array , 
    // contained(int[],int)

    public static boolean contains(double[] array, double elemnt){
       
        boolean result = false; 
        for(double each: array){
            if(each==elemnt){// if the element given is matching with any elemnt of array then cond is true
                result=true;
            }
        }
        return result;
    }
    
    
    
    
    
    // 12-check if the given char is contained in the given array, returns boolean

    public static boolean contains(char[] array, char elemnt){

        boolean result = false;
        for(char each: array){
            if(each==elemnt){// if the element given is matching with any elemnt of array then cond is true
                result=true;
            }
        }
        return result;
    }
    
    
    //13-check if the string is conatined in the string array

    public static boolean contains(String[] array, String elemnt){

        boolean result = false;
        for(String each: array){
            if(each.equals(elemnt)){// if the element given is matching with any elemnt of array then cond is true
                result=true;
            }
        }
        return result;
    }
// 14
    public static int[] addElement(int[] array, int element ) {// need to pass 2 parameter arrayband elemnt add into array
        // i need to make new array and make sure it has enough capacity to contain element +1 extra elent in end

        int[] result = new int[array.length + 1];
        // and u need to get every single element of array and assign it to index of the array (means new array which i created)
        int i = 0; // index of new array
        // and when the loop execute each time increase index number by 1

        for (int each : array) {
            result[i++] = each;
            // whenver i stop after this loop i can assiggn the element

        }

        result[i] = element;
        return result;
    }

//15
    // 2. create a return method called addDouble that can add a double after the last index of a double array

    public static double[] addElement(double[] array,double element ){
        double [] result = new double[array.length+1];


        int i=0;
        for(double each:array){
            result[i++] =each;

        }
        result[i] =element;
        return result;
    }


//16
    //   3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] array,String element ){
        String [] result = new String[array.length+1];


        int i=0;
        for(String each:array){
            result[i++] =each;

        }
        result[i] =element;
        return result;
    }



//   4. create a return method called addChar that can add a char after last index of a char array
//17

    public static char[] addElement(char[] array,char element ){
        char [] result = new char[array.length+1];


        int i=0;
        for(char each:array){
            result[i++] =each;

        }
        result[i] =element;
        return result;
    }
    // its better to apply one meth

//18
//1.1 Create a method that passes two parameters: an integer array and an Integer element. The method returns the frequency of the given integer element from the integer array

    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }
//19
//	1.2 Create a method that passes two parameters: a double array and a double element. The method returns the frequency of the given integer from the array


    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

//20
    //1.3 Create a method that passes two parameters: a char array and a char element. The method returns the frequency of the given char element from the char array
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }
//21
// 1.4 Create a method that passes two parameters: a String array and a String element. The method returns the frequency

    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }



//22
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



//23
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


//24
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



//25
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



    //26- merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }


    //27- merge the given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2){

        double[] result = {};

        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }


    //28- merge the given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2){

        char[] result = {};

        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }


    //29- merge the given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2){

        String[] result = {};

        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }



   //30- /reverses the given array, returns a new array
    public static int[] reverse(int[] array){

        int[] result = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //31-reverses the given array, returns a new array
    public static double[] reverse(double[] array){

        double[] result = new double[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //32-reverses the given array, returns a new array
    public static char[] reverse(char[] array){

        char[] result = new char[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //33-reverses the given array, returns a new array
    public static String[] reverse(String[] array){

        String[] result = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //34-removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }






    //35-removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //36-removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //37-removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


//38
    //                      {1,2,3,4,5}
    public static int[] replace (int [] array, int index, int newElement){
        if(index<0 || index>array.length-1){// cond for index , if less than 0  or greater than last index its invalid
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        array[index]=newElement; // at this index assign new element

        return array;

    }


    //39- for replacment of elmenet in double array
    public static double[] replace (double [] array, int index, double newElement){
        if(index<0 || index>array.length-1){// cond for index , if less than 0  or greater than last index its invalid
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        array[index]=newElement; // at this index assign new element

        return array;

    }

//40- for replacmenrt of element in char array

    public static char[] replace (char [] array, int index, char newElement){
        if(index<0 || index>array.length-1){// cond for index , if less than 0  or greater than last index its invalid
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        array[index]=newElement; // at this index assign new element

        return array;

    }

    //41- for replacement of element  in String array
    public static String [] replace (String  [] array, int index, String newElement){
        if(index<0 || index>array.length-1){// cond for index , if less than 0  or greater than last index its invalid
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        array[index]=newElement; // at this index assign new element

        return array;

    }

    //42- replace all the matching old values of the array with the new value
    public static int[] replaceAll (int[] array, int oldValue, int newValue){

        // whenver the lement of array is mathcing with oldvalue i need to assign new value here

        for (int i = 0; i < array.length ; i++) {

            if(array[i]==oldValue){
                array[i]=newValue;
            }

        }

        return array;
    }



    //43- replace all the matching old values of the array with the new value
    public static double[] replaceAll (double[] array, double oldValue, double newValue){

        // whenver the lement of array is mathcing with oldvalue i need to assign new value here

        for (int i = 0; i < array.length ; i++) {

            if(array[i]==oldValue){
                array[i]=newValue;
            }

        }

        return array;
    }

    //44- replace all the matching old values of the array with the new value
    public static char[] replaceAll (char[] array, char oldValue, char newValue){

        // whenver the lement of array is mathcing with oldvalue i need to assign new value here

        for (int i = 0; i < array.length ; i++) {

            if(array[i]==oldValue){
                array[i]=newValue;
            }

        }

        return array;
    }



    //45- replace all the matching old values of the array with the new value
    public static String[] replaceAll (String[] array, String oldValue, String newValue){

        // whenver the lement of array is mathcing with oldvalue i need to assign new value here

        for (int i = 0; i < array.length ; i++) {

            if(array[i].equals(oldValue)){
                array[i]=newValue;
            }

        }

        return array;
    }


//removeDuplicate

  //46  / removes the duplicate from the given array , and returns the new array
    public static int[] removeDuplicate (int[] array){
        int[] result = {};

        for(int each:array)// for each loop gets each element from array and check if these elementd are in new array whicch is result
            if(!ArraysUtility.contains(result,each)){// as long as the result(which is the new array i declared) not contain these elements
                result= ArraysUtility.addElement(result,each);// add it to the result (which is the new array)
            }

        return  result;
    }




    //47 removes the duplicate from the given array , and returns the new array
    public static double[] removeDuplicate (double[] array){
        double[] result = {};

        for(double each:array)// for each loop gets each element from array and check if these elementd are in new array whicch is result
            if(!ArraysUtility.contains(result,each)){// as long as the result(which is the new array i declared) not contain these elements
                result= ArraysUtility.addElement(result,each);// add it to the result (which is the new array)
            }

        return  result;
    }





    //48 removes the duplicate from the given array , and returns the new array
    public static char[] removeDuplicate (char[] array){
        char[] result = {};

        for(char each:array)// for each loop gets each element from array and check if these elementd are in new array whicch is result
            if(!ArraysUtility.contains(result,each)){// as long as the result(which is the new array i declared) not contain these elements
                result= ArraysUtility.addElement(result,each);// add it to the result (which is the new array)
            }

        return  result;
    }



    //49 removes the duplicate from the given array , and returns the new array
    public static String[] removeDuplicate (String[] array){
        String[] result = {};

        for(String each:array)// for each loop gets each element from array and check if these elementd are in new array whicch is result
            if(!ArraysUtility.contains(result,each)){// as long as the result(which is the new array i declared) not contain these elements
                result= ArraysUtility.addElement(result,each);// add it to the result (which is the new array)
            }

        return  result;
    }










}

