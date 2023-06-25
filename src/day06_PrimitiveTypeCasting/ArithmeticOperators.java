package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println("12" + 1); // 121 , concatenation ,"12" its a string
        System.out.println(10 + 20); // 30 , addition
        System.out.println(100 - 50);// 50 , subtract
        System.out.println(10 * 5); // multiplication

        // when use division operator
        System.out.println(100.0/3);


    }


}

 /*
    + : addition
    - : subtract
    / : division
    * : multiplication
    % : reminder
     */
/*
    In maths
    10/4 = 2.5
    10/4 = 2 (java) in java 10 and 4 are int so we will get 2 and not 2.5 because 2.5 is double
 so what we have to do ? use 10.0 , but if numerator and denomerator are both int do not expect a decimal result

 */