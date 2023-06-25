package day07_Operators;

public class Relational_Operators {
    public static void main(String[] args) {

        // the relational operator gives us boolean (ture or false ) and the first 4 used only with numbers
        // >, >= , <, <= (first 4)
        // = use it to compare two value can be number or sentence


        boolean result1 = 200 > 40; // i will get ture or false using these operatprs
        System.out.println("result1 = " + result1);

        // >= greater than or equal has 2 conditions
// as long as one of the conditon is true it has to be greatr or equal than its ture


        boolean result2 = 300 >= 150;// true

        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100;

        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500; // false

        System.out.println("result4 = " + result4);


        // suppose u are applying for loan and u should have 720 credit score in orde to get the loan
        int YourCreditsScore = 745;

        boolean isEligibleForLoan = YourCreditsScore >= 720;// if the credit score 720 or greater than its eligible for loan

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);


        // < (less than ) operator

        boolean result5 = 100 < 200;
        System.out.println("result5 = " + result5);

        boolean result6 = 200 < 180;
        System.out.println("result6 = " + result6);

        // if the first number is less we will get true
        // for the less than eqqual operator , the first number must be les or equal to be true

        int score = 59;
        boolean hasFailed = score <= 59;
        // so the student failed because the score is 59 which is equal to
        System.out.println("hasFailed = " + hasFailed);


        boolean result7 = 45 <= 65; // we will get ture
        // the above 4 operator only apply when using numerical numbers


        System.out.println("--------------------------");

        // in java single = means u are assigning value to variable so in java if we want to apply equal operator so we will use (==)
        //

        int x = 100;
        int y = 200; // i want to verify if x is equal to y

        boolean equal = x == y; // false

        System.out.println("equal = " + equal);
        boolean result8 = "wasta" == "Good Girl"; // falsse

        System.out.println("result8 = " + result8);


        boolean result9 = 'A' == 'a'; // false

        System.out.println("result9 = " + result9);


        boolean result10 = "Java" == "Java";

        System.out.println("result10 = " + result10);
// remember if u gibe space between double quote it will give false because space is also counted


        System.out.println("--------------------");

        // Not equal (!=)

        boolean result11 = 100 != 200.5; // the two value must be sa,e type means number hon to number se compare kro string se nae

        System.out.println("result11 = " + result11);



        boolean result12 = "Java" != "Break";

        System.out.println("result12 = " + result12);
        // also we will get false if both value are equal

        boolean result13 = 300 != 300;

        System.out.println("result13 = " + result13);





    }


}
