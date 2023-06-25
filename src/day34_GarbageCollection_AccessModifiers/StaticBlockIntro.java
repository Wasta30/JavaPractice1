package day34_GarbageCollection_AccessModifiers;

public class StaticBlockIntro {

    /*
    the static block is special block in java before java 8 u can use it to run class and ont need a main method to run class but after java 8 u need main method to run class
    th specil thing is it is the block which exeutes first even befoore the main method and it only runs one time
    the first thing which runs is static blocks in any class (if u have static block in any class)

     */

    public static void main(String[] args) {

        System.out.println("Main method");
    }// main method idhr end horaha its outside main method

        static{// runs first before anything , only runs one time
        // we can use it to intialize attributeds which has one copy only

            System.out.println("Static block");// this execute first


        }
// even if u create more than one static block they will execute first and then main method will execute








}
