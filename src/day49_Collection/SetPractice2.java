package day49_Collection;

import java.util.*;

public class SetPractice2 {


    public static void main(String[] args) {


        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};


// i need unique element
        // create hashset
        // i am not worried about the order
        // how will i add string array into hashset (add asList)
        // array is not a collection type but u can convert it into collection by using asList method/*



        // the faster way to do it  to make object that will be eligible for garbage collection as soon as a it is finish using
        //create hashset object and convertarray to collection type

     arr=   new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]); // so now i first  convert array into collection than collection type into array by using tostring method aand assign it to the arr variable







        /*Set<String> set1 = new HashSet<>(Arrays.asList(arr));

        System.out.println("set1 = " + set1);
// convert set into array
        //called toarray metrhod and assign it to array variable

      arr=  set1.toArray(new String[0]); // i put 0 here to let it know that i want to convert it into array
        // to print array use toString mrthod
        System.out.println(Arrays.toString(arr));*/
// i used used set1 one time


        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));

// i want to remove duplicate

        // hashset : not provide order
        // linkedhashset : provide same order

       // if u want to convert arrayList into linkedhashset make sure to give cobstructore

    list = new ArrayList<>(new LinkedHashSet<>(list));
    // i used the hasset to remove duplicate and in the constructor of array list andd cpnvert it into arraylist

        System.out.println(list );

        System.out.println("--------------------");




     // remember the constructor of any collection type by default they accept another collection  type


        System.out.println("----------------");


       /*
        Given:
            Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
            return the fifth element after removing the duplicates
                        Do not change the order of the elements
         */



        Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        // i can not addd arry into collcection so converting it to collection type using asList method
      nums =  new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer [0]);
      // so we convert the hashset to array using toString method
        // we give mimimum length of array which is 0 , giving minium length is fine but maximum nahi de sktay array method to make it array ,
        // and after doing this i can reassign it to nums , and before array and linkedhashset do not have is a relation so it can not bee referenced so thats why we used to
        // the length of the arr depend upon the total number of linkedhash set

        System.out.println(Arrays.toString(nums));



        // whenever u are converting on collection type to array give 0 number


        System.out.println("------------------");


        // FREQUENCY OF CHRAacters

        String str = "eeeeeaaaabbbbccccddd";

        //  eabcd
        //  54434


        String result = ""; //e5a4b4c4d3
//  tthe linkedhashset takes each charcter of the string as an element
        // at the same time it is going to remove the duplicate
        // and each charcter of string would be each element of this linkedHashset
        // so in this linkedHashSet i have eabcd and i wanted to find out how many times theser charcters appears in the string so i applied for each loop
      /*7
        and on the rightside of the colum i gave each element
        which contain each charcter as an element
        now i have the character which is represented by each
        and now find how many times the charcter occurs in string so i used the freuwency method of collection class
        it takes two argument , one is collection type , but i have the string so i converted into an array (using the split method, it returns me string array ) and then convert array into the collection type using as List method
     so when the freq method returns me the freq , now i have the each elemnt and thier freq , i concate them and added into the result
      so first time the frew will be e and the collection freq method return me 5 and it goes on like this



       */

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += each + Collections.frequency(  Arrays.asList(str.split("")) ,  each);
        }


        System.out.println(result);


        System.out.println("---------------");




        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet","Ahmet","John","Shay","Breanna","James"));

        // rrturn third element of set
        // convert it into toarray method then u can give index number


        System.out.println(names.toArray(new String [0][2]));
        System.out.println(new ArrayList<>(names).get (2));



    }

}
/*
linkedList : only class which id implenting two classes (list and queue)

 priority Queue :
 maintainn random order
 /

 Arraydque : accept null value
 works like array bt does not have index number

 FIFO : first in first out order

 */