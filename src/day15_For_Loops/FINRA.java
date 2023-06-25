package day15_For_Loops;

public class FINRA {

    public static void main(String[] args) {

// first create a variable which represent number from 1 to 100
       // 4 possible outcome i have it could be the number, FIN, RA, FINRA
       // any number divisble by 3 and 5 is divvisble by 15

        for(int i=1;i<=100;i++){
            if(i%15==0){// 15,30,45,60....90
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {//3,6,9...99
                System.out.print("FIN ");
            } else if (i % 5 == 0) {//5,10,15,20...100
                System.out.print("RA ");
            }else{// not divisble by 3 and 5
                System.out.print(i+" ");// i is the number
            }

        }


    }
}
/*

    2. Write a method which prints out the numbers from 1 to 100 but for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,
     for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.

        ex:
            output:
                1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN

 */