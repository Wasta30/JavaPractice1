package Day25_CustomMethod_OverLoading;

import java.util.Arrays;
public class AddElementoArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        // call method which u created
       arr= addInteger(arr,5);

        System.out.println(Arrays.toString(arr));
        double[] arr1 ={1.1,2.2,3.3};
        arr1=addDouble(arr1,4.4);
        System.out.println(Arrays.toString(arr1));

        System.out.println("--------------------------");
       
        String[] names ={"Wasta", "Wajeeha", "Taha"};// why i have null here
      names=  addString(names, "Ebbad");

        System.out.println(Arrays.toString(names));
        
        System.out.println("-------------------------");
        char[] charcter = {'A','B','C','D'};
        charcter= addchar(charcter,'E');
        System.out.println(Arrays.toString(charcter));


    }

    // all these have same functionality
    //1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

public static int[] addInteger(int[] array, int element ) {// need to pass 2 parameter arrayband elemnt add into array
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

    public static double[] addDouble(double[] array,double element ){
        double [] result = new double[array.length+1];


        int i=0;
        for(double each:array){
            result[i++] =each;

        }
       result[i] =element;
        return result;
    }



//   3. create a return method called addString that can add a String after the last index of a String array
public static String[] addString(String[] array,String element ){
    String [] result = new String[array.length+1];


    int i=0;
    for(String each:array){
        result[i++] =each;

    }
    result[i] =element;
    return result;
}

    

//   4. create a return method called addChar that can add a char after last index of a char array


    public static char[] addchar(char[] array,char element ){
        char [] result = new char[array.length+1];


        int i=0;
        for(char each:array){
            result[i++] =each;

        }
        result[i] =element;
        return result;
    }
    // its better to apply one method name to single functionality
}
/*
Task2:
		1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

	    2. create a return method called addDouble that can add a double after the last index of a double array

	    3. create a return method called addString that can add a String after the last index of a String array

	    4. create a return method called addChar that can add a char after last index of a char array


 */