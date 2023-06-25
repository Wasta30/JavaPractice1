package day10_NestedIfStatements;

public class AgeGroup {

    public static void main(String[] args) {
String result = "";

        int age = 55;
if(age<21 && age >=50) {
     if(age<21){
         result = "Teenager";
     } else if (age >=21 && age <=55) {
         result = "Adult";

     }else{
         result = "Senior";
     }
}else{
result = "Invalid";

}

        System.out.println(result);

// ask this question

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