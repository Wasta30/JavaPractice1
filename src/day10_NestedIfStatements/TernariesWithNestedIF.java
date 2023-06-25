package day10_NestedIfStatements;

public class TernariesWithNestedIF {
    public static void main(String[] args) {

        int s = 85; // verify if student pass or fail
       /*
        if(s >=0 && s <= 100){

            if(s > = 60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{
            System.out.println("Invalid Score");
        }

        */ // this is the nested if example in which we have pre condition



        String result = (s >=0 && s <= 100)? (s>= 60)? "Passed":"Failed":"Invalid Score";
// try not to convert nested if into ternary
        // it can be done by ternary but not readable
        System.out.println(result);

    }




}
