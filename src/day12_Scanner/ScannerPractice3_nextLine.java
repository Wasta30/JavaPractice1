package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_nextLine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // next line reads everything its a special method even it reads the enter key also
        // if i print 123 i also i have to press enter and it even reads enter keys

        System.out.println("Enter Full Name");

        String fullName = scan.nextLine(); // wasta tariq Enter
        // it reads everything until u press input

        // next and next line hmko string data type deta hai isliye hmne String likha

        System.out.println("Enter Programming Langauge");
        String programming = scan.nextLine(); //java programingEnter

        System.out.println("Enter your age");
        int age = scan.nextInt(); // idhr enter ki nahi , this nextint will ignore this enter key
        // hogi and is line k bad nextline empty nae hoga to jo next step main nextline use kia usmai input nae krskte value qk hmne nextline k beech main dosra method use kia hai
// isko theek krne k liye nextInt jo use kiye uske bad nextline input krna hoga
      scan.nextLine(); // so that it will create emptiness for the next step
        System.out.println("Enter school name");
        String schoolName = scan.nextLine();

        System.out.println("fullName = " + fullName);

        System.out.println("programming = " + programming);

        System.out.println("age = " + age);

        System.out.println("schoolName = " + schoolName);

        scan.close();

        // enter key is assigned to school name because before it we use nextint method when we press enter its read b nextline and instead of school name it gives just enter

        // iska matlab jab bhi nextline k beech mai dosra method use ho usmai wo  enter ki ko read nahi krta and that
        // enter key is left in the scanner thats why school name is the e,mpty line and we put nextline
    }



}
