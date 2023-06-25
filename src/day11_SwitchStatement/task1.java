package day11_SwitchStatement;

public class task1 {

    public static void main(String[] args) {


        char tall ='T';
        String result = "";

        switch (tall) {

            case 'T':
                result = "price is $3.69\n90 calories ";
                break;
            case 'G':
                result = "price is $3.99;\n 120 calories";
                break;
            case 'V':
                result = "price is $4.29\n 150 calories ";
            default:
                result = "Invalid";

        }


        System.out.println(result);





    }



}
/*
asks:
	1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */