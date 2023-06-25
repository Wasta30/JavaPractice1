package day08_IfStatements;

public class SwapTwoVariables_WithTemporaryVariable {

    public static void main(String[] args) {


        int a = 10;
        int b = 15;
        // use a temp varaibale, a ko b banao and b ko a


        //-------------------
        int c = b; // u need this temp variable to contain the data which is about to be gone
        b = a; // now b = 10 , everytime u reassign variable old value gone
        a = c; // now as the old value of b is gone is it possible to reassign it to a ??
        // so therefore i need to store the data in another variable for ex c





        System.out.println("a = " + a);
        System.out.println("b = " + b);











    }




}
/*

1. write a program that can swipe two variables' value by using a temporary variable
		    Ex:
		        if a= 10, b=15
		    output:
		        a = 15


 		        b = 10
 */