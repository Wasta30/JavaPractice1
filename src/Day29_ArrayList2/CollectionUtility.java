package Day29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 9, 8, 7,6,5,4,3,2,1));

        Collections.sort(list);

        System.out.println(list);


        System.out.println("----------------");


        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));

        Collections.reverse(list2);

        System.out.println(list2);

        System.out.println("----------------");


        ArrayList<Integer> list7 = new ArrayList<>();
        list7.addAll(Arrays.asList(1,2,3,4,5,6));

        Collections.swap(list7,1,5);


        System.out.println(list7);

        System.out.println("----------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));

        Collections.replaceAll(list4, 10, 1000);

        System.out.println(list4);

        System.out.println("-------------------------------------");

        int frequency = Collections.frequency(list4, 1000 );

        System.out.println("frequency = " + frequency);

        System.out.println("-------------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Python", "Python", "Ruby", "C#", "Java"));

        int countJava = Collections.frequency(words, "Java");
        int countPython = Collections.frequency(words, "Python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);




    }




}
