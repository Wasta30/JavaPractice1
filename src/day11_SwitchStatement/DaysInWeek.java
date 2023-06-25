package day11_SwitchStatement;

public class DaysInWeek {


    public static void main(String[] args) {

        // switch statement are faster than if statment
        // if statment containg == can be converted to switch statment
        // can not use boolean, long ,double,float  , it only accepts a data
        // the data is compared with every case block and the one which matches the data executed
        // every single case in switch has a unique value
// if u dontt exit the sweitch it will execute the next block into the same switch statement
// == this operator can be used only in switch statmenent
        int number = 10; // 8 possible output for days in week and one for invalid

        switch (number) { // i have to compare it with 1,2,3,4,5,6,7 and if not matching default bllock is there
            // make sure the data type u giving in case must match with data type of switch
            case 1: // value of case must be diff means agar 1 use kia to 2 kro
                System.out.println("Monday");
                break; // once the switch close put break statmet to exit

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5: // 5 matching with this number
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
               // break; // if the default block is in the end not necesaary to give break

// if none of the case block is matching for example 9 thats the time we need default block , it does not have any value it will execute when none is matching with data
    // prefered block is in the end
        } // curly braces shows switch exit


        // the reason we create switch statement is because its faster
        // every task we do with switcch can be done by if statament but not every task of if can be done on switch
        // if u dont give break next block will executed
// ternary only for if statement not for switch statement
// default is not mandatory , sirf jab kronjab koi data match na horahaho
  // default only execute when none of the case are matching
  // last block in switch does not need break statement, u cna give it or not doesnt matter
   // the rule of switch statmenet is tio have single value for long we have to use L and fro float we have to use F
        // 9L ,9F, 9.8 double, and boolean expression
   // we can use byte,int,short,char string in switch

    }

    }
