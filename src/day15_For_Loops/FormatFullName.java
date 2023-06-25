package day15_For_Loops;

public class FormatFullName {

    public static void main(String[] args) {


String firstName = "cyDeo";
String lastName =  "SCHOOL";
// charat method returns me char and i can nnt use uper case method
        // in order to use charAt method with string i need to concante it
        // i will apply substring


  //   firstName=   firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();

        //        C                                 +   ydeo


        // charat method returns me char and i can nnt use uper case method
        // in order to use charAt method with string i need to concante it

     firstName=   (""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
                // isko phele string baanao qk charAt string nae deta


        System.out.println(firstName);

        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(lastName);

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

    }




}
/*

	3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School

 */