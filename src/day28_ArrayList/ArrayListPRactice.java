package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPRactice {


    public static void main(String[] args) {
// primitbve to wrapper class implicity : autoboxing
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)*2); // use get method to get each of the elemtn and * by 2

        }
        System.out.println(list);
        // use for loop to iterate each indexes



        /*
        {1,2,3,4,5,6}   // multipy by 2 , use hget method and set method
        // in order to use set number so use for loop
         */


        System.out.println("------------------------");
        // Remove method  : decrease size of arraylist by 1 , u can remove by passing index num or by element


        ArrayList<String> employees = new ArrayList<>();

        employees.add("Wasta");
        employees.add("Taha");
        employees.add("Jiya");
        employees.add("Ebbad");
        employees.add("Nehal");
        employees.add("Kamal");
        employees.add("Irteza");


        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);


        employees.remove(0);
        System.out.println(employees);


        employees.remove(0);
        System.out.println(employees);


        employees.remove(employees.size()-1); // reomve last index
        System.out.println(employees);
        // remove(int index)
        // remove method by index (above)

        // another emove method remove by object ( when using non primitve)

     boolean r2=   employees.remove("Kamal");// rmeoving element by ibject
        System.out.println(employees);
        System.out.println("r2 = " + r2);
// i can assign it to boolean variable , it will be true


    }








}
