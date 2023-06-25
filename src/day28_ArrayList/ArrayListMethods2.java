package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        list.add(700);



        // remove by index
        int num =0; // wwhen removinng by using primitive
        list.remove(num);

        System.out.println(list);


        // rremove by objrct ( when pass non primitve)

        Integer num1 = 200;
       boolean r1= list.remove(num1); // list.remove(200); this is taken as int primitve (whenver u give number its taken as int primitive)
        // and this will be an wrong index number as 200 is not the index number here
     // when u give non primitbe taken as object
        // and at the end it returns boolean , cuz its return type is boolean

        System.out.println(list);
        System.out.println("r1 = " + r1);   // true , if element not in list gives false


        System.out.println("-----------------");
        // Clear method : remove everything no argumenr needed
        // size will be zero

        System.out.println(list.size());

        list.clear();
        System.out.println(list.size());
        System.out.println(list);


        System.out.println("---------------");
        // indexOf() : check element from first index
        // lastindex() : check element from last index


        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

      int a =  characters.indexOf('A');// give index number
      int b =  characters.lastIndexOf('A');

     // when indexof = lastindex charcter is unique

        System.out.println(a);
        System.out.println(b);

        System.out.println("-------------------");

        // Contains method
       boolean r2 =  characters.contains('A');
      boolean r3 =  characters.contains('Z');
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);


        System.out.println("-----------------------");
// equals MEthod
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);


        System.out.println(list1==list2); // false as it will store it in diff memory(heap)
        System.out.println(list1.equals(list2));// true

        System.out.println("------------------");
// isEmptyMEthod : checks if size is zero if size zero retruns true otherwise false

        list1.clear();
       boolean r4=  list1.isEmpty();

        System.out.println("r4 = " + r4);

        System.out.println("-----------------------");
// addAll method : add multplr element
        // Bulk Operation : in order to use bulk operation pass collectionType in argument

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(numbers);






    }






}
