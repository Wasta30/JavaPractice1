package day50_CollectionContinue_Iterable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveEven {


    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,34,5,6,100,90,80,75,45,35,25,150));
        //set.removeIf(p->p%2==0);

       // System.out.println("set = " + set);


        System.out.println("----------------");


        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            if(it.next()%2==0){
                it.remove();
            }
        }

        System.out.println(set);
    }





}
