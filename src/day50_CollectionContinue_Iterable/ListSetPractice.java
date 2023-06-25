package day50_CollectionContinue_Iterable;

import java.util.*;

public class ListSetPractice {


    public static void main(String[] args) {
        
        // how to convert set into list 
        
        
        
        Set<Integer> set = new HashSet<>();
        // ddoes not avccept duplicate and doesnot ve index numner
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println("set = " + set);
        

        
        //Integer[] array =set.toArray(new Integer[0]); // i can convert set to array  by toarray method anss asssign inteeger array in the () ans assign it back

        // if u have array can u add or delete from an arraay ?
        // and u doesnt have ready method to use so instead of converting into array convert it into list using the constructor of the collection
        

       List<Integer> list= new ArrayList<>(set);
       // array list internally converted whatever object (in our case its set which is refered to new hashset) given wwith in the constructor
       // now set converted to list using constructor of the collection

        System.out.println(list);


        // nul means no object created
   //     List<String> names = null;
// when u have a null and u assign it to reference names , and u try to call any instance method from the reference u get null pointer exception
   //     System.out.println(names.size());
        // that is the reason treeset not accept null because it calls the method of the elemebt u added


        System.out.println("----------------");

//pop()



        List<Character> chars = new Stack<>();

        chars.addAll(Arrays.asList('A','B','C','D'));

        ((Stack)chars).pop();


        System.out.println(chars);// last element D will out




        //poll()



        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("Wasta","Taha","Ebbad","Jiya"));


                ((LinkedList<String>) names).poll();
        System.out.println("names = " + names); // first element will remove
        ((LinkedList<String>) names).poll();
        System.out.println("names = " + names);



    }
    
    
    
    
    
    
    
    
}
