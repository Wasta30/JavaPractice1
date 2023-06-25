package Day29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {


    public static void main(String[] args) {
        ArrayList<String> employees =new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));

        employees.retainAll( Arrays.asList("Ahmed", "David") );

        System.out.println(employees);

        System.out.println("--------------------------------------------------------------");


        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

            ArrayList<String> list1 = new ArrayList<>(Arrays.asList(names));

         list1.removeIf(p->p.charAt(0)=='M');

           names =list1.toArray(new String[0]);


        System.out.println(Arrays.toString(names));


    }






}
