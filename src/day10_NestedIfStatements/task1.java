package day10_NestedIfStatements;

public class task1 {

    public static void main(String[] args) {



        /*
        1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */


        byte gradeLevel = 7;
        boolean ValidGradeLevel = gradeLevel >=1 && gradeLevel <=18;
        String result = "";


        if (ValidGradeLevel){
            if (gradeLevel>=1 && gradeLevel <=5){
                result = "Elementary school ";
            } else if (gradeLevel>=6 && gradeLevel<=8 ) {
                result = "Middle school";
            } else if (gradeLevel >=9 && gradeLevel<=12) {
                result = "High school";
            } else if (gradeLevel >=13 && gradeLevel<=16) {
                result = "College";
            }else {
                result = "Grad School";
            }

        }else{
            result = "Invalid Grade Level";
        }

        System.out.println(result);



    }



}
