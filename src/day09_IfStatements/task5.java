package day09_IfStatements;

public class task5 {

    public static void main(String[] args) {


        int age = 25;

        String result = "";




            if(age <=1 && age >= 2){
                result = "Infant";
            } else if (age >=3 && age <= 5) {
                result = "Toddler";{

            }
            } else if (age >=6 && age<=9) {
                result ="Pre-Teen";
            } else if (age>=10 && age<=12) {
                result ="Teenager";
            } else if (age >=13 && age <=17) {
                result ="Young Adult";
            } else if (age >=18 && age <=20) {
                result ="Adult";
            } else if (age >=21 && age <=39) {
                result ="Young Middle-Aged Adult";
            } else if (age >=40 && age <=49 ) {
                result ="Middle-Aged Adult ";
            } else if (age >=50 && age <=54) {
                result ="Very Young Senior Citizen";
            } else if (age >=55 && age <= 64) {
                result ="Young Senior Citizen";
            } else if (age >=65 && age <74) {
                result ="Senior Citizen";

            } else{
                result ="Old Senior Citizen";
            }

        System.out.println(result);
    }


}
/*
5. Create a class called AgeGroups, and write a program that can define the age groups of a Person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */