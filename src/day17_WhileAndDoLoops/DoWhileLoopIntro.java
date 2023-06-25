package day17_WhileAndDoLoops;

public class DoWhileLoopIntro {

    public static void main(String[] args) {








        // while and do while everything is same except one thing , in do while the statement execute first then the boolean expression


// if u have false cond it will still not   gets executed in while loop

        boolean a = false;

        for (int i = 0;  a; ) {
            System.out.println("Wooden Spoon ---- for Loop");

        }




         while(a){// will not get executed , cause compiler first check the cond before executing the statement\
             System.out.println("Wooden Spoon ---- while Loop");
         }


        System.out.println("------------");

         do{
             System.out.println("Wooden Spoon-- -- do while loop");
         }while (a);

// so the only difference between while and dowhile is of execution
        // after printinng do block (which is the statement) it will check the condition
        // if the cond is true then do block is repeated again otherwise print one time

        // so interview question ???
        // which block gets executed one time even if cond is false is DOwhileloop
// so only dowhile is executed
        // 70 percent we use for loop
        // use dowhile when u want to code fragment to be executed regardless of any cond






    }




}
