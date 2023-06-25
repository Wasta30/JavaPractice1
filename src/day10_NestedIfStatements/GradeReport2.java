package day10_NestedIfStatements;

public class GradeReport2 {

    public static void main(String[] args) {
        
        
        /*
        if(s >= 0 && s <= 100){ // if s is valid , 5 possibilites are there
            // grade could be A,B,C
            if(s>=90){ // if this condition it false when s less than 90
                        result = "Execellent";
            } else if (s >= 80) {// false : if s less than 80
              result ="Great";
            } else if (s >=70) {
               result = "Good";
            } else if (s>=60) { // i dont have to write that s is less than = to 70 cuz in the last step its already given
                result = "Passed";
            }else{
                result =  "Failed";}
        }else{ // if the s is not valid
            result = "Invalid s";
        }

        System.out.println(result);  
         */
// using ternaries on above statment

        int s = 85;
      /*  String result = (s >= 0 && s <= 100) ? (s >= 90) ? "Excellent" : (s >= 80) ? "Great"
                : (s >= 70) ? "Good" : (s >= 60) ? "Passed" : "Failed" : "Invalid";


        System.out.println(result);    */


        System.out.println("----------------------");

        // third solution hm nested if ko ternaries k sath mix krdkte


        String result2 = ""; // hmne bus mix krdia , inner if ko ternary se solve kia

        if (s >= 0 && s <= 100) {
             result2 = (s >= 90) ? "Excellent" : (s >= 80) ? "Great"
                    : (s >= 70) ? "Good" : (s >= 60) ? "Passed" : "Failed";

        } else {
            result2 = "Invalid Score";}


        System.out.println(result2);


        }


    }



