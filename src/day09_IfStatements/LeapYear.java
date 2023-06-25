package day09_IfStatements;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2000; // apply leap year or not leap year

        boolean leapYear = year % 4 == 0; // is the year is divided by 4 and remainder is 0 we get leap year

       if (leapYear) {
            System.out.println(year + " is leap year");
        }

        if (!leapYear) {
            System.out.println(year + " is leap year");}
// rather than using two independent int statement why we use if and else ?
        // because using one independent is better, because every time u give each independent if condition java compiler has to go over every condition


            if(leapYear) {
                System.out.println(year + " is leap year");
            }else {
                System.out.println(year + " is not a leap year");
            }


        }


    }
