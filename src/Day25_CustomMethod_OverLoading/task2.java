package Day25_CustomMethod_OverLoading;

import java.util.Arrays;

public class task2 {


    public static void main(String[] args) {
        int[] maxNum = {1, 2, 3, 4, 5, 10};
        System.out.println(max(maxNum));

        double [] maxNum1 = {1.1,2.2,4.5,8.7};
        System.out.println(max(maxNum1));
        
    }

    //1. create a method that can return the max number from an integer array
    public static int max(int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    //2. create a method that can return the max number from double array

    public static double max(double[] array){

        double max =array[0];
        for (int i = 0; i < array.length ; i++) {

            if(array[i]>max){
                max=array[i];
            }


        }

return max;


    }
//3. create a method that can return the max number from long array

public static long max (long [] array){
        long max = array[0];
    for (int i = 0; i < array.length; i++) {
        if(array[i]>max){
            max=array[i];
        }
    }
        return max;
}
//4. create a method that can return the max number from short array


    public static short max (short [] array){
        short max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }


//5. create a method that can return the max number from float array
    public static float max (float [] array){
        float max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }


//6. create a method that can return the max number from byte array
    public static byte max (byte [] array){
        byte max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }



}
/*
1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array

 */