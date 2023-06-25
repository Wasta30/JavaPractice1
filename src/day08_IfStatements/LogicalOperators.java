package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Steven";
        int age = 19;
        String citizen = "USA";   // i need to know if this Person is eligible to vote
        // can i create AND logic ? orr OR logic ?
         // && (AND) Logic means both , in order to apply AND logic both condition must be true
        // || : OR Logic means either , one of the conditon must be true
        //

        boolean isEligible = age >= 18 && citizen =="USA";

        // 19>= 18 = true       citizen = "UK" = false
        // in order to get the final result in AND logic true both of the statement must be true

        System.out.println(name + " is eligible to vote:" + isEligible);


        System.out.println("-------------------");

        // suppose u are applying for loan , is joshh eligible ?
        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 19;
        int income = 40000;


        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 6000;

        System.out.println(name2 + " is Eligible for loan :"+ isEligible2);

        System.out.println("---------------------------------");

        // Logical OR operator : ethier
        // ||

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        // check if this Person eligible for a course

        boolean isEligible3 = age3 >=18 && (gender == 'M' || gender== 'F');
                           // 21 > 18 &&   ( 'F' == 'M')
                          // true          false (M and F not equal ) but we will get true cuz use OR operator
                           // true         true  so end result is true
        // is this Person elgible for course : yes

        System.out.println(name3 + " is Eligible to register " +isEligible3);


        System.out.println("----------------------");

        // in order to become US citizenn

        String name4 = "James";

        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
                  //             false                      false
        // final result is false

        System.out.println(name4 + " is Eligible for citizenship :" + isEligible4);


        System.out.println("--------------------------");

        String student = "Wasta";

        double gpa = 3.5;
        int familyIncome = 40000;

        boolean isEligible5 = familyIncome <= 3500 || gpa >= 3.5;

        System.out.println(student + " is Eligible for scholarship : " +isEligible5);


        System.out.println("---------------------");
        // ! (not operator)
        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;// means not passed

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);
        // the student is either passed or failed , so failed is false because hes not failed






    }


}
