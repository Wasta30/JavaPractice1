package day20_Arrays;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {


        // arrays
        // one of the type of data structure
        // what  is data structture ?
        // data types , storage of data , collection of value/ data
        // why we use data structure ?
        // so if u have 20 variable ? so u have 20 data structure
        // wwould it be benefical to have one data structure tp contain all varaiable
        // data structure : to use data efficently, it allows  us to store data in an organize manner
        /// there are three data structure
        // 1:array , 2: collection , 3: map
        // array are called special type of variable because the regular variable ccontain one data at a time
        // the regggular variable can not have one data
        // String name = "wasta";
        // int num = 100; like this , all variable we declared contain one data at a time
        // array hold multiple vALUES at once for same data type , for exam 10 integers
        // if data type is int we can create array of int
        /// if data type is string we can create array of string
        // size is specified , for exam if i set the size of array is 5
        // i can not add or remove in array , size is unchangeable
        // (size fixed in array)
        // use it wth primitive and non primitive : for ex string and int
// array is ordered data structure cuz eveyr single character u are storing have index number

        // need to declare a variable by using [] , its reserved bhy array
        // bracket give it after data type and after variable name
        // new keyword use for creating objects

        // int [] score = new int[4];// size is specified
        // for exm in cydeo group there are 5 student , i dont know there name
        // so i need a variable where i can store the name of 5 students
        // so now we know how many elements an array contain ,
        // but we dont know what these elements are


        // create a variable that's cabale enough to contain 5 names
        // String mygroup [] = new String[5];
        String[] mygroup = new String[5];// in this object only 5 elements
        // the minium index num in java is 0 and can not be less than 0

// in order to print any single dimens array u can not directly pass variable name to print statement it will give u hashcode, or error

        //    System.out.println(mygroup);// hashcode
        // right way
        // i need to called a tostring method , arrays iutility
        // the class name is : array and pckkg is java.util ,
        // so i need to call this class in order to print any array

        mygroup[0] = "wasta"; // at index 0 of the element
        mygroup[1] = "jiya";// index :1
        mygroup[2] = "ameen";// 2
        mygroup[3] = "taha";// 3
        mygroup[4] = "ebbad";// 4
        // one index only have one element
        // we have 5 character so 4 index number
        System.out.println(Arrays.toString(mygroup));// "wasta","taha","jiya","ameen","ebbad"


// now the araay will print , it has five null key
        // every non primitvbe data type in java have a default value whenver no value is assign it to variable the defacult value is assigned

        // null means no object has been refered now

        // for long ,int,short,byte : default value is 0
        // for double and float its : 0.0
        // for non primitbe its : null(no object was given)
        // for boolean its:  false
// in order to assign need index number

// you will use this array when u know the size of element but dont know the what are the elements
        // if u know what are the elemnets u can assign like this
        // int [] myList = {1,2,3,4,5}
        // this will only use if u know how many elements and what are the elements

        System.out.println("-------------------------");

        // print names of dday , here i know the size of the data and what those data are/ or which element aad how many element known use it
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sundday"};
//            u can reassing something diff within brackets only and the size will be set ince u close curly braces
//            index number : 1   ,2    ,3          4,        5,         6   , 7
        // after givving element size automatically set, as we know already how many elements here

        System.out.println(Arrays.toString(days));

        int number = 5; // so if i give here index number of element while printing need to subctract one

     if(number<1 || number>7){
            System.out.println("Invalid number");
            System.exit(0);
        }
// this will give me friday cuz index number for friday is 4 so thats why subtract 1
           System.out.println(days[number-1]);
// if u are pritng element dont give array class


    }

}
