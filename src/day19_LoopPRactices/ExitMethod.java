package day19_LoopPRactices;

public class ExitMethod {

    public static void main(String[] args) {


        /*
        Branching statements:
		break: exits the loop & switch
		continue: skips the current iteration of the loop, must have a loop in orrder to use continue statement
		System.exit(0): terminates the current program, terminates the JVM
0 means that without any error
System.in : for input
System.out : for the print statement( for output)

         */


        for (int i = 0; i < 5 ; i++) {// i : 0,1,2,3,4

            if (i==3){
                // break; // terminate the loop
            // continue; // skip the current iteration
                System.exit(0);// terminates the program , when i value becomes true it will terminate and npthing will prinnt after this

            }
            System.out.println(i);
        }


        System.out.println("Wooden Spoon");
    }




}
