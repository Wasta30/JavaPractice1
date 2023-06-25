package day49_Collection;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

        // import from util packg
        // if not worry about order use this , this is faster


        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("list = " + list);
    // 5th element from list
        System.out.println(list.get(4));



        System.out.println("-----------*---------------");

                // do not duplicate, set not accept duplicate , if u want to keep unique element its best to use Set
        // order is random in set
        Set<Integer> hashSet =  new HashSet<>();
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(null,null,null)); // accept only one null value , as it doesnot accept duplicate
        System.out.println("hashSet = " + hashSet);
     //   System.out.println(hashSet.get(4)); not posible to use get method
        // it accepts null value





        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        // child class of hashset :linkedhashset : maintain insertion order : what insert first
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(null,null,null));

        System.out.println("linkedHashSet = " + linkedHashSet);
        // it maintain the order , it does not change any order also, kit does not allow duplicate




         Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
       treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
       treeSet.addAll(Arrays.asList(10,200,300,40,90));
      //  treeSet.addAll(Arrays.asList(null,null,null));

        System.out.println("treeSet = " + treeSet);
        // TREE SET:
        // implemnting the sortSet : it will be sorted in ascending order also duplicate removed at same time : the smallest will be the set
        // it does not accept null keyword
        // it is very slow : performance

          //String str = null;
         //     System.out.println(str.charAt(0));

// asList method allow to convert array to list
// hashset and linkedHashset does not call the method of thre object which u stored but the treeset called the method and thats why it gives exception and do not accept null




    }




}
