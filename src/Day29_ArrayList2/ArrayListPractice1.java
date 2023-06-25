package Day29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {


    public static void main(String[] args) {

        // converting Array to arraylist



String [] countries = {"Japan","United States","Pakistan","India","Nepal","Italy","Sweden","United Kindgom"};

ArrayList<String> list = new ArrayList<>(Arrays.asList(countries)) ;


list.removeIf(p -> p.length()>=10);

// converting arraylist to array (for String datatype)

        countries =list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));


    }



}

/*
1. create an Array of string called countries
2. write a program that can remove all the country names that have length of 10 or greater
 */
