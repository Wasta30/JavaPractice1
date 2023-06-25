package day09_IfStatements;

public class task1 {

    public static void main(String[] args) {
/*
        1. Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
        Ex:
        number = 1;

        output:
        One
*/



        int number = 4;
        String result = "";
        if (number >= 1 && number <= 7) {
            if (number == 1) {
                result = "One";
            } else if (number == 2) {
                result = "two";
            } else if (number == 3) {
                result = "three";

            } else if (number == 4) {
                result = "four";

            } else if (number== 5) {
                result = "five";

            } else if (number == 6) {
                result = "six";
            }else {
                result = "seven";
            }

        } else{
            result = "Invalid";

        }

        System.out.println(result);




    }




}
