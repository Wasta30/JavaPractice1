package day10_NestedIfStatements;

public class CharacterIdentity {


    public static void main(String[] args) {



        /*
        4. Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table

         */


        char ch = '9';
        if(ch >= '0' && ch <= '9'){
        System.out.println("Digit");
        }else if ((ch>= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){ // create cond for upper case and lower case
        System.out.println("Alphabetic");
        }else{
        System.out.println("Special Character");}

    }


}
