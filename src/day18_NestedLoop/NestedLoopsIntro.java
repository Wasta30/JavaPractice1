package day18_NestedLoop;

public class NestedLoopsIntro {

    public static void main(String[] args) {



        // loop that is repeating another loop is nested loop.
        // the outer loop is repetaing inner loop over and over again
        // once the inner loop cond become falls that the time the iteration of outer loop becomes start

// print wooden spoon five times, to repat 20 times u have to repeatb it 4 more times
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }


// can i still creat a statement

        System.out.println("---------------------------");
// i will create another variable lets call it j and i will be inside this loop
        for (int j = 0; j < 4; j++) {//j: 0,1,2,3,
            for (int i = 0; i <5 ; i++) {// i:0,1,2,3,4
                System.out.println("Wooden Spoon");
            }// now this will print 20 times
        }

// outer loop is repeated until the cond becomes false

    /*    Nested loop:  loop inside another loop (inner & outer loops)

        one iteration of the outer loop, executes all the iteration of the inner loop */




    }



}
