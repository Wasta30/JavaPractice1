package day21;

import java.util.Arrays;

public class ArraysUtility {


    public static void main(String[] args) {

        // toString(): use this method to print Array
        // convert array method to string

        int[] nums = {1,2,3,4,5};

        System.out.println(nums);
        System.out.println(nums[0]); // i can do this cuz this is int
        System.out.println(Arrays.toString(nums)); // not get hash code
// for array tostring not callled impllicitly , so we have to call it explicitly by ourslef from utlity of array andd that class is called has
        // arrays class

        String name = "Java";

        System.out.println(name); // we have method here to call an object
        // and compiler will called toString method automaically but iwth array we have to give toSting


        System.out.println("------------------------------------");


        // sort (): sorts array in asscending order (from smalles to largest)
        // what i have string so it will follow a-z order


        int[] score = {95,100,55,66,12,30};
        System.out.println(Arrays.toString(score));  // before sorting itts not in ascending order
        Arrays.sort(score); // {12,30,55,66,95,100} // samllest num at index zero

        System.out.println(Arrays.toString(score));

// help u to find minimum and maximum number by using this becayse minimum iwill always be at index zero


        System.out.println("Min Score: "+ score[0]);
        System.out.println("Max score: "+ score[score.length-1]);


        // sort method can not pass in print statemennt


        String [] names = {"Taha","Wasta","Ameen","Javeria","Areeba"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        String[] name1 = {"Anna","ANNA"};

        Arrays.sort(name1); // ANNA appear first cuz it has lower number in asci table

        System.out.println(Arrays.toString(name1));



        System.out.println("---------------------");


// equal(): when u call this mehtod u need to provide two arrays and this method compare two arrays

        int [] arr1 = {1,2,3};
        int[] arr2 = {1,3,2};

       boolean n1 = Arrays.equals(arr1,arr2); // returns true or false so assign it to boolean


        System.out.println(n1);

        Arrays.sort(arr1);// 1,2,3
        Arrays.sort(arr2);//1,2,3

      boolean n2=  Arrays.equals(arr1,arr2); // now i will get true as i sort it

        System.out.println(n2);


        System.out.println("-----------------------");


        // "acb" , "bac" check if its anagram or not
        char [] ch1 = {'a','c','b'};  // suppose that char array contain charcter of string
        char [] ch2 = {'b','a','c'};
        // Anagram : means when two string are build up of same charcters

        Arrays.sort(ch1); // {a,b,c}
        Arrays.sort(ch2);// {a,b,c}

       boolean n3 = Arrays.equals(ch1,ch2);


        System.out.println("Array is anagram: "+ n3);




        // ANAGRAM :
        // for exam if u have two string
        //listen : slient // are these words have same charcters
        // heart : earth


        System.out.println("-----------------------------");
        // copy() : its copys element of one array to another (from index 0 to last index)



    }



}
