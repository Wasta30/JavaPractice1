package Day25_CustomMethod_OverLoading;

import java.util.Arrays;

public class task1 {

    public static void main(String[] args) {
        int[] arr1= {1,2,3};
        int[] arr2 ={4,5,6};

        int [] mergeTwoArrayint = merge(arr1,arr2);
        System.out.println(Arrays.toString(mergeTwoArrayint));

        System.out.println("-------------------------");

        String[] group1 = {"Wasta","Jiya","Taha"};
        String [] group2 = {"Ebbad","Ameen","Laiba"};

       String [] grp1grp2= merge(group1,group2);
        System.out.println(Arrays.toString(grp1grp2));


    }



//	1. create a method that can merge two integer arrays.
public static int[] merge (int[] array1,int[] arry2){

    int [] array3 = new int [array1.length+arry2.length];



    int i = 0;
    for(int each:array1){

        array3[i++] =each;


    }

    for (int each:arry2){
        array3[i++] =each;

    }
return array3;
}

//	2. create a method that can merge two double arrays.

    public static double[] merge (double[] array1,double[] arry2){

        double [] array3 = new double [array1.length+arry2.length];



        int i = 0;
        for(double each:array1){

            array3[i++] =each;


        }

        for (double each:arry2){
            array3[i++] =each;

        }
        return array3;
    }

    
//3. create a method that can merge two char arrays.

    public static char[] merge (char[] array1,char[] arry2){

        char [] array3 = new char [array1.length+arry2.length];



        int i = 0;
        for(char each:array1){

            array3[i++] =each;


        }

        for (char each:arry2){
            array3[i++] =each;

        }
        return array3;
    }





//4. create a method that can merge two String arrays.
    public static String[] merge (String[] array1,String[] arry2){

        String [] array3 = new String [array1.length+arry2.length];



        int i = 0;
        for(String each:array1){

            array3[i++] =each;


        }

        for (String each:arry2){
            array3[i++] =each;

        }
        return array3;
    }




}
/*
ask1:
	1. create a method that can merg;e two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.


Task 2:
 */