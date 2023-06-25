package day51_Map;

import java.util.*;

public class MapClasses {
    /*


    growable in nature, doesnot support primitive
    in map we store one element at a time but in map we store key and value , means two value as a pair
    if i do not have id or key i have to create two array or collection but i just have to create one map , and key can not be duplicate , value can be duplicated


    hashmap
    child : linkedhashmap
    hashtable

    sortedMap : interface
    tree map :

     */


    public static void main(String[] args) {

//         key       value
        Map<Integer, String> hashMap = new HashMap<>();
        // hashmap doesnot support order
        hashMap.put(10,"Arthur");
        hashMap.put(20,"Goerge");
        hashMap.put(30,"Jack");
        hashMap.put(40,"Emma");
        hashMap.put(5,"Isabella");// it will be removed because keys can not be duplicated , and the last will be print
        // the values can be duplicated but not the key
        hashMap.put(5,"Wasta");
        hashMap.put(null,"Taha"); // accept null key and, but only one null key can be there
        hashMap.put(null,"Jiya");

      // for all the non primibvite the default value is always be null

        System.out.println("hashMap = " + hashMap);



        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();


        Map<Integer,String> treeMap = new TreeMap<>();

        Map<Integer,String> hashTable  = new Hashtable<>();


        /*
        hahsmap : performabe is fastest
        has random order
        use more often
        disadvantage : random order
         */





       // order is depend on insertion here
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(null, "Hulya");

        System.out.println("linkedHashMap = " + linkedHashMap);


// treemap : sorted order
        // the value can be null here

        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5,"Isabella");
        treeMap.put(7, null);// get null point exception here , cuz it calls method
// key can not be null here but value can be null in tree map
        System.out.println("treeMap = " + treeMap);



        // this is when u get null pointer exception
        String str = null;
        System.out.println(str.toUpperCase());


        /*
        hashtable : does not support null
        its like hashmap
        its synchronized
        and due to this this is slow
        // key and value can not be null in hashtable
         */






    }



}
