package day06_PrimitiveTypeCasting;

public class PrimitiveCastings {


    public static void main(String[] args) {


        byte a = 100;
        short b = a;

        byte p1 = 120;
        long p2 = p1;

        byte s7 = 90;
        double s8 = s7;

        // short b = (short)a; this is done in background

        // as long as its in the range we can caste it some thing happening in background

        // compiler converts byte into short also give it by ()

        int c = b;
        // int c = (int)b; compiler doing in back
      //  int c = (int) b;
        // gray colour says its not necessary and it will be done automatically and its called implicit casting


        long d = b;
        // (long) c background
        float e = d;

        //*** implicit casting is done as long as you are assigning smaller primitive to larger primitve

     // Explicit casting :larger primitive type can not be assigned to smaller primitive type and we have to manually assign it

        System.out.println("-----------------------");


        int x = 55;
        short y = (short)x;

      //  short y =x;  this can not be done as short have not enough range \
        // it needs to be casted manually by giving casting operator ()


        System.out.println(x + ":" + y);

        long j = 1000000;
        short k = (short) j;

       // short k = j; can not be done , must be done manually

        System.out.println(j+ ":"+k);

        double l = 2.5;
        float m = (float) l;
        System.out.println(l + ":"+m);
        double n = 10.8;
        int s = (int)n;

        double z = 3.5;

        System.out.println(n+ ":"+s);
// result for int will be 10 because it does nto contain decimal
        // shortcut for casting press Alt key with Enter or also click on bulb and see option

        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1+ ":" +s1);

        long  m1 = 30L;
        long  m2 = (short) m1; // as far as long and short both are integers we can do it

        long n1 = 10000;
        long n2 = (long) n1;

        long z5 = 4500;
        long z4 = (int)z5;

    }


}
