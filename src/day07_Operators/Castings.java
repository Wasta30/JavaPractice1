package day07_Operators;

public class Castings {
    public static void main(String[] args) {

        // explicit casting
        float averageScore = 20.5F; // cast float means put f always ,output is 20
        byte num1 = (byte)averageScore; // from largest to smallest put ()
        short num2 = (short) averageScore;
        int num3 = (int) averageScore;
        long num4 = (long)averageScore;
        double num5 = averageScore;
        // remember spaces are printed in double quote


        System.out.println("averageScore = " + averageScore);
        System.out.println("num1 = " + num1);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);




    }





}
/*
1. create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;
 */