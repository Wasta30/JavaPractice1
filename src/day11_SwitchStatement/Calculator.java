package day11_SwitchStatement;

public class Calculator {


    public static void main(String[] args) {

        double n1 = 200.5,
                n2 = 10.5;

        char operator = '@';

        boolean valid = operator == '+' || operator == '-' || operator== '*' || operator == '/';

// ye valid operator hain inke ilawa koi or use hoe to use nae krrengay


        if(valid){
            switch (operator){ // the type of operator is char i can not put double here

                case '+':
                    System.out.println(n1 + n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '*':
                    System.out.println(n1*n2);
                    break;
                default:

                    System.out.println(n1/n2);

            }

        }else{
            System.out.println("Invalid Opertaor = "+operator);


        }






    }





}
/*
/*
Given two double variables n1, n2 and a char variable named operator.
use switch statement to calculate the result of n1 & n2 based on the given operator
		Valid operators are: -, +, *, /
		            @
 */
