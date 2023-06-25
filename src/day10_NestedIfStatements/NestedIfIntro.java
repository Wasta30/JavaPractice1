package day10_NestedIfStatements;

public class NestedIfIntro {

    public static void main(String[] args) {

        // nested if is used for pre condition
        // for ex u are applying for a loan so they will check ur salary and other factors
        // whenever one condition depends on another condition thats the time we used nested if statement for ex yearonjob at least 2 years but the main thing is salary

        //------------------

        // for ex pass of fail if the score is 400 this is not valid so whenever
        // you have to check the conditionns first before the if conditon it is pre condition
        // and if u have pre cond u need to apply nested if
        // in nested if one if statemnet is inside another if statement,inner if and outer if
        //the inner and outer if can be any type of if statement can be single , if-else or multibranch, depends on the condition4

        // so pass or fail only possibe if the score i have is valid so i gave one more condition for the score being valid

        //int score = 400
        int score = 95;
        if (score >= 0 && score <= 100) { //   if the score is valid, and put the if-else statemnt under this condition
            if (score >= 60) {  // if student passed exam
                System.out.println("Passed");
            } else { // if student failed exam
                System.out.println("Failed");
            }
        } else {// if the score is not valid , what output we see is invalid
            System.out.println("Invalid Score");
        }

        // so like this one if statement is inside another if statement
        // if pre cond not true compiler wont go further
        // also give else block for nested if

        System.out.println("-------------------");


        // cheeck if Person eligible to buy alcholo
        // conditionn is age should be 21 but u must have a valid id

        int age = 21;
        boolean hasId = true;

        if (hasId) { // if Person has id
            if (age >= 21) { // the check if the Person is 21 years old
                System.out.println("Eligible to buy alcohol");
            } else {// if the Person is less than 21
                System.out.println("Not elogible");
            }

        }else{ // qk the opposite of hasID is not having Id
            System.out.println("You must have an Id to buy alcohol");

        }

        System.out.println("-----------------------");

        // name of the day

        int number = 5; //the number must be in the range of 1 to 7 as we have 7 days in a week
        if(number >=1 && number <=7) { // if the number is valid (1-7)

            if(number==1){
                System.out.println("Monday");
            } else if (number==2) {
                System.out.println("Tuesday");
            }else if (number==3) {
                System.out.println("Wednesday");
            }else if (number == 4) {
                System.out.println("Thrusday");
            }else if (number == 4) {
                System.out.println("Friday");
            }else if (number == 5) {
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");}
        } else { // if the number is not valid
            System.out.println("Invalid");}

        // and for num of days we have to use multibranch
// if pre cond not true compiler wont go further
// in order for the else block to be executed the if cond must be false

    }

    }



