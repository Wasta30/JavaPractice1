package day09_IfStatements;

public class PositiveNegAndZero {

    public static void main(String[] args) {

        int n = 100;
        boolean positive = n > 0;
        boolean negative = n < 0; //
        boolean zero = n == 0;

if(positive){
        System.out.println("Positive");
} else if(negative) { System.out.println("Negative");
} else{ System.out.println("Zero");}
// nohing we write in else , we can have only one else block here


//

        System.out.println("---------------------------------");

    /*

        System.out.println("---------------------------------");

        if(positive){
            System.out.println("Positive");
        }

        if(negative){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

    // if & else statement we can NEVER apply for the tasks that requires more than two condition!!

     */

        // if & else statement we can NEVER apply for the tasks that requires more than two condition!!


        System.out.println("---------------");

        // number od days
        int numberOfDay = 5; // 1-7 output

        if(numberOfDay==1){
            System.out.println("Monday");
        } else if (numberOfDay==2) {
            System.out.println("Tuesday");
        } else if (numberOfDay==3) {
            System.out.println("Wednesday");
        } else if (numberOfDay==4) {
            System.out.println("Thrusday");
        } else if (numberOfDay==5) {
            System.out.println("Friday");
        } else if (numberOfDay==6){
            System.out.println("Saturday");
        } else if (numberOfDay==7) {System.out.println("Sunday");
        }else{
            System.out.println("Invalid");
        }
// another way of doing
        /*
         String day;

        if(n == 1){
            day = "Monday";
        }else if(n == 2){
            day = "Tuesday";
        }else if(n == 3){
            day = "Wednesday";
        }else if( n == 4){
            day = "Thursday";
        }else if(n == 5){
            day = "Friday";
        }else if(n==6){
            day = "Saturday";
        } else{
            day = "Sunday";
        }

        System.out.println("day = " + day);


         */

    }




}
