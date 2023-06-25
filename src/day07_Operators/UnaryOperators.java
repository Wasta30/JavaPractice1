package day07_Operators;

public class UnaryOperators {


    public static void main(String[] args) {

         int num1 = +25; //by default its positive , its optional
        int num2 = -25; // required to assign minus sign for negative numbers

        // increment operator everytime we apply it it increases the value by 1
        // decrement opt it decreases value by 1
        // increment operator / decrement has two type post and pre

        System.out.println(num1 < 0);
        System.out.println(num2 > 0);

        System.out.println("------------------");

        int a = 5;
        ++a; // pre increment value increase by one immediately

        System.out.println(a);

        --a; // pre decrement : decrease value by one right away
        System.out.println(a);
// post increment , ask the current value before changing
        System.out.println("---------------------");

        int b = 100;
        System.out.println(++b); //pre increment increase value by 1
        int c = 100; // post increment
        System.out.println(c++);// post increment ,it will increase the value by 1 in the next step not in this step
        System.out.println(c);// now it will give me 101
        // first pass current value then increase it in next step by 1

        System.out.println("---------------");
        int x = 200;

        System.out.println(--x);// pre decrement : value dec by 1 right away

        int y = 200;
        System.out.println(y--);// post decrement : has 2 steps , first step pass current value and change it in next step
        System.out.println(y);// now value is change by 1
        System.out.println("---------------");


        int z = 45;

        System.out.println(++z);// z= 46
        System.out.println(z++);// z=46, its 46 here because it passes the current value which is 46 in above line
        System.out.println(z); // 47 here


         int q = 30;

        System.out.println(--q);// 29
        System.out.println(q--); // 29
        System.out.println(q);// 28


        int d1 = 5;
        System.out.println(++d1);
        System.out.println(d1++);
        System.out.println(d1);
        System.out.println(d1--);
        System.out.println(--d1);
        // more often we used pre increment







    }
}
