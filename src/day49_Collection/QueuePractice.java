package day49_Collection;

import java.util.*;

public class QueuePractice {


    public static void main(String[] args) {


        Queue<Integer> priporityQueue = new PriorityQueue<>();
        priporityQueue.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("priporityQueue = " + priporityQueue);





        Queue<Integer> arrayDeuqe = new ArrayDeque<>();
        arrayDeuqe.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("arrayDeuqe = " + arrayDeuqe);
// keep insterion order


        Queue<Integer> LinkedList= new LinkedList<>();
        LinkedList.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("LinkedList = " + LinkedList);


        System.out.println("---------------");

        priporityQueue.poll();

        System.out.println(priporityQueue);


        arrayDeuqe.poll();
        System.out.println(arrayDeuqe);



        LinkedList.poll();
        System.out.println(LinkedList);



        // can i get specific element from queue ?
        // i can not apply get method
        // they do not have index number
        // i can not even call it from linkedList here because the reference type is Queue
        // i need to do downCasting if i want to call it from linkedList


       // System.out.println(priporityQueue.get(1));
     //   System.out.println(arrayDeuqe.get(1));

        System.out.println(((LinkedList)LinkedList).get(1)); // cast if to linekdList

    //    System.out.println(((List)LinkedList).get(1));
        // can be like this also

        // the get method is in linkedList object 8

    }




}
