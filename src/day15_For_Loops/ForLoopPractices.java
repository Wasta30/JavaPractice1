package day15_For_Loops;

public class ForLoopPractices {
    public static void main(String[] args) {

        // print number from 15 to 45 in same line so use print method

        for (int i = 15; i <= 45; i++) {
            System.out.print(i + " ");
        }
// anything within loop body gets printed
        System.out.println();// giving this and it will create new line because uper print method hy
        System.out.println("HEllO");
        System.out.println("------------------------------");
// can i create loop can i go bcakwards ?
// mostly use (>= , <= , >, <)
        // 100 99 98 97 96...50 , it will not go 49 cuz this will cond false
        for (int i = 100; i >= 50; i--) {
            System.out.print(i + " ");// make sure to check condition
        }
        System.out.println();// give new line
        System.out.println("----------------------");


        // print all the even numbers between one to 55
        // create loop first
        // the i variable only use inside loop body

        for (int i = 1; i <= 55; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
        System.out.println("-----------------------");

        // print all the even numbers between one to 55
        // and each time even value increase by 2,4,6,
// second solution for  even numbers
        for (int i = 2; i <= 54; i += 2) {// this i here starts from 2 so it will print 2,4,6,8..54
            System.out.print(i + " ");
        }


        /*
        A~Z
        a~z
        Z~A
        z~a
         */


    }

}
