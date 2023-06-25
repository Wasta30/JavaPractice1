package day21;

import java.util.Arrays;

public class ArraysUtility2 {


    public static void main(String[] args) {

        //copy() : its copys element of one array to another (from index 0 to last index)
        //      starts from begining to end


        String [] students = {"Wasta","Saad","Ebbad","mehak","Jiya", "Ameen"};

        // copy first three name and put it in another array

        String[] earlybirds = Arrays.copyOf(students,5);
        // i can givve 30 also but the elemnts are not enough so we get null
        // as 30 is out of range

        // so now furst three namees are copied

        System.out.println(Arrays.toString(earlybirds));

// copyof method starts from 0 index ( means from first element)
        // if u want to copy from middle use copyofRange()



        int [] numbers = {1,2,3,4,5,6,7,8};
        numbers = Arrays.copyOf(numbers,5);
//  first argument is always the start from where u want to start and then give index where u want to stop
        // so now 5 elements are assigned to variable number

        System.out.println(Arrays.toString(numbers));


        System.out.println("-------------------------------------");


        char[] ch1 = {'A','B','C','D','E','F','G','H'};
        char [] ch2 =Arrays.copyOfRange(ch1,2,6+1);

        // 6 is eexcluded , it will copy from index 2 to 6 (and ending index :6) is excluded


        System.out.println(Arrays.toString(ch2));



        int[] score = {10,20,30,40,50,60,70,80,90,100};
       // copy from 4th to 8th elemnt and assign it to new array vraiable called result
// if last index is 9 i can give 10 also to print 9th index(or we can give length or arry also)
int[] result = Arrays.copyOfRange(score,3,8);

        System.out.println(Arrays.toString(result));
    }

}
