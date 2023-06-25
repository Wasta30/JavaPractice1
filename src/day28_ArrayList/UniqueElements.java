package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {


    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        list.add("Java");//0
        list.add("Java");//1
        list.add("Java");//2
        list.add("Java");//3
        list.add("Python");//4
        list.add("Java");//5
        list.add("C#");//6
        list.add("Java");//7
        list.add("C#");//8
        list.add("C#");//9
        list.add("Ruby");//10// first time apperaed and last time same

        System.out.println(list);

        ArrayList<String> unique = new ArrayList<>();
    // first find unique elemebt and add it to anothet array list unique
    // iterate list and want to acces element only we can also use forEach loop
        // cond for foreach loop : data structure



        for(String each: list) {
            if (list.indexOf(each) == list.lastIndexOf(each)){
                unique.add(each);// add mmethod to uniw
            }
        }

        System.out.println(unique);



        // Contains Method : check if specific element there or not return type boolean






    }










}
