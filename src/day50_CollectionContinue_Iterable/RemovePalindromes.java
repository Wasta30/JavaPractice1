package day50_CollectionContinue_Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {


        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam"));


        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            String each = it.next();
            String reverse ="";
            // verify if string is palindrome , use a loop from last to first index addd it to new string reverse which contains reverse version of string
            for (int i = each.length()-1; i >=0; i--) {
            reverse += each.charAt(i);
            }

            if(each.equalsIgnoreCase(reverse)){// so if each equalignorecase is the rverse verison of that string than remove it by calling remove methof from list
                it.remove();
            }

        }

        System.out.println(names);


        System.out.println("------------------------");



          /*
        Predicate<String> palindrome = str -> {
            String reverse = "";
            for(int i = str.length()-1; i >= 0; i--){
                reverse += str.charAt(i);
            }
            return reverse.equalsIgnoreCase(str);
        };
        names2.removeIf(palindrome);
         */

        /*
        names2.removeIf(str -> { String reverse = "";
            for(int i = str.length()-1; i >= 0; i--){
                reverse += str.charAt(i);
            }
            return reverse.equalsIgnoreCase(str);}
        );
        System.out.println(names2);
        */







    }




}
