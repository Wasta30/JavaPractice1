package day21;

public class  reverse {


    public static void main(String[] args) {



        String [] names = {"Wasta Tariq","Jiya Tariq","Taha Tariq"};


        for(String each:names){// each name, outer loop giving which sting inner loops needs to reverse
            String reversed = "";
            for (int i = each.length()-1; i >=0 ; i--) {// last index to index 0
                reversed +=each.charAt(i);
// inner loop reversing string
            }

            System.out.println(reversed);

        }




    }



}
