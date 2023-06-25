package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {


        // warmup tasks:
        //        1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators

    /*
     20 / 6 ==> 3 with the reaminder of 2


                        a = 20
                        b = 6;


                        a -= b;  // a = 14  as long as a is greater to b i can continue to subtract b from a and in the end it stop at 3rd subtraction
so this is the cond we need to subtract , and how many times i subtracted i have to count
                        a -= b;  // a = 8
                        a -= b;  // a = 2


                        x = 100;
                        y = 8;

                        while(a >= b){
                                a -= b;
                                count++;
     */



        int a = 30;// a = 30-7 = 23(1 time)
        // 23-7(2nd time) = 16-7(3rd)= 9-7=2(4th) and 2 is remaining
        int b = 7;
        // u can not use / % in this question solve it with different approach
        // cont subract b from a and count how many times u subtracted it and
        // how many times u subtracted will be the division result
        //need an variable that can count how many times b is subtarcted from a
        int count =0;// 4 ,

        // cont to subtract b from 'a' as long as b has a value of 'a'
// as long as a is greater than b cont to subtract
        while (a >=b){
            a -=b; // b subtract from a , a= a-b
            count++;
        }


        System.out.println(count+" with a remainder of "+a); // answer is 4 and remainder is the value of a which is 2 here


    }





}
