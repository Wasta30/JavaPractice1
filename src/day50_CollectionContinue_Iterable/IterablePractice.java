package day50_CollectionContinue_Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,2,3,4,5));

        // remove all element that are less than 4 , dont use rremoveifmethod
        // iterate all element to find out which element is less than 4


        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i)<4){// to get each element use get method and pass the index number
                list.remove(i);
                // will it remove all elemnt wwhich are less than 4 ?
                // because collection size is dynamic
                // but after a element is removed will the same element was present on the same position before ? no
                //no the inndex are keep shifting and if u continue to remove it form index numbers the result will be some of the elemnt may be skip
                // so removing the element in collection without using iterable is not the proper way

            }



        }



        System.out.println(list);

/*
iterable check each element it is being removed at the same time , and it doesn not use index number
used iteratble method

allows object to be iterated using iterator
it has special method

to be able to use iterator called iterator method inherited from iterable to all collection
removing element from any collection type must use iterable
even lamba expression uses iterable

 */


        System.out.println("------------------");


        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,2,3,4,5));

        Iterator<Integer> it = list2.iterator();

        // so there are hasNext and next method in iterasble if hasNext method return u true than u can use next method to get the nexxt element so as longas the hasNext method is true i will get the next element
/*
        boolean r1 = it.hasNext();

        System.out.println(r1);

        System.out.println(it.next());


        boolean r2 = it.hasNext();

        System.out.println(r2);

        System.out.println(it.next());

        */
// use while loop , i will give


        while(it.hasNext()){// so it will automaticcally stops when the cond beecomes false
           if(it.next()<4){// so move to next element if its less than 4
               it.remove();

           }
        }

        System.out.println(list2);// so it removed element properly




        /*

        before the intelij 8 we used iterable but now we used lambda expression
        but before lambda expression the only way to remove the object from collection type by implemnationg iterable

        // how did we use removeIg method ? we used it in order to remove element duing iteration
        // the reason why we can remove element in iteration without lambda expression





         */

        System.out.println("-------------------");

        // use for loop


        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,2,3,4,5));

        for (Iterator<Integer> i =list3.iterator();i.hasNext() ;) {// no need to give (incremen and decrement because it will stop once the hasnext method becomes false

            if(i.next()<4){
                i.remove();
            }

        }

        System.out.println(list3);


        //so this is how we removed elemebts before the lmbda was introduced
        // so removeIf method is thr new iterable method of iterable interface
        // so when the lambda expression was introduced removeIf method was also introcued



        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,2,3,4,5));

        list4.removeIf(each-> each<4); // so each reprsent each element and we give cond that remove if the elemnt are less than 4
        // its same as iterator but its a simple

        System.out.println(list4);

        // removeif method is and instance method
    }




}
