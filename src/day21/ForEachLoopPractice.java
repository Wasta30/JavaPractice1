package day21;

public class ForEachLoopPractice {


    public static void main(String[] args) {


        String [] words = {"Java Programming", "Cydeo School","Wooden Spoon", "Early Birds", "Angry Birds"};
        // pass the first and last character of each element
        // this each variable reprsent each variable of words(Data structure)
        for(String each : words){// here both are char so it will add use "" to do concatenation instead of additon
            System.out.println(each.charAt(0)+ ""+ each.charAt(each.length()-1));

        }


        


    }



}
