package Day25_CustomMethod_OverLoading;

import java.util.Arrays;

public class AddElementToArray_Overlaoding {


    public static void main(String[] args) {

        int [] number = {1,2,3,4,5};
        number= addElement(number,6);
        System.out.println(Arrays.toString(number));
        System.out.println("-----------------");
    char[] chars = {'A','B','C','D'};
    chars= addElement(chars,'E');
        System.out.println(Arrays.toString(chars));


        String[] names = {"Ahmed","Wasta","Jiya"};
        names = addElement(names,"Ameen");
        System.out.println(Arrays.toString(names));
        // how many diff method i have to call ? just one

    }

//  methodoverlaoding : helps to memorizze one method name
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









}
