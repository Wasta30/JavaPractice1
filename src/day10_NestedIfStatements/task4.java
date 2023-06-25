package day10_NestedIfStatements;

public class task4 {

    public static void main(String[] args) {


        int age = 25;
        boolean AgeGroups = age < 21 || age >= 21 && age  <55 || age >=55;

        String result = "";


        if(AgeGroups){
            if(age <21){
                result = "Teenager";
            } else if (age >=21 && age <55) {
                result = " Adult ";

            }else {
                result=" Senior";
            }

        }else {
            result = "Invalid";
        }

        System.out.println(result);


    }



}
/*
4. Create a class called AgeGroups, write a program that can define the age groups of a Person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */