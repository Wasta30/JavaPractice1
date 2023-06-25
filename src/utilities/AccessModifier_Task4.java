package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifier_Task4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        // use AccessModifier_Task4 in print statement because child class inhert all property of parent class
       // System.out.println(AccessModifier_Task4.name1);
        System.out.println(AccessModifier_Task4.name2); // protetced is visble in subclass


        // AccessModifier_Task4.method1(); not able to inherit default method
        AccessModifier_Task4.method2();// able to access protected method




    }






}
