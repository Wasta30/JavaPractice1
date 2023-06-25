package Day29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,3,3,4,4,5,6,7,78,8,9));

        System.out.println(list);

list.removeAll(Arrays.asList(3,5,8));

        System.out.println(list);


        System.out.println("---------");


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700));

                numbers.retainAll(Arrays.asList(100,200,300));

        System.out.println(numbers);

        System.out.println("-----------------------------------------------");

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));

        System.out.println("------------------------------------------------------");

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list2 = new ArrayList<>( Arrays.asList(arr));

        System.out.println(list2);

        System.out.println("-----------------------------------------------------");




        int [] arr1 = {1,2,3,4,5,6};

      ArrayList<Integer> list3= new ArrayList<>(convertingArrayToArrayList(arr1));


        System.out.println(list3);











    }


public static ArrayList<Integer> convertingArrayToArrayList(int[] array){


        ArrayList<Integer> list = new ArrayList<>();

    for (int each : array) {
        list.add(each);  // add each element of array in array list
    }

return list;

}



}
