package Day25_CustomMethod_OverLoading;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[] reverse1 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(reverse(reverse1)));

    }

//1. Create a method that can reverse an integer array

    public static int[] reverse(int[] array) {

        int[] reversed = new int[array.length];
// array index will decrease and reverse index will increase
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }
        return reversed;
    }


    //2. Create a method that can reverse a double array


    public static double[] reverse(double[] array) {
        double[] reverse = new double[array.length];
        for (int i = array.length - 1, j=0; i >= 0 ; i--, j++){

            reverse[j]=reverse[i];
            
        }

return  reverse;
    }


    
    
    //3. Create a method that can reverse a char array
    public static char[] reverse(char[] array) {
        char[] reverse = new char[array.length];
        for (int i = array.length - 1, j=0; i >= 0 ; i--, j++){

            reverse[j]=reverse[i];

        }

        return  reverse;
    }
    
}
	/*1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

 */