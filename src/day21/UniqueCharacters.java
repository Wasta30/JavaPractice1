package day21;

public class UniqueCharacters {

    public static void main(String[] args) {

        // nested loop task
        // before we use for loop and hmko begining se end tk index chhaye


        String word [] = {"Wasta","Taha","Taha","Wasta","Ebbad","Jiya"};



        for (String each : word) {// each of those element
            int count = 0;
            for (String element : word) {// all element in array
                if (element.equals(each)) {
                    count++;
                }

// when inner loop excute for second third its goinf to pass one element to compare it with outer loop
            }


            if (count == 1) {
                System.out.println(each);
            }
        }









    }



}
