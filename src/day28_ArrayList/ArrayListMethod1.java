package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod1 {


    public static void main(String[] args) {


        ArrayList<String> students = new ArrayList<>();



        // Add method : use for adding element in array list , it depends on data type ex string integer ect
        // it helps ti increase size of array list

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);       // index : 0 // autoboxiing
        numbers.add(20);//1
        numbers.add(30);//2
        numbers.add(40);//3
        numbers.add(50);//4
        // another way of declaring add method
        // add(index,int)

        numbers.add(3,35);
        // give rihht index otherwise get error
    // 35 inserted to index 3 and remaing  element shift to the right
        System.out.println("numbers = " + numbers);



// SIZE method : find total number of  elemetn on arraylist

        System.out.println(numbers.size() );

// if u know total num of element subtract one to find last index

        int lastIndex = numbers.size()-1;

        System.out.println("lastIndex = " + lastIndex); // last index number


        // GET method : provide arguument and that agrument is index number
        // return u element at speciifc index

       int num=  numbers.get(3); // unboxing

        System.out.println(num);


        System.out.println("---------------------");

// loop provide index number from 0 to last index
        for (int i = 0; i < numbers.size() ; i++) {
            System.out.println(numbers.get(i));// every single element
        }


// SET method : provide 2 arguement (index number and whatever element u want to set to
// set(index, data) : replace old element with new element u gace


        System.out.println("----------------------");


        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("Ruby");
        list.add("MAtlab");

        // Set method doesnt replace size, its like replace size is not effect

        list.set(2,"JavaScript");
        list.set(0,"Wasta");


        System.out.println(list);





    }







}
