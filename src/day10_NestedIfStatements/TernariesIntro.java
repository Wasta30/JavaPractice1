package day10_NestedIfStatements;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;

        if(n%2==0){  // if reminder zero so its a even number
            System.out.println("Even "); // string data type
        }else{
            System.out.println("Odd"); // string , so when we have same data type we can apply ternaries
        }

        System.out.println("------------------------");
        String result1 = (n%2==0)? "Even" : "Odd";
                // if this conditon is true we get even otherwise we get odd

        System.out.println(result1); // to uper and neche wale dono same hy hain

//----------------------------
        /*

        int age = 23; // check if eligible to buy alcohol

        if(age >= 21){
            System.out.println("Eligible"); // string data type
        }else{
            System.out.println("Not eligible"); // string data type
        }
        */
    // so the data type is same  we can apply ternaries
// if the value is if after ? if else after colon :
        // u csan either use print statement or assign a variable , like below we can use string as data type
int age = 23;
      //  System.out.println((age >= 21) ?  "Eligible" : " not eligible");
   // the data the ternary going to return me is the string
        String  result2 = (age >= 21) ?  "Eligible" : " not eligible";

   // now just print this variable

        System.out.println(result2);


        System.out.println("-------------------------");

        // for else if statement
        // identify number is positve neg or zero

        int number = 100;
       /*
        if(number > 0){
            System.out.println("positive");
        } else if (number < 0 ) {
            System.out.println("negative");
        }else {
            System.out.println("Zero");
        }
        */


      String result3 =  (number > 0)? "Positive" :(number < 0)? "Negative" : "Zero";

        System.out.println(result3);












        }


    }







