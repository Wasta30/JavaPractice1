package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {
        // assignment , we can also assign the same variable in different lines
// assignment opt used to update the data, but keep in mind data  type must be same while replacing the value
        int number = 100; // now its 100
        System.out.println("number = " + number); // now its 100 in line 9

        // i can assign a different value to the same variable **

        number = 200;
        // int number is not correct it means u are trying to give another variab;e  (matlab shuro  mai int nae likhna)

        System.out.println("number = " + number); // now it will print 200


        String word = "Java Programming";

        System.out.println("word = " + word); // print java programming
        // now i want to assign a different value to the same variavle "word"

        word = "Wooden Spoon";

        System.out.println("word = " + word);
        // compiler check when was the last time compiler initalize the variaable

// after assigning the variavble  new value to phir yehi value rahaygi


        word = "cydeo";

        System.out.println("word = " + word);

        // we are just replacing the value of variable , and one variable contain one value at a time means from now on the word is cydeo

        // also i can not assign other data type to word variable for exapmle string hai to int nae krskti
        // word = 123; this is wrong i can only choose string
        // word = "123";  this is right because this is string and not other data type

        // we can only store on item in a variable , which is a container , if uwant to store another item in a container we need to replace it


        System.out.println("----------------");


        // Addition Asssignment Operater
        //  it helps  to increase the value of one variable by 10  ,20 etc
        // example below
        int x = 100;
        System.out.println("x = " + x);  // now i wnat to increase the value of x by 200 so what should be the  value of x in the end

        System.out.println(x + 200);
        // the value of x would be 300  but is it going to change the value of variable x ?
        // no it will only prints u 300  and what happens if i print the value of x again ?
        System.out.println("x = " + x); // it still gives me original  value
// x is still containg 100 , its not intializing the value of x
        // so in this case what should id do to make the value of x 300 i can assign
        // x=  x+200

        //   x = x + 200;  // now its going to give u 300 , thats how  we increase valuue of variable

        // there is a short cut for this x+
        x += 200; // in this  operator we have additon and also  have assignment

        System.out.println("x = " + x);

        // if i have string of text can i still use this operator ?

        String str = "Wooden";
        // can i do this str  +  = "spoon" , yes i can
        str += " Spoon";

        System.out.println("str = " + str);  // the output is Wooden Spoon

        double num1 = 2.5;
        System.out.println("num1 = " + num1);
        // increase the value by 5.5 so what is my expected result
        // num1 =  num1 + 5.5 , another way of writing is shown below
        num1 += 5.5; //  expected result is 8, we used addition assignmnet  operator here

        System.out.println("num1 = " + num1);

        double availableBalance = 1000.50;
        // deposit 300$ in this account
        availableBalance += 300.0;
        System.out.println("availableBalance = " + availableBalance);
        // output 1300.50

        // if u apply this operator to string it does the concatenation
        System.out.println("----------------------------");
        // what does subtract  assignment operator do  ?
        //* it does the opposite , example

        // suppose you are withdrawing 500 dollar from your  account
        // now suppose there is  a bug and instead of increasing the balance increases to 500
        // availableBalance +=500; // as a tester u can find this bug
        // so make sure to use right assignment operator
        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);
// so now the available balance is 1300.5-500 = 800.5
        //  and also this can not be  string only + can apply to string
        //  and any other shorthand operator appy to string except addtion assignment
        // Example : withdraw 200$ and deposit 400$
        availableBalance -= 200;//  now balance  is 600$ then u  deposit 400 so it will be 1000$
        availableBalance += 400;// now it will be 1000$
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("-------------------");

        // Multiplication assggniment

        double salary = 50000.50;  // suppose thisis  the current salary and after u graduated the salary will be double

        salary *=2;
        System.out.println("salary = " + salary); // output will double , it multiply value by given value

        double doge =  0.00000001;  // crypto coin, value increases by  1 million
        doge *= 1000000; // this coin increases 1 million time

        System.out.println("doge = " + doge);


        System.out.println("------------------");

        double num2 = 25000; // want to reduce this number by half
      //   num2 = num2 /2;  , this is one way
        num2 /= 2;
        System.out.println("num2 = " + num2);
        // so the shorthand operator assign a new value which we assign to it now the value of num2 is num2/2 and not 25000


        System.out.println("--------------------");

        // % remainder assignment operator : we will use it if we want to assign remainder to the variable
        double num3 = 100;

        num3 %= 3; //

        System.out.println("num3 = " + num3);

        System.out.println("------------------");

        int amount = 127; // suppose amount of cents given so this is the change u want to return 127
        // so in this case how many quators we need to return

        int quarters =amount / 25;
        int cents = amount % 25; // whatever the remainder is will give use the cents


        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);


        System.out.println("--------------------");

        int cents2 = 127;

        cents2 %=25; //
        // it is going to find reminader , and its going to assign it to cent

        System.out.println("cents2 = " + cents2);

        System.out.println("-------------------");


        int y = 300;
        // i wannt y to represnt the remainder of 300/16
        // what i have to do fot this

        y %=16;  // just need to do this

        System.out.println("y = " + y);

        System.out.println("---------------");

        int balance = 3500; // this is ur balanve and u are paying insruance lets say 153 $ each month
        // can this 153 evenly divided by 3500 , so how can i find out the leftovers
        // by using remainde r
        balance %=153;

        System.out.println("balance = " + balance);// it will stop when the left over is 134 run krky dekhna 134 aya hai means jab 134 bachainge account mai to payment rukhjaegi


    }


}
