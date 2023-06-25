package day04_Variable;

public class PrimitivesIntro {
    public static void main(String[] args) {

        // primitives:
        //	int: for integers
        // long
        // short
        //	float /double: for decimals
        //	char: for single characters, ''
        //	boolean: true/false
         // String : use it for text or for sequence of character

// in order to declare a variable you need a data type
        // age = 38 years
        byte age = 38;

        // weight = 160 pounds
        // byte weight = 160;out of byte range

        short weight = 160; //  it is in short range

        // salary = 100000 $
        // short salary = 100000;out of short range
        int salary = 100_000; // its is in int range, int is the preferred data tye


        long asset = 3_333_333_333L; // use L/l for long

        // tax = 0.26
        float tax = 0.26F; // double is the preferred data type sp choose F/f

// for the integer number use int and for decimal use double

        //------------
        // There are two ways that you can assign data to char variable by numbers also
        // Ascii Table has 128 characters which
        // use single code

        char ch1 = '#';
        System.out.println("ch1 = " + ch1);
// another way to assign char variable is to use number 

        char ch2 = 36;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);
        char gender = 'F';
        char grade = 'F';
        char yesNo = 'Y';

        char ch4 = 15000;
        System.out.println("ch4 = " + ch4);

        // char ch5 = 'AB' we can not use it it has 2 character we can use it in single character

        // Boolean is used for True / False

        boolean isMarried = true;
        boolean isEmployed = false;

        boolean result = 100 > 300;

        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "Mc Lean";

        char ch5 = '+';
        System.out.println(ch5);



    }


}
