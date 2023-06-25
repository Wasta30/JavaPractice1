package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String FirstName = "Wasta";
        String LastName = "Tariq";
        String fullName = FirstName + " " + LastName;
        int age = 25;
        String JobTitle = "SDET";
        String CompanyName = "Cydeo";
        double Salary = 10000.20;

        // System.out.println(FirstName + LastName);
        // in order to create a space we have to concate a " " , after the first name
// also gives the space between double quote


        System.out.println("fullName = " + fullName);


        // Full name of the Person is __________

        System.out.println("Full name of the Person is " + fullName);

        // ____ is ____ years old

        System.out.println(fullName + " is " + age + " years old");

        // ___ is JobTitle + company name
        //
        System.out.println(fullName + " is " + JobTitle +", works at "
                + CompanyName + ", and " + fullName + "'salary is $" + Salary);

    }


}
