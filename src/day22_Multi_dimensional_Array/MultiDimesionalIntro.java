package day22_Multi_dimensional_Array;

import java.util.Arrays;

public class MultiDimesionalIntro {


    public static void main(String[] args) {

        // the bracket show array typpee
        // one for single dimensional array
        // we use single dimensional array to store elemnt
        // when we have 5 integars etc
        //MDA we used it when ever we are trying to store multiple aray
        // MDA allow us to store arrays
        // both of the SDA and MDA are containers but
        // SDA : container for element
        // int [] array = {10,20,30}
        //MDA: container for array
        // N-1 // if N=2 , dimensional array is 1
        // when u have dimen



        // when u have multipple single dimensional array u need 2D array


        // if u want the container fro 1 dimensional array u need 2D array

        String[]group1 ={"wasta","Taha","Ebbad"};
        String[] group2={"Jiya","Shirza","Hira"};
        String [] group3 = {"Ameen","Zakir","Obaid"};



//if u know how many array there will be but dont know exact array then declared this way
        // then whichever array that would be assign it to index
        String [][] groups = new String [3][];// i have 3 singleDA in this array
        groups[0]=group1; // multidiemnsional array allow us to store SDA
        groups[1]=group2;
        groups[2]=group3;
// first bracket : number of aray
        // second bracket : indexes inside
// toString is only for SDA
// if u want to preint 2D array u need another method


        System.out.println(Arrays.deepToString(groups));


        System.out.println("------------");

        // if we know what those arrays aray ,
        // declared this way
        // if u know exact array do this way
        //{1,2,3}
        //{4,5,6,7}
        //{8,9,10,11}
        // singleDA contain element
        //  insideSDA we have element
        // index of element 0,1,2 for first array [0]
        //              0,1,2     0,1,2,3   0,1,2,3
        int[][] arr2D={{1,2,3,},{4,5,6,7,},{8,9,10,11}};
        //                0    ,    1      ,   2  // index number of array
        // what is the length of this array ?
        // should i count array or element?
        // count array
        // frist bracket :index number of  arrau
        // second bracet : index number of elemennt

        System.out.println(Arrays.deepToString(arr2D));

// retrive array
        System.out.println(Arrays.toString(arr2D[1]));//{4,5,6,7}

        // if i find element
        System.out.println((arr2D[2][3]));// if u need specific element with in Array just declared like this

// here i give first SDA then index of element



        // if i need all element of array i will create loop
        // we will use loop to get SDA and the another loop to get elemeny




    }





}
